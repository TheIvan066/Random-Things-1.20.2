package net.theivan066.randomthingsmod.world.feature;

import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.*;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.BendingTrunkPlacer;
import net.minecraft.world.gen.trunk.ForkingTrunkPlacer;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;
import net.theivan066.randomthingsmod.RandomThingsMod;
import net.theivan066.randomthingsmod.block.ModBlocks;

import java.util.List;

public class ModConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?,?>> CHERRY = registerKey("trees_cherry");
    public static final RegistryKey<ConfiguredFeature<?,?>> BETA = ConfiguredFeatures.of("trees_beta");
    public static final RegistryKey<ConfiguredFeature<?,?>> CITRUS = registerKey("trees_citrus");
    public static final RegistryKey<ConfiguredFeature<?,?>> MANGO = registerKey("trees_mango");
    public static final RegistryKey<ConfiguredFeature<?,?>> ORANGE = registerKey("trees_orange");
    public static final RegistryKey<ConfiguredFeature<?,?>> PEACH = registerKey("trees_peach");
    public static final RegistryKey<ConfiguredFeature<?,?>> PEAR = registerKey("trees_pear");
    public static final RegistryKey<ConfiguredFeature<?,?>> POMEGRANATE = registerKey("trees_pomegranate");
    public static final RegistryKey<ConfiguredFeature<?,?>> BANANA = registerKey("trees_banana");
    public static final RegistryKey<ConfiguredFeature<?,?>> HALITE_ORE_KEY = registerKey("halite_ore");

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {

        //Ore _______________________________________________________________________________________________________
        RuleTest stoneReplaceables = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);

        List<OreFeatureConfig.Target> overworldHaliteOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.HALITE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.DEEPSLATE_HALITE.getDefaultState()));

        register(context, HALITE_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldHaliteOres, 12));

        //Tree _______________________________________________________________________________________________________

        register(context, CHERRY, Feature.TREE, new TreeFeatureConfig.Builder(
            BlockStateProvider.of(ModBlocks.CHERRY_LOG),
                new StraightTrunkPlacer(5, 1, 2),
                BlockStateProvider.of(ModBlocks.CHERRY_LEAVES),
            new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),
            new TwoLayersFeatureSize(1, 0, 2)).build());

        register(context, BETA, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlocks.BETA_LOG),
                new StraightTrunkPlacer(5, 1, 0),
                BlockStateProvider.of(ModBlocks.BETA_LEAVES),
                new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),
                new TwoLayersFeatureSize(1, 0, 2)).build());

        register(context, CITRUS, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlocks.CITRUS_LOG),
                new BendingTrunkPlacer(4, 1, 1,2,ConstantIntProvider.create(4)),
                BlockStateProvider.of(ModBlocks.CITRUS_LEAVES),
                new JungleFoliagePlacer(ConstantIntProvider.create(1), ConstantIntProvider.create(0), 4),
                new TwoLayersFeatureSize(1, 0, 2)).build());

        register(context, MANGO, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlocks.MANGO_LOG),
                new StraightTrunkPlacer(4, 1, 2),
                BlockStateProvider.of(ModBlocks.MANGO_LEAVES),
                new DarkOakFoliagePlacer(ConstantIntProvider.create(0), ConstantIntProvider.create(0)),
                new TwoLayersFeatureSize(1, 0, 2)).build());

        register(context, ORANGE, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlocks.ORANGE_LOG),
                new ForkingTrunkPlacer(5, 1, 2),
                BlockStateProvider.of(ModBlocks.ORANGE_LEAVES),
                new AcaciaFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0)),
                new TwoLayersFeatureSize(1, 0, 2)).build());

        register(context, PEACH, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlocks.PEACH_LOG),
                new StraightTrunkPlacer(2, 4, 5),
                BlockStateProvider.of(ModBlocks.PEACH_LEAVES),
                new AcaciaFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(1)),
                new TwoLayersFeatureSize(1, 0, 2)).build());

        register(context, PEAR, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlocks.PEAR_LOG),
                new StraightTrunkPlacer(4, 1, 0),
                BlockStateProvider.of(ModBlocks.PEAR_LEAVES),
                new PineFoliagePlacer(ConstantIntProvider.create(1), ConstantIntProvider.create(0),ConstantIntProvider.create(4)),
                new TwoLayersFeatureSize(1, 0, 2)).build());

        register(context, POMEGRANATE, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlocks.POMEGRANATE_LOG),
                new StraightTrunkPlacer(4, 1, 2),
                BlockStateProvider.of(ModBlocks.POMEGRANATE_LEAVES),
                new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0),2),
                new TwoLayersFeatureSize(1, 0, 2)).build());

        register(context, BANANA, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlocks.BANANA_TRUNK),
                new StraightTrunkPlacer(3, 1, 2),
                BlockStateProvider.of(ModBlocks.BANANA_LEAVES),
                new JungleFoliagePlacer(ConstantIntProvider.create(1), ConstantIntProvider.create(0),3),
                new TwoLayersFeatureSize(1, 0, 2)).build());

    }
    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(RandomThingsMod.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}