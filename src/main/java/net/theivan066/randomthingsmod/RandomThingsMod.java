package net.theivan066.randomthingsmod;

import com.google.gson.JsonObject;
import net.fabricmc.api.ModInitializer;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.ClampedEntityAttribute;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;
import net.theivan066.randomthingsmod.block.ModBlocks;
import net.theivan066.randomthingsmod.config.Config;
import net.theivan066.randomthingsmod.config.RandomthingsmodConfig;
import net.theivan066.randomthingsmod.enchantment.AcicularEnchantment;
import net.theivan066.randomthingsmod.enchantment.ModEnchantments;
import net.theivan066.randomthingsmod.entity.ModBlockEntities;
import net.theivan066.randomthingsmod.item.ModItemGroup;
import net.theivan066.randomthingsmod.item.ModItems;
import net.theivan066.randomthingsmod.recipe.ModRecipes;
import net.theivan066.randomthingsmod.screen.ModScreenHandlers;
import net.theivan066.randomthingsmod.util.ModLootTableModifiers;
import net.theivan066.randomthingsmod.util.ModRegistries;
import net.theivan066.randomthingsmod.world.gen.ModWorldGen;
import net.theivan066.randomthingsmod.world.structure.ModStructures;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class RandomThingsMod implements ModInitializer {
	public static final String MOD_ID = "randomthingsmod";
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	public static Enchantment ACICULAR;

	public static final EntityAttribute REACH = make("reach", 0.0, -1024.0, 1024.0);
	public static final EntityAttribute ATTACK_RANGE = make("attack_range", 0.0, -1024.0, 1024.0);

	public static double getReachDistance(final LivingEntity entity, final double baseReachDistance) {
		@Nullable final var reachDistance = entity.getAttributeInstance(REACH);
		return (reachDistance != null) ? (baseReachDistance + reachDistance.getValue()) : baseReachDistance;
	}

	public static double getSquaredReachDistance(final LivingEntity entity, final double sqBaseReachDistance) {
		final var reachDistance = getReachDistance(entity, Math.sqrt(sqBaseReachDistance));
		return reachDistance * reachDistance;
	}

	public static double getAttackRange(final LivingEntity entity, final double baseAttackRange) {
		@Nullable final var attackRange = entity.getAttributeInstance(ATTACK_RANGE);
		return (attackRange != null) ? (baseAttackRange + attackRange.getValue()) : baseAttackRange;
	}

	public static double getSquaredAttackRange(final LivingEntity entity, final double sqBaseAttackRange) {
		final var attackRange = getAttackRange(entity, Math.sqrt(sqBaseAttackRange));
		return attackRange * attackRange;
	}

	public static List<PlayerEntity> getPlayersWithinReach(final World world, final int x, final int y, final int z, final double baseReachDistance) {
		return getPlayersWithinReach(player -> true, world, x, y, z, baseReachDistance);
	}

	public static List<PlayerEntity> getPlayersWithinReach(final Predicate<PlayerEntity> viewerPredicate, final World world, final int x, final int y, final int z, final double baseReachDistance) {
		final List<PlayerEntity> playersWithinReach = new ArrayList<>(0);
		for (final PlayerEntity player : world.getPlayers()) {
			if (viewerPredicate.test(player)) {
				final var reach = getReachDistance(player, baseReachDistance);
				final var dx = (x + 0.5) - player.getX();
				final var dy = (y + 0.5) - player.getEyeY();
				final var dz = (z + 0.5) - player.getZ();
				if (((dx * dx) + (dy * dy) + (dz * dz)) <= (reach * reach)) {
					playersWithinReach.add(player);
				}
			}
		}
		return playersWithinReach;
	}

	public static boolean isWithinAttackRange(final PlayerEntity player, final Entity entity) {
		return player.squaredDistanceTo(entity) <= getSquaredAttackRange(player, 64.0);
	}

	private static EntityAttribute make(final String name, final double base, final double min, final double max) {
		return new ClampedEntityAttribute("attribute.name.generic." + MOD_ID + '.' + name, base, min, max).setTracked(true);
	}
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

		ModScreenHandlers.registerAllScreenHandlers();
		ModRecipes.registerRecipes();

		ACICULAR = new AcicularEnchantment();

		Registry.register(Registries.ATTRIBUTE, new Identifier(MOD_ID, "reach"), REACH);
		Registry.register(Registries.ATTRIBUTE, new Identifier(MOD_ID, "attack_range"), ATTACK_RANGE);
	}
}

