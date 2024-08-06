package deerguy.roboticdeers.entity.client;

import deerguy.roboticdeers.entity.custom.CopperRoboticDeerEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;

import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;



public class CopperRoboticDeerModel<T extends CopperRoboticDeerEntity> extends SinglePartEntityModel<T> {
	private final ModelPart copperRoboticDeer;
	private final ModelPart head;
	public CopperRoboticDeerModel(ModelPart root) {
		this.copperRoboticDeer = root.getChild("copperRoboticDeer");
		this.head = copperRoboticDeer.getChild("bode").getChild("holehead").getChild("head");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData copperRoboticDeer = modelPartData.addChild("copperRoboticDeer", ModelPartBuilder.create(), ModelTransform.pivot(1.0F, 24.0F, 1.0F));

		ModelPartData leftleg = copperRoboticDeer.addChild("leftleg", ModelPartBuilder.create().uv(36, 38).cuboid(-1.0F, -12.0F, -3.0F, 4.0F, 11.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData jet2 = leftleg.addChild("jet2", ModelPartBuilder.create().uv(24, 18).cuboid(-2.0F, -2.0F, -4.0F, 6.0F, 2.0F, 6.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData rightleg = copperRoboticDeer.addChild("rightleg", ModelPartBuilder.create().uv(16, 42).cuboid(-1.0F, -12.0F, -3.0F, 4.0F, 11.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(-4.0F, 0.0F, 0.0F));

		ModelPartData jet = rightleg.addChild("jet", ModelPartBuilder.create().uv(24, 0).cuboid(-2.0F, -12.0F, -4.0F, 6.0F, 2.0F, 6.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 10.0F, 0.0F));

		ModelPartData lefthand = copperRoboticDeer.addChild("lefthand", ModelPartBuilder.create().uv(24, 26).cuboid(1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(2.0F, -22.0F, -1.0F));

		ModelPartData righthand = copperRoboticDeer.addChild("righthand", ModelPartBuilder.create().uv(0, 32).cuboid(-4.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(-5.0F, -22.0F, -1.0F));

		ModelPartData body = copperRoboticDeer.addChild("body", ModelPartBuilder.create().uv(0, 16).cuboid(-1.0F, -12.0F, -3.0F, 8.0F, 12.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(-4.0F, -12.0F, 0.0F));

		ModelPartData holehead = copperRoboticDeer.addChild("holehead", ModelPartBuilder.create(), ModelTransform.pivot(-4.0F, -24.0F, 0.0F));

		ModelPartData nose = holehead.addChild("nose", ModelPartBuilder.create().uv(32, 8).cuboid(1.0F, -4.0F, -5.0F, 4.0F, 3.0F, 5.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, -3.0F));

		ModelPartData eyes = holehead.addChild("eyes", ModelPartBuilder.create(), ModelTransform.pivot(-1.0F, -3.0F, -3.0F));

		ModelPartData right = eyes.addChild("right", ModelPartBuilder.create().uv(0, 18).cuboid(1.0F, -4.0F, -2.1F, 2.0F, 2.0F, 0.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData left = eyes.addChild("left", ModelPartBuilder.create().uv(0, 16).cuboid(1.0F, -4.0F, -2.1F, 2.0F, 2.0F, 0.0F, new Dilation(0.0F)), ModelTransform.pivot(4.0F, 0.0F, 0.0F));

		ModelPartData head = holehead.addChild("head", ModelPartBuilder.create().uv(0, 0).cuboid(-1.0F, -8.0F, -5.0F, 8.0F, 8.0F, 8.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData horn = copperRoboticDeer.addChild("horn", ModelPartBuilder.create().uv(20, 16).cuboid(-7.0F, -1.0F, -1.0F, 14.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(45, 26).cuboid(6.0F, -7.0F, -1.0F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F))
		.uv(4, 48).cuboid(-4.0F, -7.0F, -3.0F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F))
		.uv(32, 42).cuboid(-7.0F, -7.0F, -1.0F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 48).cuboid(3.0F, -7.0F, -3.0F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-1.0F, -32.0F, -1.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData cube_r1 = horn.addChild("cube_r1", ModelPartBuilder.create().uv(17, 32).cuboid(-4.0F, -4.0F, -1.0F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(7.0F, 1.0F, 2.0F, 3.1416F, 0.0F, 1.5708F));

		ModelPartData cube_r2 = horn.addChild("cube_r2", ModelPartBuilder.create().uv(16, 40).cuboid(-4.0F, -4.0F, -1.0F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 1.0F, 2.0F, 3.1416F, 0.0F, 1.5708F));

		ModelPartData cube_r3 = horn.addChild("cube_r3", ModelPartBuilder.create().uv(0, 0).cuboid(-4.0F, -4.0F, -3.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 3.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData cube_r4 = horn.addChild("cube_r4", ModelPartBuilder.create().uv(37, 27).cuboid(-4.0F, -4.0F, -2.0F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 3.0F, -3.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData cube_r5 = horn.addChild("cube_r5", ModelPartBuilder.create().uv(0, 4).cuboid(-4.0F, -4.0F, -3.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-7.0F, 3.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData cube_r6 = horn.addChild("cube_r6", ModelPartBuilder.create().uv(20, 18).cuboid(-4.0F, -4.0F, -1.0F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(7.0F, -3.0F, -5.0F, 3.1416F, 0.0F, 1.5708F));

		ModelPartData cube_r7 = horn.addChild("cube_r7", ModelPartBuilder.create().uv(17, 37).cuboid(-4.0F, -4.0F, -2.0F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.0F, -5.0F, 3.1416F, 0.0F, 3.1416F));

		ModelPartData cube_r8 = horn.addChild("cube_r8", ModelPartBuilder.create().uv(24, 4).cuboid(-4.0F, -4.0F, -1.0F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -3.0F, -5.0F, 3.1416F, 0.0F, 1.5708F));

		ModelPartData cube_r9 = horn.addChild("cube_r9", ModelPartBuilder.create().uv(26, 18).cuboid(-4.0F, -4.0F, -1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(24, 0).cuboid(-4.0F, -3.0F, -1.0F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-5.0F, 0.0F, -3.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData cube_r10 = horn.addChild("cube_r10", ModelPartBuilder.create().uv(24, 26).cuboid(-4.0F, -4.0F, -1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, 0.0F, -3.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData cube_r11 = horn.addChild("cube_r11", ModelPartBuilder.create().uv(24, 2).cuboid(-4.0F, -4.0F, -1.0F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-1.0F, 1.0F, -3.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData cube_r12 = horn.addChild("cube_r12", ModelPartBuilder.create().uv(24, 28).cuboid(-4.0F, -4.0F, -1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(1.0F, -2.0F, 1.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData cube_r13 = horn.addChild("cube_r13", ModelPartBuilder.create().uv(0, 32).cuboid(-4.0F, -4.0F, -1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(42, 18).cuboid(-4.0F, -3.0F, -1.0F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-8.0F, -2.0F, 1.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData cube_r14 = horn.addChild("cube_r14", ModelPartBuilder.create().uv(42, 4).cuboid(-4.0F, -4.0F, -1.0F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-10.0F, -9.0F, 1.0F, 3.1416F, 0.0F, -1.5708F));

		ModelPartData cube_r15 = horn.addChild("cube_r15", ModelPartBuilder.create().uv(24, 20).cuboid(-4.0F, -4.0F, -1.0F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(2.0F, -1.0F, 1.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData cube_r16 = horn.addChild("cube_r16", ModelPartBuilder.create().uv(41, 31).cuboid(-4.0F, -4.0F, -2.0F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-7.0F, 3.0F, -3.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData cube_r17 = horn.addChild("cube_r17", ModelPartBuilder.create().uv(41, 35).cuboid(-4.0F, -4.0F, -2.0F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-7.0F, -1.0F, -5.0F, 3.1416F, 0.0F, 3.1416F));

		ModelPartData cube_r18 = horn.addChild("cube_r18", ModelPartBuilder.create().uv(13, 33).cuboid(-4.0F, -4.0F, -3.0F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(3.0F, -1.0F, -1.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData cube_r19 = horn.addChild("cube_r19", ModelPartBuilder.create().uv(24, 22).cuboid(-4.0F, -4.0F, -1.0F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(3.0F, -9.0F, 1.0F, 3.1416F, 0.0F, -1.5708F));

		ModelPartData cube_r20 = horn.addChild("cube_r20", ModelPartBuilder.create().uv(43, 1).cuboid(-4.0F, -4.0F, -3.0F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-10.0F, -1.0F, -1.0F, 0.0F, 3.1416F, 0.0F));
		return TexturedModelData.of(modelData, 64, 64);
	}
	@Override
	public void setAngles(CopperRoboticDeerEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}
	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		copperRoboticDeer.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart getPart() {
		return copperRoboticDeer;
	}
}