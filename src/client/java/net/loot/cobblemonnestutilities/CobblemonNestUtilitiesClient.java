package net.loot.cobblemonnestutilities;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.loot.cobblemonnestutilities.blocks.CobblemonNestUtilitiesBlocks;
import net.minecraft.client.render.RenderLayer;

public class CobblemonNestUtilitiesClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		// This entrypoint is suitable for setting up client-specific logic, such as rendering.
		BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), CobblemonNestUtilitiesBlocks.KINGS_LEAF_CROP);
	}
}