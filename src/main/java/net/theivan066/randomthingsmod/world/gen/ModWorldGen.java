package net.theivan066.randomthingsmod.world.gen;

public class ModWorldGen {
    public static void generateModWorldGen() {
        ModOreGeneration.generateOres();

        ModTreeGeneration.generateTrees();
        ModEntityGeneration.addEntitySpawn();


    }

}