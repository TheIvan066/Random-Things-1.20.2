package net.theivan066.randomthingsmod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;
import net.theivan066.randomthingsmod.RandomThingsMod;
import net.theivan066.randomthingsmod.block.custom.*;
import net.theivan066.randomthingsmod.item.ModItemGroup;
import net.theivan066.randomthingsmod.world.feature.tree.*;



public class ModBlocks {

    public static final Block TEST_BLOCK = registerBlock("test_block",
            new Block(FabricBlockSettings.create().strength(1f)));

    public static final Block SPEED_BLOCK = registerBlock("speed_block",
            new SpeedBlock(FabricBlockSettings.create().strength(4.0f).requiresTool()));

    public static final Block JUMP1_BLOCK = registerBlock("jump1_block",
            new Jump1Block(FabricBlockSettings.create().strength(4.0f).requiresTool()));

    public static final Block JUMP2_BLOCK = registerBlock("jump2_block",
            new Jump2Block(FabricBlockSettings.create().strength(4.0f).requiresTool()));

    public static final Block EFFECT_CLEAR_BLOCK = registerBlock("effect_clear_block",
            new EffectClearBlock(FabricBlockSettings.create().strength(4.0f).requiresTool()));

    public static final Block TEST_BUTTON = registerBlock("test_button",
            new ModStoneButtonBlock(FabricBlockSettings.create()
                    .strength(1f).noCollision(), BlockSetType.STONE, 60, true));

