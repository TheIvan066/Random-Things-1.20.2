package net.theivan066.randomthingsmod.entity.client;

import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;
import net.theivan066.randomthingsmod.RandomThingsMod;
import net.theivan066.randomthingsmod.entity.custom.MummyEntity;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class MummyRenderer extends GeoEntityRenderer<MummyEntity> {
    public MummyRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new MummyModel());
        this.shadowRadius = 1f;
    }

    @Override
    public Identifier getTextureLocation(MummyEntity instance) {
        return new Identifier(RandomThingsMod.MOD_ID, "textures/entity/mummy/mummy.png");
    }

    @Override
    public RenderLayer getRenderType(MummyEntity animatable, Identifier texture, @Nullable VertexConsumerProvider bufferSource, float partialTick) {
        return super.getRenderType(animatable, texture, bufferSource, partialTick);
    }
}
