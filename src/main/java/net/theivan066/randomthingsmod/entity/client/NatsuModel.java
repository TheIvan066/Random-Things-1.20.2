package net.theivan066.randomthingsmod.entity.client;

import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.MathHelper;
import net.theivan066.randomthingsmod.entity.animations.ModAnimations;
import net.theivan066.randomthingsmod.entity.custom.NatsuEntity;

// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports
public class NatsuModel <T extends NatsuEntity> extends SinglePartEntityModel<T> {
	private final ModelPart bone;
	private final ModelPart head;
	public NatsuModel(ModelPart root) {
		this.bone = root.getChild("bone");
		this.head = bone.getChild("head");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData bone = modelPartData.addChild("bone", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData right_leg = bone.addChild("right_leg", ModelPartBuilder.create().uv(0, 16).cuboid(-5.9F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(1.9F, -12.0F, 0.0F));

		ModelPartData left_leg = bone.addChild("left_leg", ModelPartBuilder.create().uv(0, 16).mirrored().cuboid(1.9F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.pivot(-1.9F, -12.0F, 0.0F));

		ModelPartData right_arm = bone.addChild("right_arm", ModelPartBuilder.create().uv(40, 16).cuboid(-12.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(5.0F, -22.0F, 0.0F));

		ModelPartData left_arm = bone.addChild("left_arm", ModelPartBuilder.create().uv(40, 16).mirrored().cuboid(9.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.pivot(-5.0F, -22.0F, 0.0F));

		ModelPartData body = bone.addChild("body", ModelPartBuilder.create().uv(16, 16).cuboid(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -24.0F, 0.0F));

		ModelPartData head = bone.addChild("head", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -24.0F, 0.0F));

		ModelPartData head2 = head.addChild("head2", ModelPartBuilder.create().uv(0, 0).cuboid(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData headwear = head.addChild("headwear", ModelPartBuilder.create().uv(32, 0).cuboid(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new Dilation(0.5F))
		.uv(48, 47).cuboid(4.0F, -8.0F, 5.0F, 9.0F, 9.0F, -1.0F, new Dilation(0.5F))
		.uv(48, 47).mirrored().cuboid(-13.0F, -8.0F, 5.0F, 9.0F, 9.0F, -1.0F, new Dilation(0.5F)).mirrored(false)
		.uv(50, 49).mirrored().cuboid(-2.0F, -4.0F, 5.0F, 4.0F, 0.0F, -1.0F, new Dilation(0.5F)).mirrored(false)
		.uv(0, 0).cuboid(-2.0F, -4.0F, 3.0F, 4.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));
		return TexturedModelData.of(modelData, 64, 64);
	}
	@Override
	public void setAngles(NatsuEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.getPart().traverse().forEach(ModelPart::resetTransform);
		this.setHeadAngles(netHeadYaw, headPitch);

		this.animateMovement(ModAnimations.NATSU_WALK, limbSwing, limbSwingAmount, 2f, 2.5f);
		this.updateAnimation(entity.idleAnimationState, ModAnimations.NATSU_IDLE, ageInTicks, 1f);
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