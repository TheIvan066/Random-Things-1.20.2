package net.theivan066.randomthingsmod.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;
import net.theivan066.randomthingsmod.world.feature.ModPlacedFeatures;

public class ModTreeGeneration {
    public static void generateTrees() {


        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.JUNGLE),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.BANANA_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.PLAINS, BiomeKeys.SUNFLOWER_PLAINS),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.PEAR_PLACED_KEY);
    }
}