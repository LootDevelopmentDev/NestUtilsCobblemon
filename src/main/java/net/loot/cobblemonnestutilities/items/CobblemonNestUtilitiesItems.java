package net.loot.cobblemonnestutilities.items;

import net.loot.cobblemonnestutilities.CobblemonNestUtilities;
import net.loot.cobblemonnestutilities.blocks.CobblemonNestUtilitiesBlocks;
import net.minecraft.item.AliasedBlockItem;
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
    public static final Item KINGS_LEAF_SEEDS = register("kings_leaf_seeds",
            new AliasedBlockItem(CobblemonNestUtilitiesBlocks.KINGS_LEAF_CROP, new Item.Settings()
            .maxCount(64)
    ));

    public static <T extends Item> T register(String path, T item) {
        // Item Registry
        return Registry.register(Registries.ITEM, Identifier.of(CobblemonNestUtilities.MOD_ID, path), item);
    }

    public static void initialize() {
    }
}
