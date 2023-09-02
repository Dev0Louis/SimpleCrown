package dev.louis.somecrowns.mixin;

import dev.louis.somecrowns.SomeCrowns;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.ItemEntityRenderer;
import net.minecraft.entity.ItemEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.*;


/**
 * This is needed because rotation is broken when making a Item not despawn.
 */
@Mixin(ItemEntityRenderer.class)
public abstract class ItemEntityRendererMixin extends EntityRenderer<ItemEntity> {
    protected ItemEntityRendererMixin(EntityRendererFactory.Context ctx) {
        super(ctx);
    }


    @ModifyVariable(method = "render(Lnet/minecraft/entity/ItemEntity;FFLnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;I)V", at = @At(value = "STORE"), ordinal = 3)
    public float noRotationIfCrown(float value, ItemEntity entity) {
        if(SomeCrowns.isCrown(entity.getStack()))return 0;
        return value;
    }

    @ModifyVariable(method = "render(Lnet/minecraft/entity/ItemEntity;FFLnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;I)V", at = @At(value = "STORE"), ordinal = 5)
    public float noRotationIfCrown2(float value, ItemEntity entity) {
        if(SomeCrowns.isCrown(entity.getStack()))return 0;
        return value;
    }
}
