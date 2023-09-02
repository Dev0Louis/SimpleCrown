package dev.louis.somecrowns;

import net.fabricmc.api.ModInitializer;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.screen.PlayerScreenHandler;

public class SomeCrowns implements ModInitializer {
    /**
     * Runs the mod initializer.
     */
    @Override
    public void onInitialize() {
        Items.register("somecrowns:crown", SomeCrownsItems.CROWN);
    }


    public static boolean isCrown(ItemStack item) {
        return isCrown(item.getItem());
    }
    public static boolean isCrown(Item item) {
        return item == SomeCrownsItems.CROWN;
    }
}
