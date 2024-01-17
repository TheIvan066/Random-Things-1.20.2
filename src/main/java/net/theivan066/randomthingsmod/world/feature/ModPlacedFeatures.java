package net.theivan066.randomthingsmod.world.feature;

import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.*;
import net.theivan066.randomthingsmod.RandomThingsMod;
import net.theivan066.randomthingsmod.block.ModBlocks;

import java.util.List;


public class ModPlacedFeatures {
    public static final RegistryKey<PlacedFeature> CHERRY_PLACED_KEY = registerKey("cherry_placed");
    public static final RegistryKey<PlacedFeature> BETA_PLACED_KEY = registerKey("beta_placed");
    public static final RegistryKey<PlacedFeature> CITRUS_PLACED_KEY = registerKey("citrus_placed");
    public static final RegistryKey<PlacedFeature> MANGO_PLACED_KEY = registerKey("mango_placed");
    public static final RegistryKey<PlacedFeature> ORANGE_PLACED_KEY = registerKey("orange_placed");
    public static final RegistryKey<PlacedFeature> PEACH_PLACED_KEY = registerKey("peach_placed");
    public static final RegistryKey<PlacedFeature> PEAR_PLACED_KEY = registerKey("pear_placed");
    public static final RegistryKey<PlacedFeature> POMEGRANATE_PLACED_KEY = registerKey("pomegranate_placed");
    public static final RegistryKey<PlacedFeature> BANANA_PLACED_KEY = registerKey("banana_placed");
    public static final RegistryKey<PlacedFeature> HALITE_ORE_PLACED_KEY = registerKey("halite_ore_placed");

  /*  public static final RegistryEntry<PlacedFeature> LILAC_PLACED = PlacedFeatures.register("lilac_placed",
            ModConfiguredFeatures.LILAC_FLOWER, RarityFilterPlacementModifier.of(4), SquarePlacementModifier.of(),
            PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of()); */

  public static void bootstrap(Registerable<PlacedFeature> context) {
      var configuredFeatureRegistryEntryLookup = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

      register(context, HALITE_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.HALITE_ORE_KEY),
              modifiersWithCount(12, // VeinsPerChunk
                      HeightRangePlacementModifier.uniform(YOffset.aboveBottom(0), YOffset.belowTop(80))));


      register(context, CHERRY_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.CHERRY),
              VegetationPlacedFeatures.treeModifiersWithWouldSurvive(PlacedFeatures.createCountExtraModifier(1, 0.1f, 0), ModBlocks.CHERRY_SAPLING));

      register(context, CITRUS_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.CITRUS),
              VegetationPlacedFeatures.treeModifiersWithWouldSurvive(PlacedFeatures.createCountExtraModifier(1, 0.1f, 1), ModBlocks.CITRUS_SAPLING));

      register(context, BETA_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.BETA),
              VegetationPlacedFeatures.treeModifiersWithWouldSurvive(PlacedFeatures.createCountExtraModifier(1, 0.05f, 0), ModBlocks.BETA_SAPLING));

      register(context, MANGO_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.MANGO),
              VegetationPlacedFeatures.treeModifiersWithWouldSurvive(PlacedFeatures.createCountExtraModifier(1, 0.1f, 1), ModBlocks.MANGO_SAPLING));

      register(context, ORANGE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.ORANGE),
              VegetationPlacedFeatures.treeModifiersWithWouldSurvive(PlacedFeatures.createCountExtraModifier(1, 0.1f, 1), ModBlocks.ORANGE_SAPLING));

      register(context, PEACH_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.PEACH),
              VegetationPlacedFeatures.treeModifiersWithWouldSurvive(PlacedFeatures.createCountExtraModifier(1, 0.1f, 0), ModBlocks.PEACH_SAPLING));

      register(context, PEAR_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.PEAR),
              VegetationPlacedFeatures.treeModifiersWithWouldSurvive(PlacedFeatures.createCountExtraModifier(1, 0.1f, 0), ModBlocks.PEAR_SAPLING));

      register(context, POMEGRANATE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.POMEGRANATE),
              VegetationPlacedFeatures.treeModifiersWithWouldSurvive(PlacedFeatures.createCountExtraModifier(1, 0.2f, 0), ModBlocks.POMEGRANATE_SAPLING));

      register(context, BANANA_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.BANANA),
              VegetationPlacedFeatures.treeModifiersWithWouldSurvive(PlacedFeatures.createCountExtraModifier(1, 0.1f, 1), ModBlocks.BANANA_SAPLING));

  }

    public static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(RandomThingsMod.MOD_ID, name));
    }

    private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key,
                                                                                   RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                                                                   PlacementModifier... modifiers) {
        register(context, key, configuration, List.of(modifiers));
    }
    private static List<PlacementModifier> modifiers(PlacementModifier countModifier, PlacementModifier heightModifier) {
        return List.of(countModifier, SquarePlacementModifier.of(), heightModifier, BiomePlacementModifier.of());
    }
    private static List<PlacementModifier> modifiersWithCount(int count, PlacementModifier heightModifier) {
        return modifiers(CountPlacementModifier.of(count), heightModifier);
    }
    private static List<PlacementModifier> modifiersWithRarity(int chance, PlacementModifier heightModifier) {
        return modifiers(RarityFilterPlacementModifier.of(chance), heightModifier);
    }



}