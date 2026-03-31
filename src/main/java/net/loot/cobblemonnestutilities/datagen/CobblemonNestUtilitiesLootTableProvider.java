package net.loot.cobblemonnestutilities.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.loot.cobblemonnestutilities.blocks.CobblemonNestUtilitiesBlocks;
import net.loot.cobblemonnestutilities.blocks.KingsLeafCrop;
import net.loot.cobblemonnestutilities.items.CobblemonNestUtilitiesItems;
import net.minecraft.loot.condition.BlockStatePropertyLootCondition;
import net.minecraft.predicate.StatePredicate;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class CobblemonNestUtilitiesLootTableProvider extends FabricBlockLootTableProvider {

    public CobblemonNestUtilitiesLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        BlockStatePropertyLootCondition.Builder builder2 = BlockStatePropertyLootCondition.builder(CobblemonNestUtilitiesBlocks.KINGS_LEAF_CROP)
                .properties(StatePredicate.Builder.create().exactMatch(KingsLeafCrop.AGE, KingsLeafCrop.MAX_AGE));
        this.addDrop(CobblemonNestUtilitiesBlocks.KINGS_LEAF_CROP, this.cropDrops(CobblemonNestUtilitiesBlocks.KINGS_LEAF_CROP, CobblemonNestUtilitiesItems.KINGS_LEAF, CobblemonNestUtilitiesItems.KINGS_LEAF_SEEDS, builder2));
    }
}
