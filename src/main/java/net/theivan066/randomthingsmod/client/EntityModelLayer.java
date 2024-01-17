package net.theivan066.randomthingsmod.client;

import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.theivan066.randomthingsmod.entity.client.*;

public class EntityModelLayer {
    public static void registerEntityModelLayer() {

       EntityModelLayerRegistry.registerModelLayer(ModModelLayers.MUMMY, MummyModel::getTexturedModelData);
       EntityModelLayerRegistry.registerModelLayer(ModModelLayers.NATSU, NatsuModel::getTexturedModelData);
       EntityModelLayerRegistry.registerModelLayer(ModModelLayers.ZEROFOUR, ZerofourModel::getTexturedModelData);
       EntityModelLayerRegistry.registerModelLayer(ModModelLayers.YAGI, YagiModel::getTexturedModelData);
       EntityModelLayerRegistry.registerModelLayer(ModModelLayers.TORA, ToraModel::getTexturedModelData);
//       EntityModelLayerRegistry.registerModelLayer(ModModelLayers.TIGER, TigerModel::getTexturedModelData);
       EntityModelLayerRegistry.registerModelLayer(ModModelLayers.PORCUPINE, PorcupineModel::getTexturedModelData);
    }
}
