package net.theivan066.randomthingsmod.mixin;


import net.minecraft.block.entity.ViewerCountManager;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.theivan066.randomthingsmod.RandomThingsMod;
import org.objectweb.asm.Opcodes;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(ViewerCountManager.class)
abstract class ChestStateManagerMixin {
    @Shadow
    protected abstract boolean isPlayerViewing(final PlayerEntity player);

    @Redirect(
        method = "updateViewerCount(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/BlockState;)V",
        require = 1, allow = 1,
        at = @At(value = "INVOKE", opcode = Opcodes.INVOKEVIRTUAL,
            target = "Lnet/minecraft/block/entity/ViewerCountManager;getInRangeViewerCount(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)I"))
    private int getReachAccountingOpenCount(final ViewerCountManager manager, final World world, final BlockPos pos) {
        return RandomThingsMod.getPlayersWithinReach(this::isPlayerViewing, world, pos.getX(), pos.getY(), pos.getZ(), 5.0).size();
    }
}
