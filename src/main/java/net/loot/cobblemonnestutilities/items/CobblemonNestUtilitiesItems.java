package net.loot.cobblemonnestutilities.items;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static net.minecraft.item.Items.register;

public final class CobblemonNestUtilitiesItems {
    private CobblemonNestUtilitiesItems() {}

    // Item Instances
    public static final Item KINGS_LEAF = register("kings_leaf", new Item(new Item.Settings()
            .maxCount(64)
    ));

    public static <T extends Item> T register(String path, T item) {
        // Item Registry
        return Registry.register(Registries.ITEM, Identifier.of("cobblemonnestutilities", path), item);
    }

    public static void initialize() {
    }
}
