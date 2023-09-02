package dev.louis.simplecrown.client;

import net.minecraft.client.model.*;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.util.math.MatrixStack;

// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports
public class CrownModel extends Model {
	public final ModelPart bb_main;

	public CrownModel(ModelPart root) {
		super(RenderLayer::getEntitySolid);
		this.bb_main = root.getChild("bb_main");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData bb_main = modelPartData.addChild("bb_main", ModelPartBuilder.create().uv(14, 24).cuboid(2.0F, -8.0F, -12.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
				.uv(16, 8).cuboid(-2.0F, -6.0F, -13.0F, 4.0F, 4.0F, 1.0F, new Dilation(0.0F))
				.uv(28, 19).cuboid(8.0F, -6.0F, -13.0F, 2.0F, 4.0F, 1.0F, new Dilation(0.0F))
				.uv(28, 24).cuboid(-10.0F, -6.0F, -13.0F, 2.0F, 4.0F, 1.0F, new Dilation(0.0F))
				.uv(8, 20).cuboid(0.0F, -10.0F, -12.0F, 2.0F, 4.0F, 2.0F, new Dilation(0.0F))
				.uv(20, 20).cuboid(-2.0F, -10.0F, -12.0F, 2.0F, 4.0F, 2.0F, new Dilation(0.0F))
				.uv(8, 26).cuboid(-4.0F, -8.0F, -12.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
				.uv(26, 8).cuboid(6.0F, -8.0F, -12.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
				.uv(20, 26).cuboid(-8.0F, -8.0F, -12.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
				.uv(22, 13).cuboid(-10.0F, -10.0F, -12.0F, 2.0F, 4.0F, 2.0F, new Dilation(0.0F))
				.uv(0, 24).cuboid(8.0F, -10.0F, -12.0F, 2.0F, 4.0F, 2.0F, new Dilation(0.0F))
				.uv(14, 14).cuboid(-12.0F, -12.0F, -12.0F, 2.0F, 6.0F, 2.0F, new Dilation(0.0F))
				.uv(0, 0).cuboid(-12.0F, -6.0F, -12.0F, 24.0F, 6.0F, 2.0F, new Dilation(0.0F))
				.uv(0, 8).cuboid(10.0F, -12.0F, -12.0F, 2.0F, 6.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData cube_r1 = bb_main.addChild("cube_r1", ModelPartBuilder.create().uv(0, 8).cuboid(2.0F, -12.0F, -24.0F, 2.0F, 6.0F, 2.0F, new Dilation(0.0F))
				.uv(14, 24).cuboid(-6.0F, -8.0F, -24.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
				.uv(16, 8).cuboid(-10.0F, -6.0F, -25.0F, 4.0F, 4.0F, 1.0F, new Dilation(0.0F))
				.uv(28, 19).cuboid(0.0F, -6.0F, -25.0F, 2.0F, 4.0F, 1.0F, new Dilation(0.0F))
				.uv(28, 24).cuboid(-18.0F, -6.0F, -25.0F, 2.0F, 4.0F, 1.0F, new Dilation(0.0F))
				.uv(8, 20).cuboid(-8.0F, -10.0F, -24.0F, 2.0F, 4.0F, 2.0F, new Dilation(0.0F))
				.uv(20, 20).cuboid(-10.0F, -10.0F, -24.0F, 2.0F, 4.0F, 2.0F, new Dilation(0.0F))
				.uv(8, 26).cuboid(-12.0F, -8.0F, -24.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
				.uv(26, 8).cuboid(-2.0F, -8.0F, -24.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
				.uv(20, 26).cuboid(-16.0F, -8.0F, -24.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
				.uv(22, 13).cuboid(-18.0F, -10.0F, -24.0F, 2.0F, 4.0F, 2.0F, new Dilation(0.0F))
				.uv(0, 24).cuboid(0.0F, -10.0F, -24.0F, 2.0F, 4.0F, 2.0F, new Dilation(0.0F))
				.uv(14, 14).cuboid(-20.0F, -12.0F, -24.0F, 2.0F, 6.0F, 2.0F, new Dilation(0.0F))
				.uv(0, 0).cuboid(-20.0F, -6.0F, -24.0F, 24.0F, 6.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(12.0F, 0.0F, -8.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData cube_r2 = bb_main.addChild("cube_r2", ModelPartBuilder.create().uv(0, 8).cuboid(22.0F, -12.0F, -20.0F, 2.0F, 6.0F, 2.0F, new Dilation(0.0F))
				.uv(14, 24).cuboid(14.0F, -8.0F, -20.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
				.uv(16, 8).cuboid(10.0F, -6.0F, -21.0F, 4.0F, 4.0F, 1.0F, new Dilation(0.0F))
				.uv(28, 19).cuboid(20.0F, -6.0F, -21.0F, 2.0F, 4.0F, 1.0F, new Dilation(0.0F))
				.uv(28, 24).cuboid(2.0F, -6.0F, -21.0F, 2.0F, 4.0F, 1.0F, new Dilation(0.0F))
				.uv(8, 20).cuboid(12.0F, -10.0F, -20.0F, 2.0F, 4.0F, 2.0F, new Dilation(0.0F))
				.uv(20, 20).cuboid(10.0F, -10.0F, -20.0F, 2.0F, 4.0F, 2.0F, new Dilation(0.0F))
				.uv(8, 26).cuboid(8.0F, -8.0F, -20.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
				.uv(26, 8).cuboid(18.0F, -8.0F, -20.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
				.uv(20, 26).cuboid(4.0F, -8.0F, -20.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
				.uv(22, 13).cuboid(2.0F, -10.0F, -20.0F, 2.0F, 4.0F, 2.0F, new Dilation(0.0F))
				.uv(0, 24).cuboid(20.0F, -10.0F, -20.0F, 2.0F, 4.0F, 2.0F, new Dilation(0.0F))
				.uv(14, 14).cuboid(0.0F, -12.0F, -20.0F, 2.0F, 6.0F, 2.0F, new Dilation(0.0F))
				.uv(0, 0).cuboid(0.0F, -6.0F, -20.0F, 24.0F, 6.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(12.0F, 0.0F, -8.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData cube_r3 = bb_main.addChild("cube_r3", ModelPartBuilder.create().uv(0, 8).cuboid(18.0F, -12.0F, 0.0F, 2.0F, 6.0F, 2.0F, new Dilation(0.0F))
				.uv(14, 24).cuboid(10.0F, -8.0F, 0.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
				.uv(16, 8).cuboid(6.0F, -6.0F, -1.0F, 4.0F, 4.0F, 1.0F, new Dilation(0.0F))
				.uv(28, 19).cuboid(16.0F, -6.0F, -1.0F, 2.0F, 4.0F, 1.0F, new Dilation(0.0F))
				.uv(28, 24).cuboid(-2.0F, -6.0F, -1.0F, 2.0F, 4.0F, 1.0F, new Dilation(0.0F))
				.uv(8, 20).cuboid(8.0F, -10.0F, 0.0F, 2.0F, 4.0F, 2.0F, new Dilation(0.0F))
				.uv(20, 20).cuboid(6.0F, -10.0F, 0.0F, 2.0F, 4.0F, 2.0F, new Dilation(0.0F))
				.uv(8, 26).cuboid(4.0F, -8.0F, 0.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
				.uv(26, 8).cuboid(14.0F, -8.0F, 0.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
				.uv(20, 26).cuboid(0.0F, -8.0F, 0.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
				.uv(22, 13).cuboid(-2.0F, -10.0F, 0.0F, 2.0F, 4.0F, 2.0F, new Dilation(0.0F))
				.uv(0, 24).cuboid(16.0F, -10.0F, 0.0F, 2.0F, 4.0F, 2.0F, new Dilation(0.0F))
				.uv(14, 14).cuboid(-4.0F, -12.0F, 0.0F, 2.0F, 6.0F, 2.0F, new Dilation(0.0F))
				.uv(0, 0).cuboid(-4.0F, -6.0F, 0.0F, 24.0F, 6.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(12.0F, 0.0F, -8.0F, 0.0F, -1.5708F, 0.0F));
		return TexturedModelData.of(modelData, 64, 64);
	}

	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		bb_main.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}
}