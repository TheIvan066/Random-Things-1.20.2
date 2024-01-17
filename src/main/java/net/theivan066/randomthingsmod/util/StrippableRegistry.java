package net.theivan066.randomthingsmod.util;

import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.theivan066.randomthingsmod.block.ModBlocks;

public class StrippableRegistry {
    public static void registerStrippables() {
        StrippableBlockRegistry.register(ModBlocks.CHERRY_LOG, ModBlocks.STRIPPED_CHERRY_LOG);
        StrippableBlockRegistry.register(ModBlocks.CHERRY_WOOD, ModBlocks.STRIPPED_CHERRY_WOOD);
        StrippableBlockRegistry.register(ModBlocks.CITRUS_LOG, ModBlocks.STRIPPED_CITRUS_LOG);
        StrippableBlockRegistry.register(ModBlocks.CITRUS_WOOD, ModBlocks.STRIPPED_CITRUS_WOOD);
        StrippableBlockRegistry.register(ModBlocks.MANGO_LOG, ModBlocks.STRIPPED_MANGO_LOG);
        StrippableBlockRegistry.register(ModBlocks.MANGO_WOOD, ModBlocks.STRIPPED_MANGO_WOOD);
        StrippableBlockRegistry.register(ModBlocks.ORANGE_LOG, ModBlocks.STRIPPED_ORANGE_LOG);
        StrippableBlockRegistry.register(ModBlocks.ORANGE_WOOD, ModBlocks.STRIPPED_ORANGE_WOOD);
        StrippableBlockRegistry.register(ModBlocks.PEACH_LOG, ModBlocks.STRIPPED_PEACH_LOG);
        StrippableBlockRegistry.register(ModBlocks.PEACH_WOOD, ModBlocks.STRIPPED_PEACH_WOOD);
        StrippableBlockRegistry.register(ModBlocks.PEAR_LOG, ModBlocks.STRIPPED_PEAR_LOG);
        StrippableBlockRegistry.register(ModBlocks.PEAR_WOOD, ModBlocks.STRIPPED_PEAR_WOOD);
        StrippableBlockRegistry.register(ModBlocks.POMEGRANATE_LOG, ModBlocks.STRIPPED_POMEGRANATE_LOG);
        StrippableBlockRegistry.register(ModBlocks.POMEGRANATE_WOOD, ModBlocks.STRIPPED_POMEGRANATE_WOOD);
    }
}
