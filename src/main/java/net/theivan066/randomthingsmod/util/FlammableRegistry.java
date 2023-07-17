package net.theivan066.randomthingsmod.util;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.theivan066.randomthingsmod.block.ModBlocks;

public class FlammableRegistry {
    public static void registerFlammableBlock() {
        FlammableBlockRegistry instance = FlammableBlockRegistry.getDefaultInstance();

        instance.add(ModBlocks.CHERRY_LOG, 5, 5);
        instance.add(ModBlocks.STRIPPED_CHERRY_LOG, 5, 5);
        instance.add(ModBlocks.CHERRY_WOOD, 5, 5);
        instance.add(ModBlocks.STRIPPED_CHERRY_WOOD, 5, 5);
        instance.add(ModBlocks.CHERRY_PLANKS, 5, 20);
        instance.add(ModBlocks.CHERRY_LEAVES, 30, 60);
        instance.add(ModBlocks.CHERRY_SLAB, 5, 20);
        instance.add(ModBlocks.CHERRY_STAIRS, 5, 20);
        instance.add(ModBlocks.CHERRY_FENCE, 5, 20);
        instance.add(ModBlocks.CHERRY_FENCE_GATE, 5, 20);
        instance.add(ModBlocks.BETA_LOG, 5, 5);
        instance.add(ModBlocks.BETA_WOOD, 5, 5);
        instance.add(ModBlocks.BETA_PLANKS, 5, 20);
        instance.add(ModBlocks.BETA_LEAVES, 30, 60);
        instance.add(ModBlocks.BANANA_TRUNK, 5, 5);
        instance.add(ModBlocks.BANANA_LEAVES, 30, 60);
        instance.add(ModBlocks.CITRUS_LOG, 5, 5);
        instance.add(ModBlocks.STRIPPED_CITRUS_LOG, 5, 5);
        instance.add(ModBlocks.CITRUS_WOOD, 5, 5);
        instance.add(ModBlocks.STRIPPED_CITRUS_WOOD, 5, 5);
        instance.add(ModBlocks.CITRUS_PLANKS, 5, 20);
        instance.add(ModBlocks.CITRUS_LEAVES, 30, 60);
        instance.add(ModBlocks.MANGO_LOG, 5, 5);
        instance.add(ModBlocks.STRIPPED_MANGO_LOG, 5, 5);
        instance.add(ModBlocks.MANGO_WOOD, 5, 5);
        instance.add(ModBlocks.STRIPPED_MANGO_WOOD, 5, 5);
        instance.add(ModBlocks.MANGO_PLANKS, 5, 20);
        instance.add(ModBlocks.MANGO_LEAVES, 30, 60);
        instance.add(ModBlocks.ORANGE_LOG, 5, 5);
        instance.add(ModBlocks.STRIPPED_ORANGE_LOG, 5, 5);
        instance.add(ModBlocks.ORANGE_WOOD, 5, 5);
        instance.add(ModBlocks.STRIPPED_ORANGE_WOOD, 5, 5);
        instance.add(ModBlocks.ORANGE_PLANKS, 5, 20);
        instance.add(ModBlocks.ORANGE_LEAVES, 30, 60);
        instance.add(ModBlocks.PEACH_LOG, 5, 5);
        instance.add(ModBlocks.STRIPPED_PEACH_LOG, 5, 5);
        instance.add(ModBlocks.PEACH_WOOD, 5, 5);
        instance.add(ModBlocks.STRIPPED_PEACH_WOOD, 5, 5);
        instance.add(ModBlocks.PEACH_PLANKS, 5, 20);
        instance.add(ModBlocks.PEACH_LEAVES, 30, 60);
        instance.add(ModBlocks.PEAR_LOG, 5, 5);
        instance.add(ModBlocks.STRIPPED_PEAR_LOG, 5, 5);
        instance.add(ModBlocks.PEAR_WOOD, 5, 5);
        instance.add(ModBlocks.STRIPPED_PEAR_WOOD, 5, 5);
        instance.add(ModBlocks.PEAR_PLANKS, 5, 20);
        instance.add(ModBlocks.PEAR_LEAVES, 30, 60);
        instance.add(ModBlocks.POMEGRANATE_LOG, 5, 5);
        instance.add(ModBlocks.STRIPPED_POMEGRANATE_LOG, 5, 5);
        instance.add(ModBlocks.POMEGRANATE_WOOD, 5, 5);
        instance.add(ModBlocks.STRIPPED_POMEGRANATE_WOOD, 5, 5);
        instance.add(ModBlocks.POMEGRANATE_PLANKS, 5, 20);
        instance.add(ModBlocks.POMEGRANATE_LEAVES, 30, 60);
    }

}
