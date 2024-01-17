package net.theivan066.randomthingsmod;

import net.fabricmc.api.ClientModInitializer;
import net.theivan066.randomthingsmod.client.*;

public class RandomThingsClientMod implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockTranslucentRenderer.registerTranslucent();
        BlockCutoutRenderer.registerCutout();
        EntityRenderer.registerEntity();
        ScreenRenderer.registerScreen();
        EntityModelLayer.registerEntityModelLayer();
        SpriteIdentifier.registerSpriteIdentifier();
    }
}
