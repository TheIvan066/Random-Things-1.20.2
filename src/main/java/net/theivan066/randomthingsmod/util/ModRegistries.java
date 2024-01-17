package net.theivan066.randomthingsmod.util;

public class ModRegistries {
    public static void registerModStuffs() {
        FuelRegistry.registerFuels();
        StrippableRegistry.registerStrippables();
        FlammableRegistry.registerFlammableBlock();
        AttributeRegistry.registerAttributes();
    }
}