    public static final Block TEST_PRESSURE_PLATE = registerBlock("test_pressure_plate",
            new ModPressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.create()
                    .strength(1f), BlockSetType.IRON));

    public static final Block TEST_FENCE = registerBlock("test_fence",
            new FenceBlock(FabricBlockSettings.create().strength(1f)));

    public static final Block TEST_FENCE_GATE = registerBlock("test_fence_gate",
            new FenceGateBlock(FabricBlockSettings.create().strength(1f), WoodType.OAK));

    public static final Block TEST_WALL = registerBlock("test_wall",
            new WallBlock(FabricBlockSettings.create().strength(1f)));

    public static final Block TEST_SLAB = registerBlock("test_slab",
            new SlabBlock(FabricBlockSettings.create().strength(1f)));

    public static final Block TEST_STAIRS = registerBlock("test_stairs",
            new ModStairsBlock(ModBlocks.TEST_BLOCK.getDefaultState(),
                    FabricBlockSettings.create().strength(1f)));


    public static final Block CANOPIC_JAR = registerBlock("canopic_jar",
            new CanopicJarBlock(FabricBlockSettings.create().strength(1f).nonOpaque()));
    public static final Block GUILDED_CANOPIC_JAR = registerBlock("guilded_canopic_jar",
            new GuildedCanopicJarBlock(FabricBlockSettings.create().strength(1f).nonOpaque()));


    //old blocks
    public static final Block DIRT_SLAB = registerBlock("dirt_slab",
            new SlabBlock(FabricBlockSettings.create().sounds(BlockSoundGroup.GRAVEL).strength(0.5f)));
    public static final Block DIRT_STAIRS = registerBlock("dirt_stairs",
            new ModStairsBlock(Blocks.DIRT.getDefaultState(),FabricBlockSettings.create().sounds(BlockSoundGroup.GRAVEL).requiresTool().strength(0.5f)));
    public static final Block GLOWING_OBSIDIAN = registerBlock("glowing_obsidian",
            new Block(FabricBlockSettings.create().strength(50F, 1200F).sounds(BlockSoundGroup.STONE).requiresTool().luminance((state) -> {
                return 12;
            }).mapColor(DyeColor.RED)));
    public static final Block NETHER_REACTOR_CORE = registerBlock("nether_reactor_core",
            new NetherReactorCoreBlock(FabricBlockSettings.create().strength(4.5F, 6F).sounds(BlockSoundGroup.STONE).requiresTool().mapColor(DyeColor.RED)));
    public static final Block INITIALIZED_NETHER_REACTOR_CORE = registerBlock("initialized_nether_reactor_core",
            new Block(FabricBlockSettings.create().strength(4.5F, 6F).sounds(BlockSoundGroup.STONE).requiresTool().mapColor(DyeColor.RED)));
    public static final Block FINISHED_NETHER_REACTOR_CORE = registerBlock("finished_nether_reactor_core",
            new Block(FabricBlockSettings.create().strength(4.5F, 6F).sounds(BlockSoundGroup.STONE).requiresTool().mapColor(DyeColor.RED)));

    //coming soon in mc


    public static final Block WHITE_CONCRETE_SLAB = registerBlock("white_concrete_slab",
            new SlabBlock(FabricBlockSettings.create().requiresTool().strength(1.4f)));
    public static final Block ORANGE_CONCRETE_SLAB = registerBlock("orange_concrete_slab",
            new SlabBlock(FabricBlockSettings.create().requiresTool().strength(1.4f)));
    public static final Block MAGENTA_CONCRETE_SLAB = registerBlock("magenta_concrete_slab",
            new SlabBlock(FabricBlockSettings.create().requiresTool().strength(1.4f)));
    public static final Block LIGHT_BLUE_CONCRETE_SLAB = registerBlock("light_blue_concrete_slab",
            new SlabBlock(FabricBlockSettings.create().requiresTool().strength(1.4f)));
    public static final Block YELLOW_CONCRETE_SLAB = registerBlock("yellow_concrete_slab",
            new SlabBlock(FabricBlockSettings.create().requiresTool().strength(1.4f)));
    public static final Block LIME_CONCRETE_SLAB = registerBlock("lime_concrete_slab",
            new SlabBlock(FabricBlockSettings.create().requiresTool().strength(1.4f)));
    public static final Block PINK_CONCRETE_SLAB = registerBlock("pink_concrete_slab",
            new SlabBlock(FabricBlockSettings.create().requiresTool().strength(1.4f)));
    public static final Block GRAY_CONCRETE_SLAB = registerBlock("gray_concrete_slab",
            new SlabBlock(FabricBlockSettings.create().requiresTool().strength(1.4f)));
    public static final Block LIGHT_GRAY_CONCRETE_SLAB = registerBlock("light_gray_concrete_slab",
            new SlabBlock(FabricBlockSettings.create().requiresTool().strength(1.4f)));
    public static final Block CYAN_CONCRETE_SLAB = registerBlock("cyan_concrete_slab",
            new SlabBlock(FabricBlockSettings.create().requiresTool().strength(1.4f)));
    public static final Block PURPLE_CONCRETE_SLAB = registerBlock("purple_concrete_slab",
            new SlabBlock(FabricBlockSettings.create().requiresTool().strength(1.4f)));
    public static final Block BLUE_CONCRETE_SLAB = registerBlock("blue_concrete_slab",
            new SlabBlock(FabricBlockSettings.create().requiresTool().strength(1.4f)));
    public static final Block BROWN_CONCRETE_SLAB = registerBlock("brown_concrete_slab",
            new SlabBlock(FabricBlockSettings.create().requiresTool().strength(1.4f)));
    public static final Block GREEN_CONCRETE_SLAB = registerBlock("green_concrete_slab",
            new SlabBlock(FabricBlockSettings.create().requiresTool().strength(1.4f)));
    public static final Block RED_CONCRETE_SLAB = registerBlock("red_concrete_slab",
            new SlabBlock(FabricBlockSettings.create().requiresTool().strength(1.4f)));
    public static final Block BLACK_CONCRETE_SLAB = registerBlock("black_concrete_slab",
            new SlabBlock(FabricBlockSettings.create().requiresTool().strength(1.4f)));

    public static final Block WHITE_TERRACOTTA_SLAB = registerBlock("white_terracotta_slab",
            new SlabBlock(FabricBlockSettings.create().requiresTool().strength(1.25f,4.2f)));
    public static final Block ORANGE_TERRACOTTA_SLAB = registerBlock("orange_terracotta_slab",
            new SlabBlock(FabricBlockSettings.create().requiresTool().strength(1.25f,4.2f)));
    public static final Block MAGENTA_TERRACOTTA_SLAB = registerBlock("magenta_terracotta_slab",
            new SlabBlock(FabricBlockSettings.create().requiresTool().strength(1.25f,4.2f)));
    public static final Block LIGHT_BLUE_TERRACOTTA_SLAB = registerBlock("light_blue_terracotta_slab",
            new SlabBlock(FabricBlockSettings.create().requiresTool().strength(1.25f,4.2f)));
    public static final Block YELLOW_TERRACOTTA_SLAB = registerBlock("yellow_terracotta_slab",
            new SlabBlock(FabricBlockSettings.create().requiresTool().strength(1.25f,4.2f)));
    public static final Block LIME_TERRACOTTA_SLAB = registerBlock("lime_terracotta_slab",
            new SlabBlock(FabricBlockSettings.create().requiresTool().strength(1.25f,4.2f)));
    public static final Block PINK_TERRACOTTA_SLAB = registerBlock("pink_terracotta_slab",
            new SlabBlock(FabricBlockSettings.create().requiresTool().strength(1.25f,4.2f)));
    public static final Block GRAY_TERRACOTTA_SLAB = registerBlock("gray_terracotta_slab",
            new SlabBlock(FabricBlockSettings.create().requiresTool().strength(1.25f,4.2f)));
    public static final Block LIGHT_GRAY_TERRACOTTA_SLAB = registerBlock("light_gray_terracotta_slab",
            new SlabBlock(FabricBlockSettings.create().requiresTool().strength(1.25f,4.2f)));
    public static final Block CYAN_TERRACOTTA_SLAB = registerBlock("cyan_terracotta_slab",
            new SlabBlock(FabricBlockSettings.create().requiresTool().strength(1.25f,4.2f)));
    public static final Block PURPLE_TERRACOTTA_SLAB = registerBlock("purple_terracotta_slab",
            new SlabBlock(FabricBlockSettings.create().requiresTool().strength(1.25f,4.2f)));
    public static final Block BLUE_TERRACOTTA_SLAB = registerBlock("blue_terracotta_slab",
            new SlabBlock(FabricBlockSettings.create().requiresTool().strength(1.25f,4.2f)));
    public static final Block BROWN_TERRACOTTA_SLAB = registerBlock("brown_terracotta_slab",
            new SlabBlock(FabricBlockSettings.create().requiresTool().strength(1.25f,4.2f)));
    public static final Block GREEN_TERRACOTTA_SLAB = registerBlock("green_terracotta_slab",
            new SlabBlock(FabricBlockSettings.create().requiresTool().strength(1.25f,4.2f)));
    public static final Block RED_TERRACOTTA_SLAB = registerBlock("red_terracotta_slab",
            new SlabBlock(FabricBlockSettings.create().requiresTool().strength(1.25f,4.2f)));
    public static final Block BLACK_TERRACOTTA_SLAB = registerBlock("black_terracotta_slab",
            new SlabBlock(FabricBlockSettings.create().requiresTool().strength(1.25f,4.2f)));

    public static final Block GLASS_SLAB = registerBlock("glass_slab",
            new SlabBlock(FabricBlockSettings.create().strength(0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque().blockVision(AbstractBlock.AbstractBlockState::isTransparent)));
    public static final Block WHITE_GLASS_SLAB = registerBlock("white_glass_slab",
            new SlabBlock(FabricBlockSettings.create().strength(0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque().blockVision(AbstractBlock.AbstractBlockState::isTransparent)));
    public static final Block ORANGE_GLASS_SLAB = registerBlock("orange_glass_slab",
            new SlabBlock(FabricBlockSettings.create().strength(0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque().blockVision(AbstractBlock.AbstractBlockState::isTransparent)));
    public static final Block MAGENTA_GLASS_SLAB = registerBlock("magenta_glass_slab",
            new SlabBlock(FabricBlockSettings.create().strength(0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque().blockVision(AbstractBlock.AbstractBlockState::isTransparent)));
    public static final Block LIGHT_BLUE_GLASS_SLAB = registerBlock("light_blue_glass_slab",
            new SlabBlock(FabricBlockSettings.create().strength(0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque().blockVision(AbstractBlock.AbstractBlockState::isTransparent)));
    public static final Block YELLOW_GLASS_SLAB = registerBlock("yellow_glass_slab",
            new SlabBlock(FabricBlockSettings.create().strength(0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque().blockVision(AbstractBlock.AbstractBlockState::isTransparent)));
    public static final Block LIME_GLASS_SLAB = registerBlock("lime_glass_slab",
            new SlabBlock(FabricBlockSettings.create().strength(0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque().blockVision(AbstractBlock.AbstractBlockState::isTransparent)));
    public static final Block PINK_GLASS_SLAB = registerBlock("pink_glass_slab",
            new SlabBlock(FabricBlockSettings.create().strength(0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque().blockVision(AbstractBlock.AbstractBlockState::isTransparent)));
    public static final Block GRAY_GLASS_SLAB = registerBlock("gray_glass_slab",
            new SlabBlock(FabricBlockSettings.create().strength(0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque().blockVision(AbstractBlock.AbstractBlockState::isTransparent)));
    public static final Block LIGHT_GRAY_GLASS_SLAB = registerBlock("light_gray_glass_slab",
            new SlabBlock(FabricBlockSettings.create().strength(0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque().blockVision(AbstractBlock.AbstractBlockState::isTransparent)));
    public static final Block CYAN_GLASS_SLAB = registerBlock("cyan_glass_slab",
            new SlabBlock(FabricBlockSettings.create().strength(0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque().blockVision(AbstractBlock.AbstractBlockState::isTransparent)));
    public static final Block PURPLE_GLASS_SLAB = registerBlock("purple_glass_slab",
            new SlabBlock(FabricBlockSettings.create().strength(0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque().blockVision(AbstractBlock.AbstractBlockState::isTransparent)));
    public static final Block BLUE_GLASS_SLAB = registerBlock("blue_glass_slab",
            new SlabBlock(FabricBlockSettings.create().strength(0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque().blockVision(AbstractBlock.AbstractBlockState::isTransparent)));
    public static final Block BROWN_GLASS_SLAB = registerBlock("brown_glass_slab",
            new SlabBlock(FabricBlockSettings.create().strength(0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque().blockVision(AbstractBlock.AbstractBlockState::isTransparent)));
    public static final Block GREEN_GLASS_SLAB = registerBlock("green_glass_slab",
            new SlabBlock(FabricBlockSettings.create().strength(0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque().blockVision(AbstractBlock.AbstractBlockState::isTransparent)));
    public static final Block RED_GLASS_SLAB = registerBlock("red_glass_slab",
            new SlabBlock(FabricBlockSettings.create().strength(0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque().blockVision(AbstractBlock.AbstractBlockState::isTransparent)));
    public static final Block BLACK_GLASS_SLAB = registerBlock("black_glass_slab",
            new SlabBlock(FabricBlockSettings.create().strength(0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque().blockVision(AbstractBlock.AbstractBlockState::isTransparent)));


    public static final Block WHITE_CONCRETE_STAIRS = registerBlock("white_concrete_stairs",
            new ModStairsBlock(Blocks.WHITE_CONCRETE.getDefaultState(),FabricBlockSettings.create().requiresTool().strength(1.4f)));
    public static final Block ORANGE_CONCRETE_STAIRS = registerBlock("orange_concrete_stairs",
            new ModStairsBlock(Blocks.ORANGE_CONCRETE.getDefaultState(),FabricBlockSettings.create().requiresTool().strength(1.4f)));
    public static final Block MAGENTA_CONCRETE_STAIRS = registerBlock("magenta_concrete_stairs",
            new ModStairsBlock(Blocks.MAGENTA_CONCRETE.getDefaultState(),FabricBlockSettings.create().requiresTool().strength(1.4f)));
    public static final Block LIGHT_BLUE_CONCRETE_STAIRS = registerBlock("light_blue_concrete_stairs",
            new ModStairsBlock(Blocks.LIGHT_BLUE_CONCRETE.getDefaultState(),FabricBlockSettings.create().requiresTool().strength(1.4f)));
    public static final Block YELLOW_CONCRETE_STAIRS = registerBlock("yellow_concrete_stairs",
            new ModStairsBlock(Blocks.YELLOW_CONCRETE.getDefaultState(),FabricBlockSettings.create().requiresTool().strength(1.4f)));
    public static final Block LIME_CONCRETE_STAIRS = registerBlock("lime_concrete_stairs",
            new ModStairsBlock(Blocks.LIME_CONCRETE.getDefaultState(),FabricBlockSettings.create().requiresTool().strength(1.4f)));
    public static final Block PINK_CONCRETE_STAIRS = registerBlock("pink_concrete_stairs",
            new ModStairsBlock(Blocks.PINK_CONCRETE.getDefaultState(),FabricBlockSettings.create().requiresTool().strength(1.4f)));
    public static final Block GRAY_CONCRETE_STAIRS = registerBlock("gray_concrete_stairs",
            new ModStairsBlock(Blocks.GRAY_CONCRETE.getDefaultState(),FabricBlockSettings.create().requiresTool().strength(1.4f)));
    public static final Block LIGHT_GRAY_CONCRETE_STAIRS = registerBlock("light_gray_concrete_stairs",
            new ModStairsBlock(Blocks.LIGHT_GRAY_CONCRETE.getDefaultState(),FabricBlockSettings.create().requiresTool().strength(1.4f)));
    public static final Block CYAN_CONCRETE_STAIRS = registerBlock("cyan_concrete_stairs",
            new ModStairsBlock(Blocks.CYAN_CONCRETE.getDefaultState(),FabricBlockSettings.create().requiresTool().strength(1.4f)));
    public static final Block PURPLE_CONCRETE_STAIRS = registerBlock("purple_concrete_stairs",
            new ModStairsBlock(Blocks.PURPLE_CONCRETE.getDefaultState(),FabricBlockSettings.create().requiresTool().strength(1.4f)));
    public static final Block BLUE_CONCRETE_STAIRS = registerBlock("blue_concrete_stairs",
            new ModStairsBlock(Blocks.BLUE_CONCRETE.getDefaultState(),FabricBlockSettings.create().requiresTool().strength(1.4f)));
    public static final Block BROWN_CONCRETE_STAIRS = registerBlock("brown_concrete_stairs",
            new ModStairsBlock(Blocks.BROWN_CONCRETE.getDefaultState(),FabricBlockSettings.create().requiresTool().strength(1.4f)));
    public static final Block GREEN_CONCRETE_STAIRS = registerBlock("green_concrete_stairs",
            new ModStairsBlock(Blocks.GREEN_CONCRETE.getDefaultState(),FabricBlockSettings.create().requiresTool().strength(1.4f)));
    public static final Block RED_CONCRETE_STAIRS = registerBlock("red_concrete_stairs",
            new ModStairsBlock(Blocks.RED_CONCRETE.getDefaultState(),FabricBlockSettings.create().requiresTool().strength(1.4f)));
    public static final Block BLACK_CONCRETE_STAIRS = registerBlock("black_concrete_stairs",
            new ModStairsBlock(Blocks.BLACK_CONCRETE.getDefaultState(),FabricBlockSettings.create().requiresTool().strength(1.4f)));

    public static final Block WHITE_TERRACOTTA_STAIRS = registerBlock("white_terracotta_stairs",
            new ModStairsBlock(Blocks.WHITE_TERRACOTTA.getDefaultState(),FabricBlockSettings.create().requiresTool().strength(1.25f,4.2f)));
    public static final Block ORANGE_TERRACOTTA_STAIRS = registerBlock("orange_terracotta_stairs",
            new ModStairsBlock(Blocks.ORANGE_TERRACOTTA.getDefaultState(),FabricBlockSettings.create().requiresTool().strength(1.25f,4.2f)));
    public static final Block MAGENTA_TERRACOTTA_STAIRS = registerBlock("magenta_terracotta_stairs",
            new ModStairsBlock(Blocks.MAGENTA_TERRACOTTA.getDefaultState(),FabricBlockSettings.create().requiresTool().strength(1.25f,4.2f)));
    public static final Block LIGHT_BLUE_TERRACOTTA_STAIRS = registerBlock("light_blue_terracotta_stairs",
            new ModStairsBlock(Blocks.LIGHT_BLUE_TERRACOTTA.getDefaultState(),FabricBlockSettings.create().requiresTool().strength(1.25f,4.2f)));
    public static final Block YELLOW_TERRACOTTA_STAIRS = registerBlock("yellow_terracotta_stairs",
            new ModStairsBlock(Blocks.YELLOW_TERRACOTTA.getDefaultState(),FabricBlockSettings.create().requiresTool().strength(1.25f,4.2f)));
    public static final Block LIME_TERRACOTTA_STAIRS = registerBlock("lime_terracotta_stairs",
            new ModStairsBlock(Blocks.LIME_TERRACOTTA.getDefaultState(),FabricBlockSettings.create().requiresTool().strength(1.25f,4.2f)));
    public static final Block PINK_TERRACOTTA_STAIRS = registerBlock("pink_terracotta_stairs",
            new ModStairsBlock(Blocks.PINK_TERRACOTTA.getDefaultState(),FabricBlockSettings.create().requiresTool().strength(1.25f,4.2f)));
    public static final Block GRAY_TERRACOTTA_STAIRS = registerBlock("gray_terracotta_stairs",
            new ModStairsBlock(Blocks.GRAY_TERRACOTTA.getDefaultState(),FabricBlockSettings.create().requiresTool().strength(1.25f,4.2f)));
    public static final Block LIGHT_GRAY_TERRACOTTA_STAIRS = registerBlock("light_gray_terracotta_stairs",
            new ModStairsBlock(Blocks.LIGHT_GRAY_TERRACOTTA.getDefaultState(),FabricBlockSettings.create().requiresTool().strength(1.25f,4.2f)));
    public static final Block CYAN_TERRACOTTA_STAIRS = registerBlock("cyan_terracotta_stairs",
            new ModStairsBlock(Blocks.CYAN_TERRACOTTA.getDefaultState(),FabricBlockSettings.create().requiresTool().strength(1.25f,4.2f)));
    public static final Block PURPLE_TERRACOTTA_STAIRS = registerBlock("purple_terracotta_stairs",
            new ModStairsBlock(Blocks.PURPLE_TERRACOTTA.getDefaultState(),FabricBlockSettings.create().requiresTool().strength(1.25f,4.2f)));
    public static final Block BLUE_TERRACOTTA_STAIRS = registerBlock("blue_terracotta_stairs",
            new ModStairsBlock(Blocks.BLUE_TERRACOTTA.getDefaultState(),FabricBlockSettings.create().requiresTool().strength(1.25f,4.2f)));
    public static final Block BROWN_TERRACOTTA_STAIRS = registerBlock("brown_terracotta_stairs",
            new ModStairsBlock(Blocks.BROWN_TERRACOTTA.getDefaultState(),FabricBlockSettings.create().requiresTool().strength(1.25f,4.2f)));
    public static final Block GREEN_TERRACOTTA_STAIRS = registerBlock("green_terracotta_stairs",
            new ModStairsBlock(Blocks.GREEN_TERRACOTTA.getDefaultState(),FabricBlockSettings.create().requiresTool().strength(1.25f,4.2f)));
    public static final Block RED_TERRACOTTA_STAIRS = registerBlock("red_terracotta_stairs",
            new ModStairsBlock(Blocks.RED_TERRACOTTA.getDefaultState(),FabricBlockSettings.create().requiresTool().strength(1.25f,4.2f)));
    public static final Block BLACK_TERRACOTTA_STAIRS = registerBlock("black_terracotta_stairs",
            new ModStairsBlock(Blocks.BLACK_TERRACOTTA.getDefaultState(),FabricBlockSettings.create().requiresTool().strength(1.25f,4.2f)));

    public static final Block GLASS_STAIRS = registerBlock("glass_stairs",
            new ModStairsBlock(Blocks.GLASS.getDefaultState(),FabricBlockSettings.create().strength(0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque().blockVision(AbstractBlock.AbstractBlockState::isTransparent)));
    public static final Block WHITE_GLASS_STAIRS = registerBlock("white_glass_stairs",
            new ModStairsBlock(Blocks.WHITE_STAINED_GLASS.getDefaultState(),FabricBlockSettings.create().strength(0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque().blockVision(AbstractBlock.AbstractBlockState::isTransparent)));
    public static final Block ORANGE_GLASS_STAIRS = registerBlock("orange_glass_stairs",
            new ModStairsBlock(Blocks.ORANGE_STAINED_GLASS.getDefaultState(),FabricBlockSettings.create().strength(0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque().blockVision(AbstractBlock.AbstractBlockState::isTransparent)));
    public static final Block MAGENTA_GLASS_STAIRS = registerBlock("magenta_glass_stairs",
            new ModStairsBlock(Blocks.MAGENTA_STAINED_GLASS.getDefaultState(),FabricBlockSettings.create().strength(0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque().blockVision(AbstractBlock.AbstractBlockState::isTransparent)));
    public static final Block LIGHT_BLUE_GLASS_STAIRS = registerBlock("light_blue_glass_stairs",
            new ModStairsBlock(Blocks.LIGHT_BLUE_STAINED_GLASS.getDefaultState(),FabricBlockSettings.create().strength(0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque().blockVision(AbstractBlock.AbstractBlockState::isTransparent)));
    public static final Block YELLOW_GLASS_STAIRS = registerBlock("yellow_glass_stairs",
            new ModStairsBlock(Blocks.YELLOW_STAINED_GLASS.getDefaultState(),FabricBlockSettings.create().strength(0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque().blockVision(AbstractBlock.AbstractBlockState::isTransparent)));
    public static final Block LIME_GLASS_STAIRS = registerBlock("lime_glass_stairs",
            new ModStairsBlock(Blocks.LIME_STAINED_GLASS.getDefaultState(),FabricBlockSettings.create().strength(0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque().blockVision(AbstractBlock.AbstractBlockState::isTransparent)));
    public static final Block PINK_GLASS_STAIRS = registerBlock("pink_glass_stairs",
            new ModStairsBlock(Blocks.PINK_STAINED_GLASS.getDefaultState(),FabricBlockSettings.create().strength(0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque().blockVision(AbstractBlock.AbstractBlockState::isTransparent)));
    public static final Block GRAY_GLASS_STAIRS = registerBlock("gray_glass_stairs",
            new ModStairsBlock(Blocks.GRAY_STAINED_GLASS.getDefaultState(),FabricBlockSettings.create().strength(0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque().blockVision(AbstractBlock.AbstractBlockState::isTransparent)));
    public static final Block LIGHT_GRAY_GLASS_STAIRS = registerBlock("light_gray_glass_stairs",
            new ModStairsBlock(Blocks.LIGHT_GRAY_STAINED_GLASS.getDefaultState(),FabricBlockSettings.create().strength(0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque().blockVision(AbstractBlock.AbstractBlockState::isTransparent)));
    public static final Block CYAN_GLASS_STAIRS = registerBlock("cyan_glass_stairs",
            new ModStairsBlock(Blocks.CYAN_STAINED_GLASS.getDefaultState(),FabricBlockSettings.create().strength(0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque().blockVision(AbstractBlock.AbstractBlockState::isTransparent)));
    public static final Block PURPLE_GLASS_STAIRS = registerBlock("purple_glass_stairs",
            new ModStairsBlock(Blocks.PURPLE_STAINED_GLASS.getDefaultState(),FabricBlockSettings.create().strength(0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque().blockVision(AbstractBlock.AbstractBlockState::isTransparent)));
    public static final Block BLUE_GLASS_STAIRS = registerBlock("blue_glass_stairs",
            new ModStairsBlock(Blocks.BLUE_STAINED_GLASS.getDefaultState(),FabricBlockSettings.create().strength(0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque().blockVision(AbstractBlock.AbstractBlockState::isTransparent)));
    public static final Block BROWN_GLASS_STAIRS = registerBlock("brown_glass_stairs",
            new ModStairsBlock(Blocks.BROWN_STAINED_GLASS.getDefaultState(),FabricBlockSettings.create().strength(0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque().blockVision(AbstractBlock.AbstractBlockState::isTransparent)));
    public static final Block GREEN_GLASS_STAIRS = registerBlock("green_glass_stairs",
            new ModStairsBlock(Blocks.GREEN_STAINED_GLASS.getDefaultState(),FabricBlockSettings.create().strength(0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque().blockVision(AbstractBlock.AbstractBlockState::isTransparent)));
    public static final Block RED_GLASS_STAIRS = registerBlock("red_glass_stairs",
            new ModStairsBlock(Blocks.RED_STAINED_GLASS.getDefaultState(),FabricBlockSettings.create().strength(0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque().blockVision(AbstractBlock.AbstractBlockState::isTransparent)));
    public static final Block BLACK_GLASS_STAIRS = registerBlock("black_glass_stairs",
            new ModStairsBlock(Blocks.BLACK_STAINED_GLASS.getDefaultState(),FabricBlockSettings.create().strength(0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque().blockVision(AbstractBlock.AbstractBlockState::isTransparent)));



    public static final Block GLASS_DOOR = registerBlock("glass_door",
            new ModDoorBlock(FabricBlockSettings.create()
                    .strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS).blockVision(AbstractBlock.AbstractBlockState::isTransparent), BlockSetType.OAK));
    public static final Block GLASS_TRAPDOOR = registerBlock("glass_trapdoor",
            new ModTrapdoorBlock(FabricBlockSettings.create()
                    .strength(0.3f).nonOpaque().sounds(BlockSoundGroup.GLASS).blockVision(AbstractBlock.AbstractBlockState::isTransparent),BlockSetType.OAK));
    public static final Block WHITE_GLASS_DOOR = registerBlock("white_glass_door",
            new ModDoorBlock(FabricBlockSettings.create().strength(0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque().blockVision(AbstractBlock.AbstractBlockState::isTransparent), BlockSetType.OAK));
    public static final Block ORANGE_GLASS_DOOR = registerBlock("orange_glass_door",
            new ModDoorBlock(FabricBlockSettings.create().strength(0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque().blockVision(AbstractBlock.AbstractBlockState::isTransparent), BlockSetType.OAK));
    public static final Block MAGENTA_GLASS_DOOR = registerBlock("magenta_glass_door",
            new ModDoorBlock(FabricBlockSettings.create().strength(0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque().blockVision(AbstractBlock.AbstractBlockState::isTransparent), BlockSetType.OAK));
    public static final Block LIGHT_BLUE_GLASS_DOOR = registerBlock("light_blue_glass_door",
            new ModDoorBlock(FabricBlockSettings.create().strength(0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque().blockVision(AbstractBlock.AbstractBlockState::isTransparent), BlockSetType.OAK));
    public static final Block YELLOW_GLASS_DOOR = registerBlock("yellow_glass_door",
            new ModDoorBlock(FabricBlockSettings.create().strength(0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque().blockVision(AbstractBlock.AbstractBlockState::isTransparent), BlockSetType.OAK));
    public static final Block LIME_GLASS_DOOR = registerBlock("lime_glass_door",
            new ModDoorBlock(FabricBlockSettings.create().strength(0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque().blockVision(AbstractBlock.AbstractBlockState::isTransparent), BlockSetType.OAK));
    public static final Block PINK_GLASS_DOOR = registerBlock("pink_glass_door",
            new ModDoorBlock(FabricBlockSettings.create().strength(0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque().blockVision(AbstractBlock.AbstractBlockState::isTransparent), BlockSetType.OAK));
    public static final Block GRAY_GLASS_DOOR = registerBlock("gray_glass_door",
            new ModDoorBlock(FabricBlockSettings.create().strength(0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque().blockVision(AbstractBlock.AbstractBlockState::isTransparent), BlockSetType.OAK));
    public static final Block LIGHT_GRAY_GLASS_DOOR = registerBlock("light_gray_glass_door",
            new ModDoorBlock(FabricBlockSettings.create().strength(0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque().blockVision(AbstractBlock.AbstractBlockState::isTransparent), BlockSetType.OAK));
    public static final Block CYAN_GLASS_DOOR = registerBlock("cyan_glass_door",
            new ModDoorBlock(FabricBlockSettings.create().strength(0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque().blockVision(AbstractBlock.AbstractBlockState::isTransparent), BlockSetType.OAK));
    public static final Block PURPLE_GLASS_DOOR = registerBlock("purple_glass_door",
            new ModDoorBlock(FabricBlockSettings.create().strength(0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque().blockVision(AbstractBlock.AbstractBlockState::isTransparent), BlockSetType.OAK));
    public static final Block BLUE_GLASS_DOOR = registerBlock("blue_glass_door",
            new ModDoorBlock(FabricBlockSettings.create().strength(0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque().blockVision(AbstractBlock.AbstractBlockState::isTransparent), BlockSetType.OAK));
    public static final Block BROWN_GLASS_DOOR = registerBlock("brown_glass_door",
            new ModDoorBlock(FabricBlockSettings.create().strength(0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque().blockVision(AbstractBlock.AbstractBlockState::isTransparent), BlockSetType.OAK));
    public static final Block GREEN_GLASS_DOOR = registerBlock("green_glass_door",
            new ModDoorBlock(FabricBlockSettings.create().strength(0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque().blockVision(AbstractBlock.AbstractBlockState::isTransparent), BlockSetType.OAK));
    public static final Block RED_GLASS_DOOR = registerBlock("red_glass_door",
            new ModDoorBlock(FabricBlockSettings.create().strength(0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque().blockVision(AbstractBlock.AbstractBlockState::isTransparent), BlockSetType.OAK));
    public static final Block BLACK_GLASS_DOOR = registerBlock("black_glass_door",
            new ModDoorBlock(FabricBlockSettings.create().strength(0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque().blockVision(AbstractBlock.AbstractBlockState::isTransparent), BlockSetType.OAK));

    public static final Block WHITE_GLASS_TRAPDOOR = registerBlock("white_glass_trapdoor",
            new ModTrapdoorBlock(FabricBlockSettings.create().strength(0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque().blockVision(AbstractBlock.AbstractBlockState::isTransparent),BlockSetType.OAK));
    public static final Block ORANGE_GLASS_TRAPDOOR = registerBlock("orange_glass_trapdoor",
            new ModTrapdoorBlock(FabricBlockSettings.create().strength(0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque().blockVision(AbstractBlock.AbstractBlockState::isTransparent),BlockSetType.OAK));
    public static final Block MAGENTA_GLASS_TRAPDOOR = registerBlock("magenta_glass_trapdoor",
            new ModTrapdoorBlock(FabricBlockSettings.create().strength(0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque().blockVision(AbstractBlock.AbstractBlockState::isTransparent),BlockSetType.OAK));
    public static final Block LIGHT_BLUE_GLASS_TRAPDOOR = registerBlock("light_blue_glass_trapdoor",
            new ModTrapdoorBlock(FabricBlockSettings.create().strength(0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque().blockVision(AbstractBlock.AbstractBlockState::isTransparent),BlockSetType.OAK));
    public static final Block YELLOW_GLASS_TRAPDOOR = registerBlock("yellow_glass_trapdoor",
            new ModTrapdoorBlock(FabricBlockSettings.create().strength(0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque().blockVision(AbstractBlock.AbstractBlockState::isTransparent),BlockSetType.OAK));
    public static final Block LIME_GLASS_TRAPDOOR = registerBlock("lime_glass_trapdoor",
            new ModTrapdoorBlock(FabricBlockSettings.create().strength(0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque().blockVision(AbstractBlock.AbstractBlockState::isTransparent),BlockSetType.OAK));
    public static final Block PINK_GLASS_TRAPDOOR = registerBlock("pink_glass_trapdoor",
            new ModTrapdoorBlock(FabricBlockSettings.create().strength(0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque().blockVision(AbstractBlock.AbstractBlockState::isTransparent),BlockSetType.OAK));
    public static final Block GRAY_GLASS_TRAPDOOR = registerBlock("gray_glass_trapdoor",
            new ModTrapdoorBlock(FabricBlockSettings.create().strength(0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque().blockVision(AbstractBlock.AbstractBlockState::isTransparent),BlockSetType.OAK));
    public static final Block LIGHT_GRAY_GLASS_TRAPDOOR = registerBlock("light_gray_glass_trapdoor",
            new ModTrapdoorBlock(FabricBlockSettings.create().strength(0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque().blockVision(AbstractBlock.AbstractBlockState::isTransparent),BlockSetType.OAK));
    public static final Block CYAN_GLASS_TRAPDOOR = registerBlock("cyan_glass_trapdoor",
            new ModTrapdoorBlock(FabricBlockSettings.create().strength(0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque().blockVision(AbstractBlock.AbstractBlockState::isTransparent),BlockSetType.OAK));
    public static final Block PURPLE_GLASS_TRAPDOOR = registerBlock("purple_glass_trapdoor",
            new ModTrapdoorBlock(FabricBlockSettings.create().strength(0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque().blockVision(AbstractBlock.AbstractBlockState::isTransparent),BlockSetType.OAK));
    public static final Block BLUE_GLASS_TRAPDOOR = registerBlock("blue_glass_trapdoor",
            new ModTrapdoorBlock(FabricBlockSettings.create().strength(0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque().blockVision(AbstractBlock.AbstractBlockState::isTransparent),BlockSetType.OAK));
    public static final Block BROWN_GLASS_TRAPDOOR = registerBlock("brown_glass_trapdoor",
            new ModTrapdoorBlock(FabricBlockSettings.create().strength(0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque().blockVision(AbstractBlock.AbstractBlockState::isTransparent),BlockSetType.OAK));
    public static final Block GREEN_GLASS_TRAPDOOR = registerBlock("green_glass_trapdoor",
            new ModTrapdoorBlock(FabricBlockSettings.create().strength(0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque().blockVision(AbstractBlock.AbstractBlockState::isTransparent),BlockSetType.OAK));
    public static final Block RED_GLASS_TRAPDOOR = registerBlock("red_glass_trapdoor",
            new ModTrapdoorBlock(FabricBlockSettings.create().strength(0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque().blockVision(AbstractBlock.AbstractBlockState::isTransparent),BlockSetType.OAK));
    public static final Block BLACK_GLASS_TRAPDOOR = registerBlock("black_glass_trapdoor",
            new ModTrapdoorBlock(FabricBlockSettings.create().strength(0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque().blockVision(AbstractBlock.AbstractBlockState::isTransparent),BlockSetType.OAK));


    public static final Block LILAC = registerBlock("lilac",
            new FlowerBlock(StatusEffects.FIRE_RESISTANCE, 12,
                    FabricBlockSettings.copyOf(Blocks.DANDELION).strength(4.0f).nonOpaque()));
    public static final Block POTTED_LILAC = registerBlockWithoutBlockItem("potted_lilac",
            new FlowerPotBlock(ModBlocks.LILAC,
                    FabricBlockSettings.copyOf(Blocks.POTTED_ALLIUM).nonOpaque()));


    public static final Block CHERRY_LOG = registerBlock("cherry_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG).strength(2.0f)));
    public static final Block CHERRY_WOOD = registerBlock("cherry_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD).strength(2.0f)));
    public static final Block STRIPPED_CHERRY_LOG = registerBlock("stripped_cherry_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG).strength(2.0f)));
    public static final Block STRIPPED_CHERRY_WOOD = registerBlock("stripped_cherry_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).strength(2.0f)));
    public static final Block CHERRY_LEAVES = registerBlock("cherry_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).nonOpaque()));
    public static final Block CHERRY_SAPLING = registerBlock("cherry_sapling",
            new ModSaplingBlock(new CherrySaplingGenerator(),
                    FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));
    public static final Block POTTED_CHERRY_SAPLING = registerBlockWithoutBlockItem("potted_cherry_sapling",
            new FlowerPotBlock(ModBlocks.CHERRY_SAPLING,
                    FabricBlockSettings.copyOf(Blocks.POTTED_ACACIA_SAPLING).nonOpaque()));

    public static final Block CHERRY_PLANKS = registerBlock("cherry_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(2.0f, 3.0f)));
    public static final Block CHERRY_SLAB = registerBlock("cherry_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_SLAB)));
    public static final Block CHERRY_STAIRS = registerBlock("cherry_stairs",
            new ModStairsBlock(Blocks.CHERRY_PLANKS.getDefaultState(),FabricBlockSettings.copyOf(Blocks.OAK_STAIRS)));
    public static final Block CHERRY_BUTTON = registerBlock("cherry_button",
            new ModStoneButtonBlock(FabricBlockSettings.create()
                    .strength(1f).noCollision(), BlockSetType.CHERRY, 60, true));
    public static final Block CHERRY_PRESSURE_PLATE = registerBlock("cherry_pressure_plate",
            new ModPressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.create()
                    .strength(1f), BlockSetType.IRON));
    public static final Block CHERRY_FENCE = registerBlock("cherry_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)));
    public static final Block CHERRY_FENCE_GATE = registerBlock("cherry_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE_GATE), WoodType.CHERRY));
    public static final Block CHERRY_SIGN = registerBlock("cherry_sign",
            new SignBlock(FabricBlockSettings.copyOf(Blocks.OAK_SIGN), WoodType.CHERRY));


    public static final Block CITRUS_LOG = registerBlock("citrus_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG).strength(2.0f)));
    public static final Block CITRUS_WOOD = registerBlock("citrus_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD).strength(2.0f)));
    public static final Block STRIPPED_CITRUS_LOG = registerBlock("stripped_citrus_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG).strength(2.0f)));
    public static final Block STRIPPED_CITRUS_WOOD = registerBlock("stripped_citrus_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).strength(2.0f)));
    public static final Block CITRUS_LEAVES = registerBlock("citrus_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).nonOpaque()));
    public static final Block CITRUS_SAPLING = registerBlock("citrus_sapling",
            new ModSaplingBlock(new CitrusSaplingGenerator(),
                    FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));
    public static final Block POTTED_CITRUS_SAPLING = registerBlockWithoutBlockItem("potted_citrus_sapling",
            new FlowerPotBlock(ModBlocks.CITRUS_SAPLING,
                    FabricBlockSettings.copyOf(Blocks.POTTED_ACACIA_SAPLING).nonOpaque()));

    public static final Block CITRUS_PLANKS = registerBlock("citrus_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(2.0f, 3.0f)));


    public static final Block BETA_LOG = registerBlock("beta_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG).strength(2.0f)));
    public static final Block BETA_WOOD = registerBlock("beta_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD).strength(2.0f)));
    public static final Block BETA_LEAVES = registerBlock("beta_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).nonOpaque()));
    public static final Block BETA_SAPLING = registerBlock("beta_sapling",
            new ModSaplingBlock(new BetaSaplingGenerator(),
                    FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));
    public static final Block POTTED_BETA_SAPLING = registerBlockWithoutBlockItem("potted_beta_sapling",
            new FlowerPotBlock(ModBlocks.BETA_SAPLING,
                    FabricBlockSettings.copyOf(Blocks.POTTED_ACACIA_SAPLING).nonOpaque()));

    public static final Block BETA_PLANKS = registerBlock("beta_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(2.0f, 3.0f)));


    public static final Block BANANA_TRUNK = registerBlock("banana_trunk",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG).strength(2.0f)));
    public static final Block BANANA_LEAVES = registerBlock("banana_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).nonOpaque()));
    public static final Block BANANA_SAPLING = registerBlock("banana_sapling",
            new ModSaplingBlock(new BananaSaplingGenerator(),
                    FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));
    public static final Block POTTED_BANANA_SAPLING = registerBlockWithoutBlockItem("potted_banana_sapling",
            new FlowerPotBlock(ModBlocks.BANANA_SAPLING,
                    FabricBlockSettings.copyOf(Blocks.POTTED_ACACIA_SAPLING).nonOpaque()));


    public static final Block MANGO_LOG = registerBlock("mango_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG).strength(2.0f)));
    public static final Block MANGO_WOOD = registerBlock("mango_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD).strength(2.0f)));
    public static final Block STRIPPED_MANGO_LOG = registerBlock("stripped_mango_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG).strength(2.0f)));
    public static final Block STRIPPED_MANGO_WOOD = registerBlock("stripped_mango_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).strength(2.0f)));
    public static final Block MANGO_LEAVES = registerBlock("mango_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).nonOpaque()));
    public static final Block MANGO_SAPLING = registerBlock("mango_sapling",
            new ModSaplingBlock(new MangoSaplingGenerator(),
                    FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));
    public static final Block POTTED_MANGO_SAPLING = registerBlockWithoutBlockItem("potted_mango_sapling",
            new FlowerPotBlock(ModBlocks.MANGO_SAPLING,
                    FabricBlockSettings.copyOf(Blocks.POTTED_ACACIA_SAPLING).nonOpaque()));

    public static final Block MANGO_PLANKS = registerBlock("mango_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(2.0f, 3.0f)));


    public static final Block ORANGE_LOG = registerBlock("orange_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG).strength(2.0f)));
    public static final Block ORANGE_WOOD = registerBlock("orange_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD).strength(2.0f)));
    public static final Block STRIPPED_ORANGE_LOG = registerBlock("stripped_orange_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG).strength(2.0f)));
    public static final Block STRIPPED_ORANGE_WOOD = registerBlock("stripped_orange_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).strength(2.0f)));
    public static final Block ORANGE_LEAVES = registerBlock("orange_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).nonOpaque()));
    public static final Block ORANGE_SAPLING = registerBlock("orange_sapling",
            new ModSaplingBlock(new OrangeSaplingGenerator(),
                    FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));
    public static final Block POTTED_ORANGE_SAPLING = registerBlockWithoutBlockItem("potted_orange_sapling",
            new FlowerPotBlock(ModBlocks.ORANGE_SAPLING,
                    FabricBlockSettings.copyOf(Blocks.POTTED_ACACIA_SAPLING).nonOpaque()));

    public static final Block ORANGE_PLANKS = registerBlock("orange_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(2.0f, 3.0f)));


    public static final Block PEACH_LOG = registerBlock("peach_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG).strength(2.0f)));
    public static final Block PEACH_WOOD = registerBlock("peach_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD).strength(2.0f)));
    public static final Block STRIPPED_PEACH_LOG = registerBlock("stripped_peach_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG).strength(2.0f)));
    public static final Block STRIPPED_PEACH_WOOD = registerBlock("stripped_peach_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).strength(2.0f)));
    public static final Block PEACH_LEAVES = registerBlock("peach_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).nonOpaque()));
    public static final Block PEACH_SAPLING = registerBlock("peach_sapling",
            new ModSaplingBlock(new PeachSaplingGenerator(),
                    FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));
    public static final Block POTTED_PEACH_SAPLING = registerBlockWithoutBlockItem("potted_peach_sapling",
            new FlowerPotBlock(ModBlocks.PEACH_SAPLING,
                    FabricBlockSettings.copyOf(Blocks.POTTED_ACACIA_SAPLING).nonOpaque()));

    public static final Block PEACH_PLANKS = registerBlock("peach_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(2.0f, 3.0f)));


    public static final Block PEAR_LOG = registerBlock("pear_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG).strength(2.0f)));
    public static final Block PEAR_WOOD = registerBlock("pear_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD).strength(2.0f)));
    public static final Block STRIPPED_PEAR_LOG = registerBlock("stripped_pear_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG).strength(2.0f)));
    public static final Block STRIPPED_PEAR_WOOD = registerBlock("stripped_pear_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).strength(2.0f)));
    public static final Block PEAR_LEAVES = registerBlock("pear_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).nonOpaque()));
    public static final Block PEAR_SAPLING = registerBlock("pear_sapling",
            new ModSaplingBlock(new PearSaplingGenerator(),
                    FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));
    public static final Block POTTED_PEAR_SAPLING = registerBlockWithoutBlockItem("potted_pear_sapling",
            new FlowerPotBlock(ModBlocks.PEAR_SAPLING,
                    FabricBlockSettings.copyOf(Blocks.POTTED_ACACIA_SAPLING).nonOpaque()));

    public static final Block PEAR_PLANKS = registerBlock("pear_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(2.0f, 3.0f)));


    public static final Block POMEGRANATE_LOG = registerBlock("pomegranate_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG).strength(2.0f)));
    public static final Block POMEGRANATE_WOOD = registerBlock("pomegranate_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD).strength(2.0f)));
    public static final Block STRIPPED_POMEGRANATE_LOG = registerBlock("stripped_pomegranate_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG).strength(2.0f)));
    public static final Block STRIPPED_POMEGRANATE_WOOD = registerBlock("stripped_pomegranate_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).strength(2.0f)));
    public static final Block POMEGRANATE_LEAVES = registerBlock("pomegranate_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).nonOpaque()));
    public static final Block POMEGRANATE_SAPLING = registerBlock("pomegranate_sapling",
            new ModSaplingBlock(new PomegranateSaplingGenerator(),
                    FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));
    public static final Block POTTED_POMEGRANATE_SAPLING = registerBlockWithoutBlockItem("potted_pomegranate_sapling",
            new FlowerPotBlock(ModBlocks.POMEGRANATE_SAPLING,
                    FabricBlockSettings.copyOf(Blocks.POTTED_ACACIA_SAPLING).nonOpaque()));

    public static final Block POMEGRANATE_PLANKS = registerBlock("pomegranate_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(2.0f, 3.0f)));

// compressions

    public static final Block ONE_COBBLESTONE = registerBlock("one_cobblestone",
            new Block(FabricBlockSettings.create().strength(2.5F, 8F).requiresTool()));
    public static final Block TWO_COBBLESTONE = registerBlock("two_cobblestone",
            new Block(FabricBlockSettings.create().strength(3F, 10F).requiresTool()));
    public static final Block THREE_COBBLESTONE = registerBlock("three_cobblestone",
            new Block(FabricBlockSettings.create().strength(3F, 12F).requiresTool()));
    public static final Block FOUR_COBBLESTONE = registerBlock("four_cobblestone",
            new Block(FabricBlockSettings.create().strength(3F, 14F).requiresTool()));
    public static final Block FIVE_COBBLESTONE = registerBlock("five_cobblestone",
            new Block(FabricBlockSettings.create().strength(3F, 16F).requiresTool()));
    public static final Block SIX_COBBLESTONE = registerBlock("six_cobblestone",
            new Block(FabricBlockSettings.create().strength(3F, 18F).requiresTool()));
    public static final Block SEVEN_COBBLESTONE = registerBlock("seven_cobblestone",
            new Block(FabricBlockSettings.create().strength(3F, 20F).requiresTool()));
    public static final Block EIGHT_COBBLESTONE = registerBlock("eight_cobblestone",
            new Block(FabricBlockSettings.create().strength(3F, 22F).requiresTool()));
    public static final Block NINE_COBBLESTONE = registerBlock("nine_cobblestone",
            new Block(FabricBlockSettings.create().strength(3F, 24F).requiresTool()));
    public static final Block TEN_COBBLESTONE = registerBlock("ten_cobblestone",
            new Block(FabricBlockSettings.create().strength(3F, 26F).requiresTool()));

    public static final Block ONE_STONE = registerBlock("one_stone",
            new Block(FabricBlockSettings.create().strength(1.5F, 6F).requiresTool()));
    public static final Block TWO_STONE = registerBlock("two_stone",
            new Block(FabricBlockSettings.create().strength(2F, 7.5F).requiresTool()));
    public static final Block THREE_STONE = registerBlock("three_stone",
            new Block(FabricBlockSettings.create().strength(2.5F, 9F).requiresTool()));
    public static final Block FOUR_STONE = registerBlock("four_stone",
            new Block(FabricBlockSettings.create().strength(3F, 11.5F).requiresTool()));
    public static final Block FIVE_STONE = registerBlock("five_stone",
            new Block(FabricBlockSettings.create().strength(3.5F, 13F).requiresTool()));
    public static final Block SIX_STONE = registerBlock("six_stone",
            new Block(FabricBlockSettings.create().strength(4F, 14.5F).requiresTool()));
    public static final Block SEVEN_STONE = registerBlock("seven_stone",
            new Block(FabricBlockSettings.create().strength(4.5F, 16F).requiresTool()));
    public static final Block EIGHT_STONE = registerBlock("eight_stone",
            new Block(FabricBlockSettings.create().strength(5F, 17.5F).requiresTool()));
    public static final Block NINE_STONE = registerBlock("nine_stone",
            new Block(FabricBlockSettings.create().strength(5.5F, 19F).requiresTool()));
    public static final Block TEN_STONE = registerBlock("ten_stone",
            new Block(FabricBlockSettings.create().strength(6F, 20.5F).requiresTool()));

    public static final Block ONE_ANDESITE = registerBlock("one_andesite",
            new Block(FabricBlockSettings.create().strength(1.5F, 6F).requiresTool()));
    public static final Block TWO_ANDESITE = registerBlock("two_andesite",
            new Block(FabricBlockSettings.create().strength(2F, 7.5F).requiresTool()));
    public static final Block THREE_ANDESITE = registerBlock("three_andesite",
            new Block(FabricBlockSettings.create().strength(2.5F, 9F).requiresTool()));
    public static final Block FOUR_ANDESITE = registerBlock("four_andesite",
            new Block(FabricBlockSettings.create().strength(3F, 11.5F).requiresTool()));
    public static final Block FIVE_ANDESITE = registerBlock("five_andesite",
            new Block(FabricBlockSettings.create().strength(3F, 13F).requiresTool()));
    public static final Block SIX_ANDESITE = registerBlock("six_andesite",
            new Block(FabricBlockSettings.create().strength(3F, 14.5F).requiresTool()));
    public static final Block SEVEN_ANDESITE = registerBlock("seven_andesite",
            new Block(FabricBlockSettings.create().strength(3F, 16F).requiresTool()));
    public static final Block EIGHT_ANDESITE = registerBlock("eight_andesite",
            new Block(FabricBlockSettings.create().strength(3F, 17.5F).requiresTool()));
    public static final Block NINE_ANDESITE = registerBlock("nine_andesite",
            new Block(FabricBlockSettings.create().strength(3F, 19F).requiresTool()));
    public static final Block TEN_ANDESITE = registerBlock("ten_andesite",
            new Block(FabricBlockSettings.create().strength(3F, 20.5F).requiresTool()));

    public static final Block ONE_DIORITE = registerBlock("one_diorite",
            new Block(FabricBlockSettings.create().strength(1.5F, 6F).requiresTool()));
    public static final Block TWO_DIORITE = registerBlock("two_diorite",
            new Block(FabricBlockSettings.create().strength(2F, 7.5F).requiresTool()));
    public static final Block THREE_DIORITE = registerBlock("three_diorite",
            new Block(FabricBlockSettings.create().strength(2.5F, 9F).requiresTool()));
    public static final Block FOUR_DIORITE = registerBlock("four_diorite",
            new Block(FabricBlockSettings.create().strength(3F, 11.5F).requiresTool()));
    public static final Block FIVE_DIORITE = registerBlock("five_diorite",
            new Block(FabricBlockSettings.create().strength(3F, 13F).requiresTool()));
    public static final Block SIX_DIORITE = registerBlock("six_diorite",
            new Block(FabricBlockSettings.create().strength(3F, 14.5F).requiresTool()));
    public static final Block SEVEN_DIORITE = registerBlock("seven_diorite",
            new Block(FabricBlockSettings.create().strength(3F, 16F).requiresTool()));
    public static final Block EIGHT_DIORITE = registerBlock("eight_diorite",
            new Block(FabricBlockSettings.create().strength(3F, 17.5F).requiresTool()));
    public static final Block NINE_DIORITE = registerBlock("nine_diorite",
            new Block(FabricBlockSettings.create().strength(3F, 19F).requiresTool()));
    public static final Block TEN_DIORITE = registerBlock("ten_diorite",
            new Block(FabricBlockSettings.create().strength(3F, 20.5F).requiresTool()));

    public static final Block ONE_GRANITE = registerBlock("one_granite",
            new Block(FabricBlockSettings.create().strength(1.5F, 6F).requiresTool()));
    public static final Block TWO_GRANITE = registerBlock("two_granite",
            new Block(FabricBlockSettings.create().strength(2F, 7.5F).requiresTool()));
    public static final Block THREE_GRANITE = registerBlock("three_granite",
            new Block(FabricBlockSettings.create().strength(2.5F, 9F).requiresTool()));
    public static final Block FOUR_GRANITE = registerBlock("four_granite",
            new Block(FabricBlockSettings.create().strength(3F, 11.5F).requiresTool()));
    public static final Block FIVE_GRANITE = registerBlock("five_granite",
            new Block(FabricBlockSettings.create().strength(3F, 13F).requiresTool()));
    public static final Block SIX_GRANITE = registerBlock("six_granite",
            new Block(FabricBlockSettings.create().strength(3F, 14.5F).requiresTool()));
    public static final Block SEVEN_GRANITE = registerBlock("seven_granite",
            new Block(FabricBlockSettings.create().strength(3F, 16F).requiresTool()));
    public static final Block EIGHT_GRANITE = registerBlock("eight_granite",
            new Block(FabricBlockSettings.create().strength(3F, 17.5F).requiresTool()));
    public static final Block NINE_GRANITE = registerBlock("nine_granite",
            new Block(FabricBlockSettings.create().strength(3F, 19F).requiresTool()));
    public static final Block TEN_GRANITE = registerBlock("ten_granite",
            new Block(FabricBlockSettings.create().strength(3F, 20.5F).requiresTool()));

    public static final Block ONE_DEEPSLATE = registerBlock("one_deepslate",
            new PillarBlock(FabricBlockSettings.create().strength(4F, 7.5F).sounds(BlockSoundGroup.DEEPSLATE).requiresTool()));
    public static final Block TWO_DEEPSLATE = registerBlock("two_deepslate",
            new PillarBlock(FabricBlockSettings.create().strength(4F, 9F).sounds(BlockSoundGroup.DEEPSLATE).requiresTool()));
    public static final Block THREE_DEEPSLATE = registerBlock("three_deepslate",
            new PillarBlock(FabricBlockSettings.create().strength(4F, 11.5F).sounds(BlockSoundGroup.DEEPSLATE).requiresTool()));
    public static final Block FOUR_DEEPSLATE = registerBlock("four_deepslate",
            new PillarBlock(FabricBlockSettings.create().strength(4F, 13F).sounds(BlockSoundGroup.DEEPSLATE).requiresTool()));
    public static final Block FIVE_DEEPSLATE = registerBlock("five_deepslate",
            new PillarBlock(FabricBlockSettings.create().strength(4F, 14.5F).sounds(BlockSoundGroup.DEEPSLATE).requiresTool()));
    public static final Block SIX_DEEPSLATE = registerBlock("six_deepslate",
            new PillarBlock(FabricBlockSettings.create().strength(4F, 16F).sounds(BlockSoundGroup.DEEPSLATE).requiresTool()));
    public static final Block SEVEN_DEEPSLATE = registerBlock("seven_deepslate",
            new PillarBlock(FabricBlockSettings.create().strength(4F, 17.5F).sounds(BlockSoundGroup.DEEPSLATE).requiresTool()));
    public static final Block EIGHT_DEEPSLATE = registerBlock("eight_deepslate",
            new PillarBlock(FabricBlockSettings.create().strength(4F, 19F).sounds(BlockSoundGroup.DEEPSLATE).requiresTool()));
    public static final Block NINE_DEEPSLATE = registerBlock("nine_deepslate",
            new PillarBlock(FabricBlockSettings.create().strength(4F, 20.5F).sounds(BlockSoundGroup.DEEPSLATE).requiresTool()));
    public static final Block TEN_DEEPSLATE = registerBlock("ten_deepslate",
            new PillarBlock(FabricBlockSettings.create().strength(4F, 22F).sounds(BlockSoundGroup.DEEPSLATE).requiresTool()));

    public static final Block ONE_COBBLED_DEEPSLATE = registerBlock("one_cobbled_deepslate",
            new Block(FabricBlockSettings.create().strength(4F, 7.5F).sounds(BlockSoundGroup.DEEPSLATE).requiresTool()));
    public static final Block TWO_COBBLED_DEEPSLATE = registerBlock("two_cobbled_deepslate",
            new Block(FabricBlockSettings.create().strength(4F, 9F).sounds(BlockSoundGroup.DEEPSLATE).requiresTool()));
    public static final Block THREE_COBBLED_DEEPSLATE = registerBlock("three_cobbled_deepslate",
            new Block(FabricBlockSettings.create().strength(4F, 11.5F).sounds(BlockSoundGroup.DEEPSLATE).requiresTool()));
    public static final Block FOUR_COBBLED_DEEPSLATE = registerBlock("four_cobbled_deepslate",
            new Block(FabricBlockSettings.create().strength(4F, 13F).sounds(BlockSoundGroup.DEEPSLATE).requiresTool()));
    public static final Block FIVE_COBBLED_DEEPSLATE = registerBlock("five_cobbled_deepslate",
            new Block(FabricBlockSettings.create().strength(4F, 14.5F).sounds(BlockSoundGroup.DEEPSLATE).requiresTool()));
    public static final Block SIX_COBBLED_DEEPSLATE = registerBlock("six_cobbled_deepslate",
            new Block(FabricBlockSettings.create().strength(4F, 16F).sounds(BlockSoundGroup.DEEPSLATE).requiresTool()));
    public static final Block SEVEN_COBBLED_DEEPSLATE = registerBlock("seven_cobbled_deepslate",
            new Block(FabricBlockSettings.create().strength(4F, 17.5F).sounds(BlockSoundGroup.DEEPSLATE).requiresTool()));
    public static final Block EIGHT_COBBLED_DEEPSLATE = registerBlock("eight_cobbled_deepslate",
            new Block(FabricBlockSettings.create().strength(4F, 19F).sounds(BlockSoundGroup.DEEPSLATE).requiresTool()));
    public static final Block NINE_COBBLED_DEEPSLATE = registerBlock("nine_cobbled_deepslate",
            new Block(FabricBlockSettings.create().strength(4F, 20.5F).sounds(BlockSoundGroup.DEEPSLATE).requiresTool()));
    public static final Block TEN_COBBLED_DEEPSLATE = registerBlock("ten_cobbled_deepslate",
            new Block(FabricBlockSettings.create().strength(4F, 22F).sounds(BlockSoundGroup.DEEPSLATE).requiresTool()));

    public static final Block ONE_BASALT = registerBlock("one_basalt",
            new PillarBlock(FabricBlockSettings.create().strength(1.5F, 6F).sounds(BlockSoundGroup.BASALT).requiresTool()));
    public static final Block TWO_BASALT = registerBlock("two_basalt",
            new PillarBlock(FabricBlockSettings.create().strength(2F, 7.5F).sounds(BlockSoundGroup.BASALT).requiresTool()));
    public static final Block THREE_BASALT = registerBlock("three_basalt",
            new PillarBlock(FabricBlockSettings.create().strength(2.5F, 9F).sounds(BlockSoundGroup.BASALT).requiresTool()));
    public static final Block FOUR_BASALT = registerBlock("four_basalt",
            new PillarBlock(FabricBlockSettings.create().strength(3F, 11.5F).sounds(BlockSoundGroup.BASALT).requiresTool()));
    public static final Block FIVE_BASALT = registerBlock("five_basalt",
            new PillarBlock(FabricBlockSettings.create().strength(3F, 13F).sounds(BlockSoundGroup.BASALT).requiresTool()));
    public static final Block SIX_BASALT = registerBlock("six_basalt",
            new PillarBlock(FabricBlockSettings.create().strength(3F, 14.5F).sounds(BlockSoundGroup.BASALT).requiresTool()));
    public static final Block SEVEN_BASALT = registerBlock("seven_basalt",
            new PillarBlock(FabricBlockSettings.create().strength(3F, 16F).sounds(BlockSoundGroup.BASALT).requiresTool()));
    public static final Block EIGHT_BASALT = registerBlock("eight_basalt",
            new PillarBlock(FabricBlockSettings.create().strength(3F, 17.5F).sounds(BlockSoundGroup.BASALT).requiresTool()));
    public static final Block NINE_BASALT = registerBlock("nine_basalt",
            new PillarBlock(FabricBlockSettings.create().strength(3F, 19F).sounds(BlockSoundGroup.BASALT).requiresTool()));
    public static final Block TEN_BASALT = registerBlock("ten_basalt",
            new PillarBlock(FabricBlockSettings.create().strength(3F, 20.5F).sounds(BlockSoundGroup.BASALT).requiresTool()));

    public static final Block ONE_BLACKSTONE = registerBlock("one_blackstone",
            new Block(FabricBlockSettings.create().strength(2.5F, 8F).requiresTool()));
    public static final Block TWO_BLACKSTONE = registerBlock("two_blackstone",
            new Block(FabricBlockSettings.create().strength(3F, 10F).requiresTool()));
    public static final Block THREE_BLACKSTONE = registerBlock("three_blackstone",
            new Block(FabricBlockSettings.create().strength(3F, 12F).requiresTool()));
    public static final Block FOUR_BLACKSTONE = registerBlock("four_blackstone",
            new Block(FabricBlockSettings.create().strength(3F, 14F).requiresTool()));
    public static final Block FIVE_BLACKSTONE = registerBlock("five_blackstone",
            new Block(FabricBlockSettings.create().strength(3F, 16F).requiresTool()));
    public static final Block SIX_BLACKSTONE = registerBlock("six_blackstone",
            new Block(FabricBlockSettings.create().strength(3F, 18F).requiresTool()));
    public static final Block SEVEN_BLACKSTONE = registerBlock("seven_blackstone",
            new Block(FabricBlockSettings.create().strength(3F, 20F).requiresTool()));
    public static final Block EIGHT_BLACKSTONE = registerBlock("eight_blackstone",
            new Block(FabricBlockSettings.create().strength(3F, 22F).requiresTool()));
    public static final Block NINE_BLACKSTONE = registerBlock("nine_blackstone",
            new Block(FabricBlockSettings.create().strength(3F, 24F).requiresTool()));
    public static final Block TEN_BLACKSTONE = registerBlock("ten_blackstone",
            new Block(FabricBlockSettings.create().strength(3F, 26F).requiresTool()));

    public static final Block ONE_NETHERRACK = registerBlock("one_netherrack",
            new Block(FabricBlockSettings.create().strength(0.8F).sounds(BlockSoundGroup.NETHERRACK).requiresTool()));
    public static final Block TWO_NETHERRACK = registerBlock("two_netherrack",
            new Block(FabricBlockSettings.create().strength(1.2F).sounds(BlockSoundGroup.NETHERRACK).requiresTool()));
    public static final Block THREE_NETHERRACK = registerBlock("three_netherrack",
            new Block(FabricBlockSettings.create().strength(1.6F).sounds(BlockSoundGroup.NETHERRACK).requiresTool()));
    public static final Block FOUR_NETHERRACK = registerBlock("four_netherrack",
            new Block(FabricBlockSettings.create().strength(2F).sounds(BlockSoundGroup.NETHERRACK).requiresTool()));
    public static final Block FIVE_NETHERRACK = registerBlock("five_netherrack",
            new Block(FabricBlockSettings.create().strength(2.4F).sounds(BlockSoundGroup.NETHERRACK).requiresTool()));
    public static final Block SIX_NETHERRACK = registerBlock("six_netherrack",
            new Block(FabricBlockSettings.create().strength(2.8F).sounds(BlockSoundGroup.NETHERRACK).requiresTool()));
    public static final Block SEVEN_NETHERRACK = registerBlock("seven_netherrack",
            new Block(FabricBlockSettings.create().strength(3.2F).sounds(BlockSoundGroup.NETHERRACK).requiresTool()));
    public static final Block EIGHT_NETHERRACK = registerBlock("eight_netherrack",
            new Block(FabricBlockSettings.create().strength(3.6F).sounds(BlockSoundGroup.NETHERRACK).requiresTool()));
    public static final Block NINE_NETHERRACK = registerBlock("nine_netherrack",
            new Block(FabricBlockSettings.create().strength(4F).sounds(BlockSoundGroup.NETHERRACK).requiresTool()));
    public static final Block TEN_NETHERRACK = registerBlock("ten_netherrack",
            new Block(FabricBlockSettings.create().strength(4.4F).sounds(BlockSoundGroup.NETHERRACK).requiresTool()));

    public static final Block ONE_DIRT = registerBlock("one_dirt",
            new Block(FabricBlockSettings.create().strength(0.7F).sounds(BlockSoundGroup.GRAVEL).requiresTool()));
    public static final Block TWO_DIRT = registerBlock("two_dirt",
            new Block(FabricBlockSettings.create().strength(0.9F).sounds(BlockSoundGroup.GRAVEL).requiresTool()));
    public static final Block THREE_DIRT = registerBlock("three_dirt",
            new Block(FabricBlockSettings.create().strength(1.1F).sounds(BlockSoundGroup.GRAVEL).requiresTool()));
    public static final Block FOUR_DIRT = registerBlock("four_dirt",
            new Block(FabricBlockSettings.create().strength(1.3F).sounds(BlockSoundGroup.GRAVEL).requiresTool()));
    public static final Block FIVE_DIRT = registerBlock("five_dirt",
            new Block(FabricBlockSettings.create().strength(1.5F).sounds(BlockSoundGroup.GRAVEL).requiresTool()));
    public static final Block SIX_DIRT = registerBlock("six_dirt",
            new Block(FabricBlockSettings.create().strength(1.7F).sounds(BlockSoundGroup.GRAVEL).requiresTool()));
    public static final Block SEVEN_DIRT = registerBlock("seven_dirt",
            new Block(FabricBlockSettings.create().strength(1.9F).sounds(BlockSoundGroup.GRAVEL).requiresTool()));
    public static final Block EIGHT_DIRT = registerBlock("eight_dirt",
            new Block(FabricBlockSettings.create().strength(2.1F).sounds(BlockSoundGroup.GRAVEL).requiresTool()));
    public static final Block NINE_DIRT = registerBlock("nine_dirt",
            new Block(FabricBlockSettings.create().strength(2.3F).sounds(BlockSoundGroup.GRAVEL).requiresTool()));
    public static final Block TEN_DIRT = registerBlock("ten_dirt",
            new Block(FabricBlockSettings.create().strength(2.5F).sounds(BlockSoundGroup.GRAVEL).requiresTool()));

    public static final Block ONE_SAND = registerBlock("one_sand",
            new Block(FabricBlockSettings.create().strength(0.7F).sounds(BlockSoundGroup.SAND).requiresTool()));
    public static final Block TWO_SAND = registerBlock("two_sand",
            new Block(FabricBlockSettings.create().strength(0.9F).sounds(BlockSoundGroup.SAND).requiresTool()));
    public static final Block THREE_SAND = registerBlock("three_sand",
            new Block(FabricBlockSettings.create().strength(1.1F).sounds(BlockSoundGroup.SAND).requiresTool()));
    public static final Block FOUR_SAND = registerBlock("four_sand",
            new Block(FabricBlockSettings.create().strength(1.3F).sounds(BlockSoundGroup.SAND).requiresTool()));
    public static final Block FIVE_SAND = registerBlock("five_sand",
            new Block(FabricBlockSettings.create().strength(1.5F).sounds(BlockSoundGroup.SAND).requiresTool()));
    public static final Block SIX_SAND = registerBlock("six_sand",
            new Block(FabricBlockSettings.create().strength(1.7F).sounds(BlockSoundGroup.SAND).requiresTool()));
    public static final Block SEVEN_SAND = registerBlock("seven_sand",
            new Block(FabricBlockSettings.create().strength(1.9F).sounds(BlockSoundGroup.SAND).requiresTool()));
    public static final Block EIGHT_SAND = registerBlock("eight_sand",
            new Block(FabricBlockSettings.create().strength(2.1F).sounds(BlockSoundGroup.SAND).requiresTool()));
    public static final Block NINE_SAND = registerBlock("nine_sand",
            new Block(FabricBlockSettings.create().strength(2.3F).sounds(BlockSoundGroup.SAND).requiresTool()));
    public static final Block TEN_SAND = registerBlock("ten_sand",
            new Block(FabricBlockSettings.create().strength(2.5F).sounds(BlockSoundGroup.SAND).requiresTool()));

    public static final Block ONE_GRAVEL = registerBlock("one_gravel",
            new Block(FabricBlockSettings.create().strength(0.8F).sounds(BlockSoundGroup.GRAVEL).requiresTool()));
    public static final Block TWO_GRAVEL = registerBlock("two_gravel",
            new Block(FabricBlockSettings.create().strength(1F).sounds(BlockSoundGroup.GRAVEL).requiresTool()));
    public static final Block THREE_GRAVEL = registerBlock("three_gravel",
            new Block(FabricBlockSettings.create().strength(1.2F).sounds(BlockSoundGroup.GRAVEL).requiresTool()));
    public static final Block FOUR_GRAVEL = registerBlock("four_gravel",
            new Block(FabricBlockSettings.create().strength(1.4F).sounds(BlockSoundGroup.GRAVEL).requiresTool()));
    public static final Block FIVE_GRAVEL = registerBlock("five_gravel",
            new Block(FabricBlockSettings.create().strength(1.6F).sounds(BlockSoundGroup.GRAVEL).requiresTool()));
    public static final Block SIX_GRAVEL = registerBlock("six_gravel",
            new Block(FabricBlockSettings.create().strength(1.8F).sounds(BlockSoundGroup.GRAVEL).requiresTool()));
    public static final Block SEVEN_GRAVEL = registerBlock("seven_gravel",
            new Block(FabricBlockSettings.create().strength(1F).sounds(BlockSoundGroup.GRAVEL).requiresTool()));
    public static final Block EIGHT_GRAVEL = registerBlock("eight_gravel",
            new Block(FabricBlockSettings.create().strength(2.1F).sounds(BlockSoundGroup.GRAVEL).requiresTool()));
    public static final Block NINE_GRAVEL = registerBlock("nine_gravel",
            new Block(FabricBlockSettings.create().strength(2.4F).sounds(BlockSoundGroup.GRAVEL).requiresTool()));
    public static final Block TEN_GRAVEL = registerBlock("ten_gravel",
            new Block(FabricBlockSettings.create().strength(2.6F).sounds(BlockSoundGroup.GRAVEL).requiresTool()));

    public static final Block HALITE = registerBlock("halite",
            new Block(FabricBlockSettings.create().strength(1.5f,6f)));
    public static final Block DEEPSLATE_HALITE = registerBlock("deepslate_halite",
            new Block(FabricBlockSettings.create().strength(1.8f,7f)));


    public static final Block GRAPE_VINE = registerBlockWithoutBlockItem("grape_vine",
            new GrapeVineBlock(FabricBlockSettings.copyOf(Blocks.WHEAT).nonOpaque()));
    public static final Block BLUEBERRY_BUSH = registerBlockWithoutBlockItem("blueberry_bush",
            new BlueberryBushBlock(FabricBlockSettings.copyOf(Blocks.WHEAT).nonOpaque()));
    public static final Block CORN = registerBlockWithoutBlockItem("corn",
            new CornBlock(FabricBlockSettings.copyOf(Blocks.WHEAT).nonOpaque()));
    public static final Block PARSNIP = registerBlockWithoutBlockItem("parsnip",
            new ParsnipBlock(FabricBlockSettings.copyOf(Blocks.WHEAT).nonOpaque()));
    public static final Block STRAWBERRY_BUSH = registerBlockWithoutBlockItem("strawberry_bush",
            new BlueberryBushBlock(FabricBlockSettings.copyOf(Blocks.WHEAT).nonOpaque()));
    public static final Block EGGPLANT = registerBlockWithoutBlockItem("eggplant",
            new EggplantBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));
    public static final Block TOMATO = registerBlockWithoutBlockItem("tomato",
            new TomatoBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));
    public static final Block BAKCHOY = registerBlockWithoutBlockItem("bakchoy",
            new BakchoyBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));
    public static final Block BROCCOLI = registerBlockWithoutBlockItem("broccoli",
            new BroccoliBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));
    public static final Block CAULIFLOWER = registerBlockWithoutBlockItem("cauliflower",
            new CauliflowerBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));
    public static final Block CABBAGE = registerBlockWithoutBlockItem("cabbage",
            new CabbageBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));
    public static final Block CELERY = registerBlockWithoutBlockItem("celery",
            new CeleryBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));
    public static final Block CINNAMON = registerBlockWithoutBlockItem("cinnamon",
            new CinnamonBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));
    public static final Block CHESTNUT = registerBlockWithoutBlockItem("chestnut",
            new ChestnutBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));
    public static final Block CUCUMBER = registerBlockWithoutBlockItem("cucumber",
            new CucumberBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));
    public static final Block MINT = registerBlockWithoutBlockItem("mint",
            new MintBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));
    public static final Block VANILLA = registerBlockWithoutBlockItem("vanilla",
            new VanillaBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));
    public static final Block UBE = registerBlockWithoutBlockItem("ube",
            new UbeBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));
    public static final Block KALE = registerBlockWithoutBlockItem("kale",
            new KaleBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));
    public static final Block SCALLION = registerBlockWithoutBlockItem("scallion",
            new ScallionBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));
    public static final Block LETTUCE = registerBlockWithoutBlockItem("lettuce",
            new LettuceBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));
    public static final Block GINGER = registerBlockWithoutBlockItem("ginger",
            new GingerBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));
    public static final Block SPINACH = registerBlockWithoutBlockItem("spinach",
            new SpinachBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));
    public static final Block YAM = registerBlockWithoutBlockItem("yam",
            new YamBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));
    public static final Block PINEAPPLE = registerBlockWithoutBlockItem("pineapple",
            new PineappleBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));
    public static final Block HOT_PEPPER = registerBlockWithoutBlockItem("hot_pepper",
            new HotPepperBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));
    public static final Block ONION = registerBlockWithoutBlockItem("onion",
            new OnionBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));
    public static final Block GARLIC = registerBlockWithoutBlockItem("garlic",
            new GarlicBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));
    public static final Block BLACK_BEANS = registerBlockWithoutBlockItem("black_beans",
            new BlackBeanBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));
    public static final Block GREEN_BEANS = registerBlockWithoutBlockItem("green_beans",
            new GreenBeanBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));
    public static final Block RED_BEANS = registerBlockWithoutBlockItem("red_beans",
            new RedBeanBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));
    public static final Block ALMOND = registerBlockWithoutBlockItem("almond",
            new AlmondBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));
    public static final Block CHICKPEA = registerBlockWithoutBlockItem("chickpea",
            new ChickpeaBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));
    public static final Block PISTACHIO = registerBlockWithoutBlockItem("pistachio",
            new PistachioBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(RandomThingsMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        Item item = Registry.register(Registries.ITEM, new Identifier(RandomThingsMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
        return item;
    }
    private static Block registerBlockWithoutBlockItem(String name, Block block) {
        return Registry.register(Registries.BLOCK, new Identifier(RandomThingsMod.MOD_ID, name), block);
    }


    public static void registerModBlocks() {
        RandomThingsMod.LOGGER.info("Registering ModBlocks for " + RandomThingsMod.MOD_ID);
    }
}