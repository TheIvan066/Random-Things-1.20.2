package net.theivan066.randomthingsmod.util;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.minecraft.item.Items;
import net.theivan066.randomthingsmod.RandomThingsMod;
import net.theivan066.randomthingsmod.block.ModBlocks;
import net.theivan066.randomthingsmod.entity.ModEntities;
import net.theivan066.randomthingsmod.entity.custom.*;
import net.theivan066.randomthingsmod.item.ModItems;

public class ModRegistries {
    public static void registerModStuffs() {
        registerFuels();
        registerStrippables();
        registerFlammableBlock();
        registerAttributes();
    }

    private static void registerFuels() {
        RandomThingsMod.LOGGER.info("Registering Fuels for" + RandomThingsMod.MOD_ID);
        FuelRegistry registry = FuelRegistry.INSTANCE;

        registry.add(ModItems.INFINI_FUEL, 2147483647);

        registry.add(Items.DRIED_KELP, 200);
        registry.add(Items.NETHER_BRICK, 20);
        registry.add(Items.RED_NETHER_BRICKS, 40);
        registry.add(Items.RED_NETHER_BRICK_WALL, 40);
        registry.add(Items.RED_NETHER_BRICK_STAIRS, 40);
        registry.add(Items.RED_NETHER_BRICK_SLAB, 20);
        registry.add(Items.NETHER_BRICKS, 80);
        registry.add(Items.NETHER_BRICK_STAIRS, 80);
        registry.add(Items.NETHER_BRICK_WALL, 80);
        registry.add(Items.NETHER_BRICK_SLAB, 40);
        registry.add(Items.NETHER_BRICK_FENCE, 60);
        registry.add(Items.MUSHROOM_STEM, 240);
        registry.add(Items.BROWN_MUSHROOM_BLOCK, 240);
        registry.add(Items.RED_MUSHROOM_BLOCK, 240);
        registry.add(Items.BEE_NEST, 200);
        registry.add(Items.BEEHIVE, 200);
        registry.add(Items.BARREL, 300);
        registry.add(Items.BIRCH_BOAT, 1200);
        registry.add(Items.OAK_BOAT, 1200);
        registry.add(Items.DARK_OAK_BOAT, 1200);
        registry.add(Items.ACACIA_BOAT, 1200);
        registry.add(Items.JUNGLE_BOAT, 1200);
        registry.add(Items.SPRUCE_BOAT, 1200);
        registry.add(Items.BOWL, 100);
        registry.add(Items.BIRCH_LEAVES, 60);
        registry.add(Items.OAK_LEAVES, 60);
        registry.add(Items.DARK_OAK_LEAVES, 60);
        registry.add(Items.ACACIA_LEAVES, 60);
        registry.add(Items.JUNGLE_LEAVES, 60);
        registry.add(Items.SPRUCE_LEAVES, 60);
        registry.add(Items.BLAZE_POWDER, 1200);

        registry.add(ModBlocks.CHERRY_LOG, 300);
        registry.add(ModBlocks.STRIPPED_CHERRY_LOG, 300);
        registry.add(ModBlocks.CHERRY_WOOD, 300);
        registry.add(ModBlocks.STRIPPED_CHERRY_WOOD, 300);
        registry.add(ModBlocks.CHERRY_PLANKS, 300);
        registry.add(ModBlocks.CHERRY_LEAVES, 60);
        registry.add(ModBlocks.CHERRY_SLAB, 150);
        registry.add(ModBlocks.CHERRY_STAIRS, 300);
        registry.add(ModBlocks.CHERRY_FENCE, 300);
        registry.add(ModBlocks.CHERRY_FENCE_GATE, 300);
        registry.add(ModBlocks.BETA_LOG, 300);
        registry.add(ModBlocks.BETA_WOOD, 300);
        registry.add(ModBlocks.BETA_PLANKS, 300);
        registry.add(ModBlocks.BETA_LEAVES, 60);
        registry.add(ModBlocks.BANANA_TRUNK, 300);
        registry.add(ModBlocks.BANANA_LEAVES, 60);
        registry.add(ModBlocks.CITRUS_LOG, 300);
        registry.add(ModBlocks.STRIPPED_CITRUS_LOG, 300);
        registry.add(ModBlocks.CITRUS_WOOD, 300);
        registry.add(ModBlocks.STRIPPED_CITRUS_WOOD, 300);
        registry.add(ModBlocks.CITRUS_PLANKS, 300);
        registry.add(ModBlocks.CITRUS_LEAVES, 60);
        registry.add(ModBlocks.MANGO_LOG, 300);
        registry.add(ModBlocks.STRIPPED_MANGO_LOG, 300);
        registry.add(ModBlocks.MANGO_WOOD, 300);
        registry.add(ModBlocks.STRIPPED_MANGO_WOOD, 300);
        registry.add(ModBlocks.MANGO_PLANKS, 300);
        registry.add(ModBlocks.MANGO_LEAVES, 60);
        registry.add(ModBlocks.ORANGE_LOG, 300);
        registry.add(ModBlocks.STRIPPED_ORANGE_LOG, 300);
        registry.add(ModBlocks.ORANGE_WOOD, 300);
        registry.add(ModBlocks.STRIPPED_ORANGE_WOOD, 300);
        registry.add(ModBlocks.ORANGE_PLANKS, 300);
        registry.add(ModBlocks.ORANGE_LEAVES, 60);
        registry.add(ModBlocks.PEACH_LOG, 300);
        registry.add(ModBlocks.STRIPPED_PEACH_LOG, 300);
        registry.add(ModBlocks.PEACH_WOOD, 300);
        registry.add(ModBlocks.STRIPPED_PEACH_WOOD, 300);
        registry.add(ModBlocks.PEACH_PLANKS, 300);
        registry.add(ModBlocks.PEACH_LEAVES, 60);
        registry.add(ModBlocks.PEAR_LOG, 300);
        registry.add(ModBlocks.STRIPPED_PEAR_LOG, 300);
        registry.add(ModBlocks.PEAR_WOOD, 300);
        registry.add(ModBlocks.STRIPPED_PEAR_WOOD, 300);
        registry.add(ModBlocks.PEAR_PLANKS, 300);
        registry.add(ModBlocks.PEAR_LEAVES, 60);
        registry.add(ModBlocks.POMEGRANATE_LOG, 300);
        registry.add(ModBlocks.STRIPPED_POMEGRANATE_LOG, 300);
        registry.add(ModBlocks.POMEGRANATE_WOOD, 300);
        registry.add(ModBlocks.STRIPPED_POMEGRANATE_WOOD, 300);
        registry.add(ModBlocks.POMEGRANATE_PLANKS, 300);
        registry.add(ModBlocks.POMEGRANATE_LEAVES, 60);
    }
    private static void registerStrippables() {
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

    private static void registerFlammableBlock() {
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

    private static void registerAttributes() {
        FabricDefaultAttributeRegistry.register(ModEntities.MUMMY, MummyEntity.setAttributes());
        FabricDefaultAttributeRegistry.register(ModEntities.NATSU, NatsuEntity.setAttributes());
        FabricDefaultAttributeRegistry.register(ModEntities.ZEROFOUR, ZerofourEntity.setAttributes());
        FabricDefaultAttributeRegistry.register(ModEntities.YAGI, YagiEntity.setAttributes());
        FabricDefaultAttributeRegistry.register(ModEntities.TORA, ToraEntity.setAttributes());
        FabricDefaultAttributeRegistry.register(ModEntities.TIGER, TigerEntity.setAttributes());
        FabricDefaultAttributeRegistry.register(ModEntities.KOUHA, KouhaEntity.setAttributes());
    }
}
