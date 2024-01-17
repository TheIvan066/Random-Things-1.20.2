package net.theivan066.randomthingsmod.mixin;


import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.world.World;
import net.theivan066.randomthingsmod.RandomThingsMod;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(Item.class)
abstract class ItemMixin implements ItemConvertible {
    @ModifyConstant(
        method = "raycast(Lnet/minecraft/world/World;Lnet/minecraft/entity/player/PlayerEntity;Lnet/minecraft/world/RaycastContext$FluidHandling;)Lnet/minecraft/util/hit/BlockHitResult;",
        require = 4, allow = 4, constant = @Constant(doubleValue = 5.0))
    private static double getActualReachDistance(final double reachDistance, final World world, final PlayerEntity player) {
        return RandomThingsMod.getReachDistance(player, reachDistance);
    }
}
