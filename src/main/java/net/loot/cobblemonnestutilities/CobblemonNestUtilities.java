package net.loot.cobblemonnestutilities;

import com.cobblemon.mod.common.item.group.CobblemonItemGroups;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.registry.CompostingChanceRegistry;
import net.loot.cobblemonnestutilities.blocks.CobblemonNestUtilitiesBlocks;
import net.loot.cobblemonnestutilities.items.CobblemonNestUtilitiesItems;
import net.minecraft.item.ItemGroups;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CobblemonNestUtilities implements ModInitializer {
	public static final String MOD_ID = "cobblemonnestutilities";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// Initializing mod factories
		CobblemonNestUtilitiesItems.initialize();
		CobblemonNestUtilitiesBlocks.initialize();

		// Add composting items
		CompostingChanceRegistry.INSTANCE.add(CobblemonNestUtilitiesItems.KINGS_LEAF, 0.5f);
		CompostingChanceRegistry.INSTANCE.add(CobblemonNestUtilitiesItems.KINGS_LEAF_SEEDS, 0.3f);

		// Add items to cobblemon tabs
		ItemGroupEvents.modifyEntriesEvent(CobblemonItemGroups.getAGRICULTURE_KEY()).register(content -> {
			content.add(CobblemonNestUtilitiesItems.KINGS_LEAF);
		});
		ItemGroupEvents.modifyEntriesEvent(CobblemonItemGroups.getAGRICULTURE_KEY()).register(content -> {
			content.add(CobblemonNestUtilitiesItems.KINGS_LEAF_SEEDS);
		});
	}
}