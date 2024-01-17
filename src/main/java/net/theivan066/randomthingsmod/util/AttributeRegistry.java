package net.theivan066.randomthingsmod.util;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.theivan066.randomthingsmod.entity.ModEntities;
import net.theivan066.randomthingsmod.entity.custom.*;

public class AttributeRegistry {
    public static void registerAttributes() {

        FabricDefaultAttributeRegistry.register(ModEntities.MUMMY, MummyEntity.createMummyAttributes());
        FabricDefaultAttributeRegistry.register(ModEntities.NATSU, NatsuEntity.createNatsuAttributes());
        FabricDefaultAttributeRegistry.register(ModEntities.ZEROFOUR, ZerofourEntity.createZerofourAttributes());
        FabricDefaultAttributeRegistry.register(ModEntities.YAGI, YagiEntity.createYagiAttributes());
        FabricDefaultAttributeRegistry.register(ModEntities.TORA, ToraEntity.createToraAttributes());
        FabricDefaultAttributeRegistry.register(ModEntities.PORCUPINE, PorcupineEntity.createPorcupineAttributes());
   }
}
