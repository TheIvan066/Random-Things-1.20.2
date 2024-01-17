package net.theivan066.randomthingsmod.mixin.client;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayerInteractionManager;
import net.theivan066.randomthingsmod.RandomThingsMod;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(ClientPlayerInteractionManager.class)
abstract class ClientPlayerInteractionManagerMixin {
    @Shadow @Final private MinecraftClient client;

    @ModifyConstant(
        method = "getReachDistance()F",
        require = 2, allow = 2, constant = { @Constant(floatValue = 5.0F), @Constant(floatValue = 4.5F) })
    private float getActualReachDistance(final float reachDistance) {
        if (this.client.player != null) {
            return (float) RandomThingsMod.getReachDistance(this.client.player, reachDistance);
        }
        return reachDistance;
    }
}
