package net.theivan066.randomthingsmod.entity.client;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;
import net.theivan066.randomthingsmod.RandomThingsMod;
import net.theivan066.randomthingsmod.entity.custom.MummyEntity;

public class MummyRenderer extends MobEntityRenderer<MummyEntity, MummyModel<MummyEntity>> {
    private static final Identifier TEXTURE = new Identifier(RandomThingsMod.MOD_ID, "textures/entity/mummy.png");

    public MummyRenderer(EntityRendererFactory.Context context) {
        super(context, new MummyModel<>(context.getPart(ModModelLayers.MUMMY)), 0.5f);
    }

    @Override
    public Identifier getTexture(MummyEntity entity) {
        return TEXTURE;
    }

}
