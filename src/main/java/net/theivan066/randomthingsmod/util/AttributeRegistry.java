package net.theivan066.randomthingsmod.util;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.theivan066.randomthingsmod.entity.ModEntities;
import net.theivan066.randomthingsmod.entity.custom.*;

public class AttributeRegistry {
    public static void registerAttributes() {
        FabricDefaultAttributeRegistry.register(ModEntities.MUMMY, MummyEntity.setAttributes());
        FabricDefaultAttributeRegistry.register(ModEntities.NATSU, NatsuEntity.setAttributes());
        FabricDefaultAttributeRegistry.register(ModEntities.ZEROFOUR, ZerofourEntity.setAttributes());
        FabricDefaultAttributeRegistry.register(ModEntities.YAGI, YagiEntity.setAttributes());
        FabricDefaultAttributeRegistry.register(ModEntities.TORA, ToraEntity.setAttributes());
        FabricDefaultAttributeRegistry.register(ModEntities.TIGER, TigerEntity.setAttributes());
        FabricDefaultAttributeRegistry.register(ModEntities.KOUHA, KouhaEntity.setAttributes());
    }
}
