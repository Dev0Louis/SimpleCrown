package dev.louis.somecrowns.client;

import dev.louis.somecrowns.SomeCrownsItems;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.ArmorRenderer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.minecraft.block.BeaconBlock;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.block.entity.BeaconBlockEntityRenderer;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.render.model.BakedModel;
import net.minecraft.client.render.model.BakedModelManager;
import net.minecraft.client.util.ModelIdentifier;
import net.minecraft.entity.ItemEntity;
import net.minecraft.util.Identifier;

public class SomeCrownsClient implements ClientModInitializer {
    public static final EntityModelLayer CROWN_MODEL_LAYER = new EntityModelLayer(new Identifier("somecrowns", "crown"), "main");


    /**
     * Runs the mod initializer on the client environment.
     */
    @Override
    public void onInitializeClient() {
        EntityModelLayerRegistry.registerModelLayer(CROWN_MODEL_LAYER, CrownModel::getTexturedModelData);
        ArmorRenderer.register(new CrownArmorRenderer(), SomeCrownsItems.CROWN);

    }

}
