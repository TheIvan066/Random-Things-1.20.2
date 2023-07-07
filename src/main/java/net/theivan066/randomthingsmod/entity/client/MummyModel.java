package net.theivan066.randomthingsmod.entity.client;

import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import net.theivan066.randomthingsmod.RandomThingsMod;
import net.theivan066.randomthingsmod.entity.custom.MummyEntity;
import net.theivan066.randomthingsmod.entity.custom.TigerEntity;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.model.data.EntityModelData;


public class MummyModel extends GeoModel<MummyEntity> {
    @Override
    public Identifier getModelResource(MummyEntity object) {
        return new Identifier(RandomThingsMod.MOD_ID, "geo/mummy.geo.json");
    }

    @Override
    public Identifier getTextureResource(MummyEntity animatable) {
        return new Identifier(RandomThingsMod.MOD_ID, "textures/entity/mummy/mummy.png");
    }

    @Override
    public Identifier getAnimationResource(MummyEntity animatable) {
        return new Identifier(RandomThingsMod.MOD_ID, "animations/mummy.animation.json");
    }

    public void setCustomAnimations(MummyEntity animatable, long instanceId, AnimationState<MummyEntity> animationState) {
        CoreGeoBone head = getAnimationProcessor().getBone("head");

        if (head != null) {
            EntityModelData entityData = animationState.getData(DataTickets.ENTITY_MODEL_DATA);
            head.setRotX(entityData.headPitch() * MathHelper.RADIANS_PER_DEGREE);
            head.setRotY(entityData.netHeadYaw() * MathHelper.RADIANS_PER_DEGREE);
        }
    }
}
