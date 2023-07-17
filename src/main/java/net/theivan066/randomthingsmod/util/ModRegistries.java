package net.theivan066.randomthingsmod.util;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.minecraft.item.Items;
import net.theivan066.randomthingsmod.RandomThingsMod;
import net.theivan066.randomthingsmod.block.ModBlocks;
import net.theivan066.randomthingsmod.entity.ModEntities;
import net.theivan066.randomthingsmod.entity.custom.*;
import net.theivan066.randomthingsmod.item.ModItems;

public class ModRegistries {
    public static void registerModStuffs() {
        FuelRegistry.registerFuels();
        StrippableRegistry.registerStrippables();
        FlammableRegistry.registerFlammableBlock();
        AttributeRegistry.registerAttributes();
    }
}
