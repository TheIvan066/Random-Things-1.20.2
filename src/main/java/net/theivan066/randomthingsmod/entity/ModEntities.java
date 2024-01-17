package net.theivan066.randomthingsmod.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.theivan066.randomthingsmod.RandomThingsMod;
import net.theivan066.randomthingsmod.entity.custom.*;


public class ModEntities {
    public static final EntityType<MummyEntity> MUMMY = Registry.register(
            Registries.ENTITY_TYPE, new Identifier(RandomThingsMod.MOD_ID, "mummy"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, MummyEntity::new)
                    .dimensions(EntityDimensions.fixed(0.6f, 1.95f)).build());

    public static final EntityType<NatsuEntity> NATSU = Registry.register(
            Registries.ENTITY_TYPE, new Identifier(RandomThingsMod.MOD_ID, "natsu"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, NatsuEntity::new)
                    .dimensions(EntityDimensions.fixed(0.6f, 1.8f)).build());

    public static final EntityType<ZerofourEntity> ZEROFOUR = Registry.register(
            Registries.ENTITY_TYPE, new Identifier(RandomThingsMod.MOD_ID, "zerofour"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, ZerofourEntity::new)
                    .dimensions(EntityDimensions.fixed(0.6f, 1.8f)).build());

    public static final EntityType<ToraEntity> TORA = Registry.register(
            Registries.ENTITY_TYPE, new Identifier(RandomThingsMod.MOD_ID, "tora"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, ToraEntity::new)
                    .dimensions(EntityDimensions.fixed(0.6f, 1.8f)).build());

    public static final EntityType<YagiEntity> YAGI = Registry.register(
            Registries.ENTITY_TYPE, new Identifier(RandomThingsMod.MOD_ID, "yagi"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, YagiEntity::new)
                    .dimensions(EntityDimensions.fixed(0.6f, 1.8f)).build());

//    public static final EntityType<TigerEntity> TIGER = Registry.register(
//            Registries.ENTITY_TYPE, new Identifier(RandomThingsMod.MOD_ID, "tiger"),
//            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, TigerEntity::new)
//                    .dimensions(EntityDimensions.fixed(1.5f, 1.75f)).build());

    public static final EntityType<PorcupineEntity> PORCUPINE = Registry.register(
            Registries.ENTITY_TYPE, new Identifier(RandomThingsMod.MOD_ID, "porcupine"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, PorcupineEntity::new)
                    .dimensions(EntityDimensions.fixed(1f, 1f)).build());



}