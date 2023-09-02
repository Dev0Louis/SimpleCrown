package dev.louis.simplecrown;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.*;

public class SimpleCrown implements ModInitializer {
    /**
     * Runs the mod initializer.
     */
    @Override
    public void onInitialize() {
        Items.register("simplecrown:crown", SimpleCrownItems.CROWN);
    }


    public static boolean isCrown(ItemStack item) {
        return isCrown(item.getItem());
    }
    public static boolean isCrown(Item item) {
        return item == SimpleCrownItems.CROWN;
    }
}
