package net.theivan066.randomthingsmod.client;

import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.theivan066.randomthingsmod.entity.ModEntities;
import net.theivan066.randomthingsmod.entity.client.*;

public class EntityRenderer {
    public static void registerEntity() {

        EntityRendererRegistry.register(ModEntities.MUMMY, MummyRenderer::new);
        EntityRendererRegistry.register(ModEntities.NATSU, NatsuRenderer::new);
        EntityRendererRegistry.register(ModEntities.ZEROFOUR, ZerofourRenderer::new);
        EntityRendererRegistry.register(ModEntities.YAGI, YagiRenderer::new);
        EntityRendererRegistry.register(ModEntities.TORA, ToraRenderer::new);
        EntityRendererRegistry.register(ModEntities.TIGER, TigerRenderer::new);
        EntityRendererRegistry.register(ModEntities.KOUHA, KouhaRenderer::new);
    }
}
