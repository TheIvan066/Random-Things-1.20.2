package net.theivan066.randomthingsmod.world.feature.tree;

import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.theivan066.randomthingsmod.world.feature.ModConfiguredFeatures;
import org.jetbrains.annotations.Nullable;

public class CherrySaplingGenerator extends SaplingGenerator {
    @Nullable
    @Override
    protected RegistryKey<ConfiguredFeature<?, ?>> getTreeFeature(Random random, boolean bees) {
        return ModConfiguredFeatures.CHERRY;
    }
}
