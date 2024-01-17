package net.theivan066.randomthingsmod.entity.client;

import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.MathHelper;
import net.theivan066.randomthingsmod.entity.animations.ModAnimations;
import net.theivan066.randomthingsmod.entity.custom.ZerofourEntity;

// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports
public class ZerofourModel<T extends ZerofourEntity> extends SinglePartEntityModel<T> {
	private final ModelPart zerofour;
	private final ModelPart head;
	public ZerofourModel(ModelPart root) {
		this.zerofour = root.getChild("zerofour");
		this.head = zerofour.getChild("head");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData zerofour = modelPartData.addChild("zerofour", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData right_leg = zerofour.addChild("right_leg", ModelPartBuilder.create(), ModelTransform.pivot(-2.0F, -12.0F, 0.0F));

		ModelPartData right_leg2 = right_leg.addChild("right_leg2", ModelPartBuilder.create().uv(0, 16).cuboid(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData right_pants = right_leg.addChild("right_pants", ModelPartBuilder.create().uv(0, 32).cuboid(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.25F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData left_leg = zerofour.addChild("left_leg", ModelPartBuilder.create(), ModelTransform.pivot(2.0F, -12.0F, 0.0F));

		ModelPartData left_leg2 = left_leg.addChild("left_leg2", ModelPartBuilder.create().uv(16, 48).cuboid(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData left_pants = left_leg.addChild("left_pants", ModelPartBuilder.create().uv(0, 48).cuboid(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.25F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData right_arm = zerofour.addChild("right_arm", ModelPartBuilder.create(), ModelTransform.pivot(-5.0F, -22.0F, 0.0F));

		ModelPartData right_arm2 = right_arm.addChild("right_arm2", ModelPartBuilder.create().uv(40, 16).cuboid(-2.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData right_sleve = right_arm.addChild("right_sleve", ModelPartBuilder.create().uv(40, 32).cuboid(-2.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, new Dilation(0.25F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData left_arm = zerofour.addChild("left_arm", ModelPartBuilder.create(), ModelTransform.pivot(5.0F, -22.0F, 0.0F));

		ModelPartData left_arm2 = left_arm.addChild("left_arm2", ModelPartBuilder.create().uv(32, 48).cuboid(-1.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData left_sleve = left_arm.addChild("left_sleve", ModelPartBuilder.create().uv(48, 48).cuboid(-1.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, new Dilation(0.25F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData body = zerofour.addChild("body", ModelPartBuilder.create().uv(16, 16).cuboid(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -24.0F, 0.0F));

		ModelPartData jacket = body.addChild("jacket", ModelPartBuilder.create().uv(16, 32).cuboid(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new Dilation(0.25F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData head = zerofour.addChild("head", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -24.0F, 0.0F));

		ModelPartData head3 = head.addChild("head3", ModelPartBuilder.create().uv(0, 0).cuboid(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData headwear = head.addChild("headwear", ModelPartBuilder.create().uv(32, 0).cuboid(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new Dilation(0.5F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));
		return TexturedModelData.of(modelData, 64, 64);
	}
	@Override
	public void setAngles(ZerofourEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.getPart().traverse().forEach(ModelPart::resetTransform);
		this.setHeadAngles(netHeadYaw, headPitch);

		this.animateMovement(ModAnimations.ZEROFOUR_WALK, limbSwing, limbSwingAmount, 2f, 2.5f);
		this.updateAnimation(entity.idleAnimationState, ModAnimations.ZEROFOUR_IDLE, ageInTicks, 1f);
	}

	private void setHeadAngles(float headYaw, float headPitch) {
		headYaw = MathHelper.clamp(headYaw, -30.0F, 30.0F);
		headPitch = MathHelper.clamp(headPitch, -25.0F, 45.0F);

		this.head.yaw = headYaw * 0.017453292F;
		this.head.pitch = headPitch * 0.017453292F;
	}
	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		zerofour.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart getPart() {
		return zerofour;
	}
}