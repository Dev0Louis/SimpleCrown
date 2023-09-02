package dev.louis.simplecrown.client;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.ArmorRenderer;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.model.Model;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.model.BipedEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class CrownArmorRenderer implements ArmorRenderer {
    private static final Identifier TEXTURE = new Identifier("simplecrown", "textures/armor/crown.png");
    Model crownArmorModel;

    @Override
    public void render(MatrixStack matrices, VertexConsumerProvider vertexConsumers, ItemStack stack, LivingEntity entity, EquipmentSlot slot, int light, BipedEntityModel<LivingEntity> contextModel) {
        if (crownArmorModel == null) {
            crownArmorModel = new CrownModel(MinecraftClient.getInstance().getEntityModelLoader().getModelPart(SimpleCrownClient.CROWN_MODEL_LAYER));
        }

        matrices.push();
        contextModel.head.rotate(matrices);
        float scale = entity.isBaby() ? 0.3f : 0.4f;
        double y = entity.isBaby() ? 0 : -2.25;
        matrices.scale(scale, scale, scale);
        matrices.translate(0, y, 0);
        ArmorRenderer.renderPart(matrices, vertexConsumers, light, stack, crownArmorModel, TEXTURE);
        matrices.pop();
    }

}
