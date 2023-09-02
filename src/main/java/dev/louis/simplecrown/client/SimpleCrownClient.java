package dev.louis.simplecrown.client;

import dev.louis.simplecrown.SimpleCrownItems;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.ArmorRenderer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

public class SimpleCrownClient implements ClientModInitializer {
    public static final EntityModelLayer CROWN_MODEL_LAYER = new EntityModelLayer(new Identifier("simplecrown", "crown"), "main");


    /**
     * Runs the mod initializer on the client environment.
     */
    @Override
    public void onInitializeClient() {
        EntityModelLayerRegistry.registerModelLayer(CROWN_MODEL_LAYER, CrownModel::getTexturedModelData);
        ArmorRenderer.register(new CrownArmorRenderer(), SimpleCrownItems.CROWN);

    }

}
