package net.theivan066.randomthingsmod;

import com.google.gson.JsonObject;
import net.fabricmc.api.ModInitializer;
import net.minecraft.datafixer.fix.StructureFeatureChildrenPoolElementFix;
import net.minecraft.enchantment.Enchantment;
import net.theivan066.randomthingsmod.block.ModBlocks;
import net.theivan066.randomthingsmod.config.Config;
import net.theivan066.randomthingsmod.config.RandomthingsmodConfig;
import net.theivan066.randomthingsmod.enchantment.AcicularEnchantment;
import net.theivan066.randomthingsmod.enchantment.ModEnchantments;
import net.theivan066.randomthingsmod.entity.ModBlockEntities;
import net.theivan066.randomthingsmod.item.ModItemGroup;
import net.theivan066.randomthingsmod.item.ModItems;
import net.theivan066.randomthingsmod.screen.ModScreenHandlers;
import net.theivan066.randomthingsmod.util.ModLootTableModifiers;
import net.theivan066.randomthingsmod.util.ModRegistries;
import net.theivan066.randomthingsmod.world.gen.ModWorldGen;
import net.theivan066.randomthingsmod.world.structure.ModStructures;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import software.bernie.geckolib.GeckoLib;

import java.io.File;

public class RandomThingsMod implements ModInitializer {
	public static final String MOD_ID = "randomthingsmod";
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	public static Enchantment ACICULAR;


	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.



		RandomthingsmodConfig.init();
		String defaultConfig = "{\n" + "  \"regen_enchantment_config_file\": false\n" + "}";
		File configFile = Config.createFile("config/randomthingsmod/backupconfig.json", defaultConfig, false);
		JsonObject json = Config.getJsonObject(Config.readFile(configFile));
		RandomthingsmodConfig.generateConfigs(json == null || !json.has("regen_enchantment_config_file") || json.get("regen_enchantment_config_file").getAsBoolean());
		RandomthingsmodConfig.loadConfig();

		ModItemGroup.registerItemGroup();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModLootTableModifiers.modifyLootTables();

		ModRegistries.registerModStuffs();

		ModWorldGen.generateModWorldGen();

		ModEnchantments.registerModEnchantments();
		/*
		 * We setup and register our structures here.
		 * You should always register your stuff to prevent mod compatibility issue down the line.
		 */
		ModStructures.registerStructureFeatures();

		ModBlockEntities.registerBlockEntities();

		GeckoLib.initialize();

		ModScreenHandlers.registerAllScreenHandlers();


		/* ModRecipes.registerRecipes(); */


		ACICULAR = new AcicularEnchantment();


	}
}

