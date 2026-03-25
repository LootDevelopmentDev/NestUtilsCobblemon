package net.loot.cobblemonnestutilities.blocks;

import java.util.function.Function;

import net.loot.cobblemonnestutilities.CobblemonNestUtilities;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class CobblemonNestUtilitiesBlocks {

    public static final Block KINGS_LEAF_CROP = registerBlockWithoutItem("kings_leaf_crop",
            new KingsLeafCrop(AbstractBlock.Settings.create()
                    .noCollision()
                    .ticksRandomly()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.CROP)
                    .pistonBehavior(PistonBehavior.DESTROY)
            ));

    private static Block registerBlockWithoutItem(String name, Block block) {
        return Registry.register(Registries.BLOCK, Identifier.of(CobblemonNestUtilities.MOD_ID, name), block);
    }

    public static void initialize() {
    }
}
