package net.loot.cobblemonnestutilities;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.loot.cobblemonnestutilities.mixin.CobblemonNestUtilitiesLootTableProvider;

public class CobblemonNestUtilitiesDataGenerator implements DataGeneratorEntrypoint {

    @Override
    public void onInitializeDataGenerator(FabricDataGenerator generator) {
        FabricDataGenerator.Pack pack = generator.createPack();

        pack.addProvider(CobblemonNestUtilitiesLootTableProvider::new);
    }
}
