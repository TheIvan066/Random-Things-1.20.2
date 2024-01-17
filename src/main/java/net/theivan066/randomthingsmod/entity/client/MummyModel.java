package net.theivan066.randomthingsmod.entity.client;

import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.MathHelper;
import net.theivan066.randomthingsmod.entity.animations.ModAnimations;
import net.theivan066.randomthingsmod.entity.custom.MummyEntity;

// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports
public class MummyModel<T extends MummyEntity> extends SinglePartEntityModel<T> {
	private final ModelPart bone;
	private final ModelPart head;
	public MummyModel(ModelPart root) {
		this.bone = root.getChild("bone");
		this.head = bone.getChild("head");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData bone = modelPartData.addChild("bone", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData right_leg = bone.addChild("right_leg", ModelPartBuilder.create(), ModelTransform.pivot(1.9F, -12.0F, 0.0F));

		ModelPartData right_leg_r1 = right_leg.addChild("right_leg_r1", ModelPartBuilder.create().uv(0, 16).cuboid(-4.0F, -12.0F, -2.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(-1.9F, 12.0F, 0.0F, -3.1416F, 0.0F, 3.1416F));

		ModelPartData cube_r1 = right_leg.addChild("cube_r1", ModelPartBuilder.create().uv(32, 27).cuboid(-3.0F, 3.0F, -1.0F, 1.0F, 0.0F, 1.0F, new Dilation(0.0F))
		.uv(53, 42).cuboid(0.0F, 1.0F, 2.0F, 2.0F, 0.0F, 1.0F, new Dilation(0.0F))
		.uv(32, 27).cuboid(0.0F, 9.0F, 2.0F, 1.0F, 0.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-3.8F, 0.0F, 0.0F, -3.1416F, 0.0F, 3.1416F));

		ModelPartData left_leg = bone.addChild("left_leg", ModelPartBuilder.create(), ModelTransform.pivot(-1.9F, -12.0F, 0.0F));

		ModelPartData cube_r2 = left_leg.addChild("cube_r2", ModelPartBuilder.create().uv(32, 27).cuboid(0.0F, 3.0F, -3.0F, 1.0F, 0.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -3.1416F, 0.0F, 3.1416F));

		ModelPartData left_leg_r1 = left_leg.addChild("left_leg_r1", ModelPartBuilder.create().uv(0, 16).mirrored().cuboid(0.0F, -12.0F, -2.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(1.9F, 12.0F, 0.0F, -3.1416F, 0.0F, 3.1416F));

		ModelPartData right_arm = bone.addChild("right_arm", ModelPartBuilder.create(), ModelTransform.pivot(5.0F, -22.0F, 0.0F));

		ModelPartData cube_r3 = right_arm.addChild("cube_r3", ModelPartBuilder.create().uv(32, 25).cuboid(0.0F, 8.0F, -4.0F, 1.0F, 0.0F, 2.0F, new Dilation(0.0F))
		.uv(42, 45).cuboid(-2.0F, 2.0F, -3.0F, 1.0F, 0.0F, 1.0F, new Dilation(0.0F))
		.uv(42, 45).cuboid(-1.0F, 3.0F, -4.0F, 1.0F, 0.0F, 2.0F, new Dilation(0.0F))
		.uv(32, 25).cuboid(-1.0F, 8.0F, -3.0F, 1.0F, 0.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -3.1416F, 0.0F, 3.1416F));

		ModelPartData right_arm_r1 = right_arm.addChild("right_arm_r1", ModelPartBuilder.create().uv(40, 16).cuboid(-8.0F, -24.0F, -2.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(-5.0F, 22.0F, 0.0F, -3.1416F, 0.0F, 3.1416F));

		ModelPartData left_arm = bone.addChild("left_arm", ModelPartBuilder.create(), ModelTransform.pivot(-5.0F, -22.0F, 0.0F));

		ModelPartData cube_r4 = left_arm.addChild("cube_r4", ModelPartBuilder.create().uv(39, 42).cuboid(-1.0F, 7.0F, 2.0F, 1.0F, 0.0F, 1.0F, new Dilation(0.0F))
		.uv(52, 41).cuboid(3.0F, 2.0F, 1.0F, 1.0F, 0.0F, 1.0F, new Dilation(0.0F))
		.uv(51, 34).cuboid(10.0F, 7.0F, -5.0F, 2.0F, 0.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(10.0F, 0.0F, 0.0F, -3.1416F, 0.0F, 3.1416F));

		ModelPartData left_arm_r1 = left_arm.addChild("left_arm_r1", ModelPartBuilder.create().uv(40, 16).mirrored().cuboid(4.0F, -24.0F, -2.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(5.0F, 22.0F, 0.0F, -3.1416F, 0.0F, 3.1416F));

		ModelPartData head = bone.addChild("head", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -24.0F, 0.0F));

		ModelPartData head2 = head.addChild("head2", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r5 = head2.addChild("cube_r5", ModelPartBuilder.create().uv(33, 9).cuboid(0.0F, 0.0F, 2.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(1.0F, 0.0F, 2.0F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -3.1416F, 0.0F, 3.1416F));

		ModelPartData head_r1 = head2.addChild("head_r1", ModelPartBuilder.create().uv(0, 0).cuboid(-4.0F, -32.0F, -4.0F, 8.0F, 8.0F, 8.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 24.0F, 0.0F, -3.1416F, 0.0F, 3.1416F));

		ModelPartData headwear = head.addChild("headwear", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData headwear_r1 = headwear.addChild("headwear_r1", ModelPartBuilder.create().uv(32, 0).cuboid(-4.0F, -32.0F, -4.0F, 8.0F, 8.0F, 8.0F, new Dilation(0.5F)), ModelTransform.of(0.0F, 24.0F, 0.0F, -3.1416F, 0.0F, 3.1416F));

		ModelPartData body = bone.addChild("body", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -24.0F, 0.0F));

		ModelPartData body_r1 = body.addChild("body_r1", ModelPartBuilder.create().uv(16, 16).cuboid(-4.0F, -24.0F, -2.0F, 8.0F, 12.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 24.0F, 0.0F, -3.1416F, 0.0F, 3.1416F));
		return TexturedModelData.of(modelData, 64, 64);
	}
	@Override
	public void setAngles(MummyEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.getPart().traverse().forEach(ModelPart::resetTransform);
		this.setHeadAngles(netHeadYaw, headPitch);

		this.animateMovement(ModAnimations.MUMMY_WALK, limbSwing, limbSwingAmount, 2f, 2.5f);
		this.updateAnimation(entity.idleAnimationState, ModAnimations.MUMMY_IDLE, ageInTicks, 1f);
	}

	private void setHeadAngles(float headYaw, float headPitch) {
		headYaw = MathHelper.clamp(headYaw, -30.0F, 30.0F);
		headPitch = MathHelper.clamp(headPitch, -25.0F, 45.0F);

		this.head.yaw = headYaw * 0.017453292F;
		this.head.pitch = headPitch * 0.017453292F;
	}
	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		bone.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart getPart() {
		return bone;
	}
}