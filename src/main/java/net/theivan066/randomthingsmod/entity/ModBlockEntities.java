package net.theivan066.randomthingsmod.entity;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.theivan066.randomthingsmod.RandomThingsMod;
import net.theivan066.randomthingsmod.block.ModBlocks;
import net.theivan066.randomthingsmod.entity.block_entity.NetherReactorCoreBlockEntity;

public class ModBlockEntities {

    public static BlockEntityType<NetherReactorCoreBlockEntity> NETHER_REACTOR_CORE;

    public static void registerBlockEntities() {
       NETHER_REACTOR_CORE = Registry.register(Registries.BLOCK_ENTITY_TYPE,
                new Identifier(RandomThingsMod.MOD_ID, "nether_reactor_core"),
                FabricBlockEntityTypeBuilder.create(NetherReactorCoreBlockEntity::new,
                        ModBlocks.NETHER_REACTOR_CORE).build(null));
    }
}
