package net.theivan066.randomthingsmod.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {

    //fruits and vegetables
    public static final FoodComponent GRAPE = new FoodComponent.Builder().hunger(2).saturationModifier(0.2f).build();
    public static final FoodComponent CHERRY = new FoodComponent.Builder().hunger(2).saturationModifier(0.2f).build();
    public static final FoodComponent BANANA = new FoodComponent.Builder().hunger(2).saturationModifier(0.2f).build();
    public static final FoodComponent BLUEBERRY = new FoodComponent.Builder().hunger(2).saturationModifier(0.2f).build();
    public static final FoodComponent LEMON = new FoodComponent.Builder().hunger(2).saturationModifier(0.2f).build();
    public static final FoodComponent LIME = new FoodComponent.Builder().hunger(2).saturationModifier(0.2f).build();
    public static final FoodComponent MANGO = new FoodComponent.Builder().hunger(2).saturationModifier(0.2f).build();
    public static final FoodComponent ORANGE = new FoodComponent.Builder().hunger(2).saturationModifier(0.2f).build();
    public static final FoodComponent PEACH = new FoodComponent.Builder().hunger(2).saturationModifier(0.2f).build();
    public static final FoodComponent PEAR = new FoodComponent.Builder().hunger(2).saturationModifier(0.2f).build();
    public static final FoodComponent POMEGRANATE = new FoodComponent.Builder().hunger(2).saturationModifier(0.2f).build();
    public static final FoodComponent STRAWBERRY = new FoodComponent.Builder().hunger(2).saturationModifier(0.2f).build();

    public static final FoodComponent CORN = new FoodComponent.Builder().hunger(3).saturationModifier(1f).build();
    public static final FoodComponent PARSNIP = new FoodComponent.Builder().hunger(3).saturationModifier(3.2f).build();
    public static final FoodComponent EGGPLANT = new FoodComponent.Builder().hunger(3).saturationModifier(2.0f).build();
    public static final FoodComponent TOMATO = new FoodComponent.Builder().hunger(2).saturationModifier(1f).build();
    public static final FoodComponent BAKCHOY = new FoodComponent.Builder().hunger(3).saturationModifier(1.8f).build();
    public static final FoodComponent BROCCOLI = new FoodComponent.Builder().hunger(3).saturationModifier(2.1f).build();
    public static final FoodComponent CAULIFLOWER = new FoodComponent.Builder().hunger(3).saturationModifier(2.1f).build();
    public static final FoodComponent CABBAGE = new FoodComponent.Builder().hunger(3).saturationModifier(1.8f).build();
    public static final FoodComponent CELERY = new FoodComponent.Builder().hunger(2).saturationModifier(1.4f).build();
    public static final FoodComponent CINNAMON = new FoodComponent.Builder().hunger(2).saturationModifier(0.8f).build();
    public static final FoodComponent CHESTNUT = new FoodComponent.Builder().hunger(1).saturationModifier(0.4f).build();
    public static final FoodComponent CUCUMBER = new FoodComponent.Builder().hunger(2).saturationModifier(1.6f).build();
    public static final FoodComponent MINT = new FoodComponent.Builder().hunger(1).saturationModifier(0.6f).build();
    public static final FoodComponent VANILLA = new FoodComponent.Builder().hunger(1).saturationModifier(0.4f).build();
    public static final FoodComponent UBE = new FoodComponent.Builder().hunger(1).saturationModifier(0.6f).build();
    public static final FoodComponent KALE = new FoodComponent.Builder().hunger(2).saturationModifier(1.1f).build();
    public static final FoodComponent SCALLION = new FoodComponent.Builder().hunger(1).saturationModifier(0.4f).build();
    public static final FoodComponent LETTUCE = new FoodComponent.Builder().hunger(3).saturationModifier(1.5f).build();
    public static final FoodComponent GINGER = new FoodComponent.Builder().hunger(2).saturationModifier(1f).build();
    public static final FoodComponent SPINACH = new FoodComponent.Builder().hunger(2).saturationModifier(1.6f).build();
    public static final FoodComponent YAM = new FoodComponent.Builder().hunger(2).saturationModifier(1.6f).build();
    public static final FoodComponent PINEAPPLE = new FoodComponent.Builder().hunger(4).saturationModifier(3.2f).build();
    public static final FoodComponent HOT_PEPPER = new FoodComponent.Builder().hunger(2).saturationModifier(1f).build();
    public static final FoodComponent GREEN_PEPPER = new FoodComponent.Builder().hunger(2).saturationModifier(1f).build();
    public static final FoodComponent GHOST_PEPPER = new FoodComponent.Builder().hunger(2).saturationModifier(1f).build();
    public static final FoodComponent ONION = new FoodComponent.Builder().hunger(2).saturationModifier(1f).build();
    public static final FoodComponent GARLIC = new FoodComponent.Builder().hunger(2).saturationModifier(1f).build();
    public static final FoodComponent BLACK_BEANS = new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).build();
    public static final FoodComponent GREEN_BEANS = new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).build();
    public static final FoodComponent RED_BEANS = new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).build();
    public static final FoodComponent ALMOND = new FoodComponent.Builder().hunger(1).saturationModifier(0.2f).build();
    public static final FoodComponent CHICKPEA = new FoodComponent.Builder().hunger(1).saturationModifier(0.2f).build();
    public static final FoodComponent PISTACHIO = new FoodComponent.Builder().hunger(1).saturationModifier(0.4f).build();

    //meat
    public static final FoodComponent BACON = new FoodComponent.Builder().hunger(2).saturationModifier(0.4f).build();
    public static final FoodComponent PEPPERONI = new FoodComponent.Builder().hunger(2).saturationModifier(0.2f).build();
    public static final FoodComponent SAUSAGE = new FoodComponent.Builder().hunger(2).saturationModifier(0.2f).build();
    public static final FoodComponent RAW_HAMBURGER_STEAK = new FoodComponent.Builder().hunger(2).saturationModifier(1.2f).build();
    public static final FoodComponent RAW_CHICKEN_STEAK = new FoodComponent.Builder().hunger(2).saturationModifier(1.2f).build();
    public static final FoodComponent RAW_HORSE_MEAT = new FoodComponent.Builder().hunger(3).saturationModifier(1.2f).build();


    //fish
    public static final FoodComponent TUNA = new FoodComponent.Builder().hunger(2).saturationModifier(0.4f).build();
    public static final FoodComponent ALBACORE = new FoodComponent.Builder().hunger(2).saturationModifier(0.4f).build();
    public static final FoodComponent FLOUNDER = new FoodComponent.Builder().hunger(2).saturationModifier(0.4f).build();
    public static final FoodComponent JAPANESE_AMBERJACK = new FoodComponent.Builder().hunger(2).saturationModifier(0.4f).build();
    public static final FoodComponent MACKEREL = new FoodComponent.Builder().hunger(2).saturationModifier(0.4f).build();
    public static final FoodComponent SHRIMP = new FoodComponent.Builder().hunger(2).saturationModifier(0.4f).build();
    public static final FoodComponent CRAB = new FoodComponent.Builder().hunger(2).saturationModifier(0.4f).build();
    public static final FoodComponent RAW_SQUID = new FoodComponent.Builder().hunger(2).saturationModifier(0.4f).build();


    //western fd
    public static final FoodComponent RAW_FRIES = new FoodComponent.Builder().hunger(0).saturationModifier(0.2f).build();
    public static final FoodComponent FRIES = new FoodComponent.Builder().hunger(1).saturationModifier(0.4f).build();
    public static final FoodComponent FISH_N_CHIPS = new FoodComponent.Builder().hunger(8).saturationModifier(10.4f).build();
    public static final FoodComponent BURGER_BUN = new FoodComponent.Builder().hunger(4).saturationModifier(5f).build();
    public static final FoodComponent SLICE_OF_BREAD = new FoodComponent.Builder().hunger(2).saturationModifier(1.5f).build();
    public static final FoodComponent BEEF_BURGER = new FoodComponent.Builder().hunger(10).saturationModifier(13.2f).build();
    public static final FoodComponent BACON_BURGER = new FoodComponent.Builder().hunger(9).saturationModifier(13f).build();
    public static final FoodComponent MUSHROOM_BURGER = new FoodComponent.Builder().hunger(8).saturationModifier(6.4f).build();
    public static final FoodComponent TOAST = new FoodComponent.Builder().hunger(6).saturationModifier(6.5f).build();
    public static final FoodComponent HOT_DOG = new FoodComponent.Builder().hunger(8).saturationModifier(8.0f).build();
    public static final FoodComponent OMELETTE = new FoodComponent.Builder().hunger(5).saturationModifier(1.2f).build();
    public static final FoodComponent OMELETTE_RICE = new FoodComponent.Builder().hunger(11).saturationModifier(7.2f).build();
    public static final FoodComponent PEPPERONI_PIZZA = new FoodComponent.Builder().hunger(14).saturationModifier(12f).build();
    public static final FoodComponent CHEESE_PIZZA = new FoodComponent.Builder().hunger(14).saturationModifier(12f).build();
    public static final FoodComponent VEGETARIAN_PIZZA = new FoodComponent.Builder().hunger(14).saturationModifier(12f).build();
    public static final FoodComponent CROISSANT = new FoodComponent.Builder().hunger(6).saturationModifier(7f).build();
    public static final FoodComponent LASAGNA = new FoodComponent.Builder().hunger(9).saturationModifier(9.7f).build();
    public static final FoodComponent BURRITO = new FoodComponent.Builder().hunger(9).saturationModifier(9.7f).build();
    public static final FoodComponent NACHOS = new FoodComponent.Builder().hunger(6).saturationModifier(4.8f).build();
    public static final FoodComponent CHICKEN_NUGGETS = new FoodComponent.Builder().hunger(7).saturationModifier(7.6f).build();
    public static final FoodComponent CHURRO = new FoodComponent.Builder().hunger(5).saturationModifier(5.4f).build();
    public static final FoodComponent FISH_FILLET = new FoodComponent.Builder().hunger(5).saturationModifier(6.4f).build();
    public static final FoodComponent FISH_STICK = new FoodComponent.Builder().hunger(4).saturationModifier(5.4f).build();
    public static final FoodComponent FALAFEL = new FoodComponent.Builder().hunger(3).saturationModifier(2.6f).build();
    public static final FoodComponent ONION_RINGS = new FoodComponent.Builder().hunger(5).saturationModifier(3.8f).build();
    public static final FoodComponent POPCORN = new FoodComponent.Builder().hunger(4).saturationModifier(3.7f).build();
    public static final FoodComponent QUICHE = new FoodComponent.Builder().hunger(8).saturationModifier(5.8f).build();
    public static final FoodComponent SAMOSA = new FoodComponent.Builder().hunger(6).saturationModifier(3.6f).build();
    public static final FoodComponent STUFFED_PITA = new FoodComponent.Builder().hunger(9).saturationModifier(6.3f).build();
    public static final FoodComponent TACO = new FoodComponent.Builder().hunger(9).saturationModifier(6.8f).build();
    public static final FoodComponent TAMALE = new FoodComponent.Builder().hunger(7).saturationModifier(5.9f).build();

    //meals?
    public static final FoodComponent DOSA = new FoodComponent.Builder().hunger(5).saturationModifier(4.4f).build();
    public static final FoodComponent CURRY_RICE = new FoodComponent.Builder().hunger(10).saturationModifier(10f).build();
    public static final FoodComponent SAMBAR = new FoodComponent.Builder().hunger(8).saturationModifier(3.0f).build();

    //cooked things
    public static final FoodComponent ROASTED_SEEDS = new FoodComponent.Builder().hunger(2).saturationModifier(0.2f).snack().build();
    public static final FoodComponent COOKED_MUSHROOM = new FoodComponent.Builder().hunger(2).saturationModifier(0.2f).snack().build();
    public static final FoodComponent COOKED_FUNGUS = new FoodComponent.Builder().hunger(2).saturationModifier(0.2f).snack().statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 10), 0.1f).statusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 10,0), 0.1f).statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 10,0), 0.1f).statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 10, 0), 0.1f).statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 1,0), 0.1f).build();
    public static final FoodComponent COOKED_CARROT = new FoodComponent.Builder().hunger(5).saturationModifier(0.6f).build();
    public static final FoodComponent FRIED_EGG = new FoodComponent.Builder().hunger(3).saturationModifier(0.6f).build();
    public static final FoodComponent BARBECUED_CORN = new FoodComponent.Builder().hunger(5).saturationModifier(2.8f).build();
    public static final FoodComponent COOKED_BACON = new FoodComponent.Builder().hunger(4).saturationModifier(2.8f).build();
    public static final FoodComponent COOKED_PEPPERONI = new FoodComponent.Builder().hunger(4).saturationModifier(2f).build();
    public static final FoodComponent COOKED_SAUSAGE = new FoodComponent.Builder().hunger(4).saturationModifier(2f).build();
    public static final FoodComponent COOKED_HAMBURGER_STEAK = new FoodComponent.Builder().hunger(6).saturationModifier(7f).build();
    public static final FoodComponent COOKED_CHICKEN_STEAK = new FoodComponent.Builder().hunger(6).saturationModifier(7f).build();
    public static final FoodComponent COOKED_HORSE_MEAT = new FoodComponent.Builder().hunger(6).saturationModifier(9.6f).build();
    public static final FoodComponent COOKED_TUNA = new FoodComponent.Builder().hunger(5).saturationModifier(5.8f).build();
    public static final FoodComponent COOKED_ALBACORE = new FoodComponent.Builder().hunger(5).saturationModifier(5.8f).build();
    public static final FoodComponent COOKED_FLOUNDER = new FoodComponent.Builder().hunger(5).saturationModifier(5.8f).build();
    public static final FoodComponent COOKED_JAPANESE_AMBERJACK = new FoodComponent.Builder().hunger(5).saturationModifier(5.8f).build();
    public static final FoodComponent COOKED_MACKEREL = new FoodComponent.Builder().hunger(5).saturationModifier(5.8f).build();
    public static final FoodComponent COOKED_SHRIMP = new FoodComponent.Builder().hunger(4).saturationModifier(3.8f).build();
    public static final FoodComponent COOKED_CRAB = new FoodComponent.Builder().hunger(4).saturationModifier(3.8f).build();
    public static final FoodComponent COOKED_SQUID = new FoodComponent.Builder().hunger(4).saturationModifier(3.8f).build();


    //ice creams
    public static final FoodComponent GRAPE_ICE_CREAM = new FoodComponent.Builder().hunger(3).saturationModifier(0.6f).statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 10,0), 1f).build();
    public static final FoodComponent CHERRY_ICE_CREAM = new FoodComponent.Builder().hunger(3).saturationModifier(0.6f).statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 10,0), 1f).build();
    public static final FoodComponent BANANA_ICE_CREAM = new FoodComponent.Builder().hunger(3).saturationModifier(0.6f).statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 10,0), 1f).build();
    public static final FoodComponent BLUEBERRY_ICE_CREAM = new FoodComponent.Builder().hunger(3).saturationModifier(0.6f).statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 10,0), 1f).build();
    public static final FoodComponent LEMON_ICE_CREAM = new FoodComponent.Builder().hunger(3).saturationModifier(0.6f).statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 10,0), 1f).build();
    public static final FoodComponent LIME_ICE_CREAM = new FoodComponent.Builder().hunger(3).saturationModifier(0.6f).statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 10,0), 1f).build();
    public static final FoodComponent MANGO_ICE_CREAM = new FoodComponent.Builder().hunger(3).saturationModifier(0.6f).statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 10,0), 1f).build();
    public static final FoodComponent ORANGE_ICE_CREAM = new FoodComponent.Builder().hunger(3).saturationModifier(0.6f).statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 10,0), 1f).build();
    public static final FoodComponent PEACH_ICE_CREAM = new FoodComponent.Builder().hunger(3).saturationModifier(0.6f).statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 10,0), 1f).build();
    public static final FoodComponent PEAR_ICE_CREAM = new FoodComponent.Builder().hunger(3).saturationModifier(0.6f).statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 10,0), 1f).build();
    public static final FoodComponent POMEGRANATE_ICE_CREAM = new FoodComponent.Builder().hunger(3).saturationModifier(0.6f).statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 10,0), 1f).build();
    public static final FoodComponent STRAWBERRY_ICE_CREAM = new FoodComponent.Builder().hunger(3).saturationModifier(0.6f).statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 10,0), 1f).build();
    public static final FoodComponent APPLE_ICE_CREAM = new FoodComponent.Builder().hunger(3).saturationModifier(0.6f).statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 10,0), 1f).build();
    public static final FoodComponent WATERMELON_ICE_CREAM = new FoodComponent.Builder().hunger(3).saturationModifier(0.6f).statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 10,0), 1f).build();
    public static final FoodComponent SWEET_BERRY_ICE_CREAM = new FoodComponent.Builder().hunger(3).saturationModifier(0.6f).statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 10,0), 1f).build();
    public static final FoodComponent VANILLA_ICE_CREAM = new FoodComponent.Builder().hunger(3).saturationModifier(0.6f).statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 10,0), 1f).build();

    public static final FoodComponent ICE_CREAM_CONE = new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).build();


    //smoothies
    public static final FoodComponent GRAPE_SMOOTHIE = new FoodComponent.Builder().hunger(3).saturationModifier(0.6f).build();
    public static final FoodComponent CHERRY_SMOOTHIE = new FoodComponent.Builder().hunger(3).saturationModifier(0.6f).build();
    public static final FoodComponent BANANA_SMOOTHIE = new FoodComponent.Builder().hunger(3).saturationModifier(0.6f).build();
    public static final FoodComponent BLUEBERRY_SMOOTHIE = new FoodComponent.Builder().hunger(3).saturationModifier(0.6f).build();
    public static final FoodComponent LEMON_SMOOTHIE = new FoodComponent.Builder().hunger(3).saturationModifier(0.6f).build();
    public static final FoodComponent LIME_SMOOTHIE = new FoodComponent.Builder().hunger(3).saturationModifier(0.6f).build();
    public static final FoodComponent MANGO_SMOOTHIE = new FoodComponent.Builder().hunger(3).saturationModifier(0.6f).build();
    public static final FoodComponent ORANGE_SMOOTHIE = new FoodComponent.Builder().hunger(3).saturationModifier(0.6f).build();
    public static final FoodComponent PEACH_SMOOTHIE = new FoodComponent.Builder().hunger(3).saturationModifier(0.6f).build();
    public static final FoodComponent PEAR_SMOOTHIE = new FoodComponent.Builder().hunger(3).saturationModifier(0.6f).build();
    public static final FoodComponent POMEGRANATE_SMOOTHIE = new FoodComponent.Builder().hunger(3).saturationModifier(0.6f).build();
    public static final FoodComponent STRAWBERRY_SMOOTHIE = new FoodComponent.Builder().hunger(3).saturationModifier(0.6f).build();
    public static final FoodComponent APPLE_SMOOTHIE = new FoodComponent.Builder().hunger(3).saturationModifier(0.6f).build();
    public static final FoodComponent WATERMELON_SMOOTHIE = new FoodComponent.Builder().hunger(3).saturationModifier(0.6f).build();
    public static final FoodComponent SWEET_BERRY_SMOOTHIE = new FoodComponent.Builder().hunger(3).saturationModifier(0.6f).build();


    //pies
    public static final FoodComponent CHERRY_PIE = new FoodComponent.Builder().hunger(8).saturationModifier(4.8f).build();
    public static final FoodComponent BANANA_PIE = new FoodComponent.Builder().hunger(8).saturationModifier(4.8f).build();
    public static final FoodComponent BLUEBERRY_PIE = new FoodComponent.Builder().hunger(8).saturationModifier(4.8f).build();
    public static final FoodComponent LEMON_PIE = new FoodComponent.Builder().hunger(8).saturationModifier(4.8f).build();
    public static final FoodComponent MANGO_PIE = new FoodComponent.Builder().hunger(8).saturationModifier(4.8f).build();
    public static final FoodComponent ORANGE_PIE = new FoodComponent.Builder().hunger(8).saturationModifier(4.8f).build();
    public static final FoodComponent STRAWBERRY_PIE = new FoodComponent.Builder().hunger(8).saturationModifier(4.8f).build();
    public static final FoodComponent APPLE_PIE = new FoodComponent.Builder().hunger(8).saturationModifier(4.8f).build();
    public static final FoodComponent SWEET_BERRY_PIE = new FoodComponent.Builder().hunger(8).saturationModifier(4.8f).build();
    public static final FoodComponent CHOCOLATE_PIE = new FoodComponent.Builder().hunger(8).saturationModifier(4.8f).build();
    public static final FoodComponent CHEESE_PIE = new FoodComponent.Builder().hunger(8).saturationModifier(4.8f).build();

    public static final FoodComponent BEEF_PIE = new FoodComponent.Builder().hunger(9).saturationModifier(5.6f).build();
    public static final FoodComponent PORK_PIE = new FoodComponent.Builder().hunger(9).saturationModifier(5.6f).build();
    public static final FoodComponent CHICKEN_PIE = new FoodComponent.Builder().hunger(9).saturationModifier(5.6f).build();
    public static final FoodComponent MUTTON_PIE = new FoodComponent.Builder().hunger(9).saturationModifier(5.6f).build();
    public static final FoodComponent RABBIT_PIE = new FoodComponent.Builder().hunger(9).saturationModifier(5.6f).build();
    public static final FoodComponent FISH_PIE = new FoodComponent.Builder().hunger(9).saturationModifier(5.6f).build();

    public static final FoodComponent PIE_BASE = new FoodComponent.Builder().hunger(7).saturationModifier(4.0f).build();


    //bread
    public static final FoodComponent BAGEL = new FoodComponent.Builder().hunger(5).saturationModifier(2.8f).build();
    public static final FoodComponent BAGUETTE = new FoodComponent.Builder().hunger(9).saturationModifier(11f).build();
    public static final FoodComponent HUMONGOUS_BAGUETTE = new FoodComponent.Builder().hunger(18).saturationModifier(17f).build();
    public static final FoodComponent GARGANTUAN_BAGUETTE = new FoodComponent.Builder().hunger(36).saturationModifier(34f).build();



    //deserts
    public static final FoodComponent RED_VELVET = new FoodComponent.Builder().hunger(12).saturationModifier(6.0f).build();
    public static final FoodComponent BLUE_VELVET = new FoodComponent.Builder().hunger(12).saturationModifier(6.0f).build();
    public static final FoodComponent GREEN_VELVET = new FoodComponent.Builder().hunger(12).saturationModifier(6.0f).build();
    public static final FoodComponent MEDOVIK = new FoodComponent.Builder().hunger(11).saturationModifier(6.4f).build();
    public static final FoodComponent VICTORIA_SPONGE_CAKE = new FoodComponent.Builder().hunger(12).saturationModifier(6.0f).build();
    public static final FoodComponent CHEESE_CAKE = new FoodComponent.Builder().hunger(11).saturationModifier(6.4f).build();
    public static final FoodComponent CHOCOLATE_CAKE = new FoodComponent.Builder().hunger(11).saturationModifier(6.4f).build();
    public static final FoodComponent CHOCOLATE_LAVA_CAKE = new FoodComponent.Builder().hunger(11).saturationModifier(8.6f).build();
    public static final FoodComponent STRAWBERRY_CAKE = new FoodComponent.Builder().hunger(11).saturationModifier(6.6f).build();
    public static final FoodComponent DANGO = new FoodComponent.Builder().hunger(3).saturationModifier(2.0f).build();
    public static final FoodComponent MOCHI = new FoodComponent.Builder().hunger(4).saturationModifier(2.3f).build();
    public static final FoodComponent DONUT = new FoodComponent.Builder().hunger(5).saturationModifier(3.5f).build();
    public static final FoodComponent CHOCOLATE_DONUT = new FoodComponent.Builder().hunger(5).saturationModifier(3.5f).build();
    public static final FoodComponent BROWNIE = new FoodComponent.Builder().hunger(3).saturationModifier(2.6f).build();
    public static final FoodComponent LOLLIPOP = new FoodComponent.Builder().hunger(2).saturationModifier(1f).statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 30, 0), 1).build();
    public static final FoodComponent PRETZEL = new FoodComponent.Builder().hunger(4).saturationModifier(3.4f).build();
    public static final FoodComponent FLAN = new FoodComponent.Builder().hunger(3).saturationModifier(2.4f).build();
    public static final FoodComponent FORTUNE_COOKIE = new FoodComponent.Builder().hunger(2).saturationModifier(0.6f).build();
    public static final FoodComponent GINGERBREAD_MAN = new FoodComponent.Builder().hunger(2).saturationModifier(0.6f).build();
    public static final FoodComponent GULAB_JAMUN = new FoodComponent.Builder().hunger(4).saturationModifier(3.5f).build();
    public static final FoodComponent MOONCAKE = new FoodComponent.Builder().hunger(3).saturationModifier(2.0f).build();
    public static final FoodComponent MUFFIN = new FoodComponent.Builder().hunger(3).saturationModifier(2.7f).build();


    //apples
    public static final FoodComponent IRON_APPLE = new FoodComponent.Builder().hunger(6).saturationModifier(10.5f).alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 600,0),1f).build();
    public static final FoodComponent DIAMOND_APPLE = new FoodComponent.Builder().hunger(4).saturationModifier(9.6f).alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 10,0),1f).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 150,0),1f).statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 2000,1),1f).build();
    public static final FoodComponent EMERALD_APPLE = new FoodComponent.Builder().hunger(4).saturationModifier(9.6f).alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.HERO_OF_THE_VILLAGE, 600,0),1f).statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 100,0),1f).build();
    public static final FoodComponent REDSTONE_APPLE = new FoodComponent.Builder().hunger(3).saturationModifier(8.5f).alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 900,2),1f).statusEffect(new StatusEffectInstance(StatusEffects.UNLUCK, 900,1),1f).build();
    public static final FoodComponent LAPIS_APPLE = new FoodComponent.Builder().hunger(3).saturationModifier(8.5f).alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.LUCK, 900,0),1f).statusEffect(new StatusEffectInstance(StatusEffects.MINING_FATIGUE, 900,0),1f).build();
    public static final FoodComponent OBSIDIAN_APPLE = new FoodComponent.Builder().hunger(6).saturationModifier(9.6f).alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 300,4),1f).statusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 200,1),1f).build();
    public static final FoodComponent GLOWSTONE_APPLE = new FoodComponent.Builder().hunger(6).saturationModifier(10.5f).alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 2400,0),1f).statusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 600,0),1f).build();
    public static final FoodComponent NETHERITE_APPLE = new FoodComponent.Builder().hunger(8).saturationModifier(10.5f).alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 2400,0),1f).statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 10,1),1f).statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 1200,2),1f).statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 400,0),1f).build();
    public static final FoodComponent MAGMA_CARROT = new FoodComponent.Builder().hunger(6).saturationModifier(14.4f).alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 9600,0),1f).build();


    //sasimi
    public static final FoodComponent PUFFERFISH_SASHIMI = new FoodComponent.Builder().hunger(2).saturationModifier(3.2f).statusEffect(new StatusEffectInstance(StatusEffects.POISON, 100,0),0.5f).statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 100,0),0.5f).build();
    public static final FoodComponent SALMON_SASHIMI = new FoodComponent.Builder().hunger(2).saturationModifier(3.2f).build();
    public static final FoodComponent TUNA_SASHIMI = new FoodComponent.Builder().hunger(2).saturationModifier(3.2f).build();
    public static final FoodComponent ALBACORE_SASHIMI = new FoodComponent.Builder().hunger(2).saturationModifier(3.2f).build();
    public static final FoodComponent FLOUNDER_SASHIMI = new FoodComponent.Builder().hunger(2).saturationModifier(3.2f).build();
    public static final FoodComponent JAPANESE_AMBERJACK_SASHIMI = new FoodComponent.Builder().hunger(2).saturationModifier(3.2f).build();
    public static final FoodComponent MACKEREL_SASHIMI = new FoodComponent.Builder().hunger(2).saturationModifier(3.2f).build();
    public static final FoodComponent SHRIMP_SASHIMI = new FoodComponent.Builder().hunger(2).saturationModifier(3.2f).build();
    public static final FoodComponent SQUID_SASHIMI = new FoodComponent.Builder().hunger(2).saturationModifier(3.2f).build();


    //jp fd
    public static final FoodComponent ODEN = new FoodComponent.Builder().hunger(7).saturationModifier(5.6f).build();
    public static final FoodComponent COOKED_RICE = new FoodComponent.Builder().hunger(2).saturationModifier(2.2f).build();
    public static final FoodComponent SALMON_ONIGIRI = new FoodComponent.Builder().hunger(7).saturationModifier(8.6f).build();
    public static final FoodComponent TUNA_ONIGIRI = new FoodComponent.Builder().hunger(7).saturationModifier(8.6f).build();
    public static final FoodComponent TAMAGO_ONIGIRI = new FoodComponent.Builder().hunger(7).saturationModifier(8.6f).build();
    public static final FoodComponent NOZAWANA_ONIGIRI = new FoodComponent.Builder().hunger(7).saturationModifier(8.6f).build();
    public static final FoodComponent TERIYAKI_CHICKEN_ONIGIRI = new FoodComponent.Builder().hunger(7).saturationModifier(8.6f).build();
    public static final FoodComponent PUFFERFISH_SUSHI = new FoodComponent.Builder().hunger(3).saturationModifier(6.4f).build();
    public static final FoodComponent SALMON_SUSHI = new FoodComponent.Builder().hunger(3).saturationModifier(6.4f).build();
    public static final FoodComponent TUNA_SUSHI = new FoodComponent.Builder().hunger(3).saturationModifier(6.4f).build();
    public static final FoodComponent ALBACORE_SUSHI = new FoodComponent.Builder().hunger(3).saturationModifier(6.4f).build();
    public static final FoodComponent FLOUNDER_SUSHI = new FoodComponent.Builder().hunger(3).saturationModifier(6.4f).build();
    public static final FoodComponent JAPANESE_AMBERJACK_SUSHI = new FoodComponent.Builder().hunger(3).saturationModifier(6.4f).build();
    public static final FoodComponent MACKEREL_SUSHI = new FoodComponent.Builder().hunger(3).saturationModifier(6.4f).build();
    public static final FoodComponent SHRIMP_SUSHI = new FoodComponent.Builder().hunger(3).saturationModifier(6.4f).build();
    public static final FoodComponent WAGYUU_SUSHI = new FoodComponent.Builder().hunger(3).saturationModifier(6.4f).build();
    public static final FoodComponent TAMAGO_SUSHI = new FoodComponent.Builder().hunger(3).saturationModifier(6.4f).build();
    public static final FoodComponent SEAWEED_SALAD_SUSHI = new FoodComponent.Builder().hunger(3).saturationModifier(6.4f).build();
    public static final FoodComponent SQUID_SUSHI = new FoodComponent.Builder().hunger(3).saturationModifier(6.4f).build();
    public static final FoodComponent CORN_SUSHI = new FoodComponent.Builder().hunger(3).saturationModifier(6.4f).build();
    public static final FoodComponent TONKOTSU_RAMEN = new FoodComponent.Builder().hunger(12).saturationModifier(15.8f).build();
    public static final FoodComponent CHEESE_RAMEN = new FoodComponent.Builder().hunger(10).saturationModifier(13.6f).build();
    public static final FoodComponent GYUUDON = new FoodComponent.Builder().hunger(13).saturationModifier(15f).build();
    public static final FoodComponent NARUTOMAKI = new FoodComponent.Builder().hunger(8).saturationModifier(7.2f).build();
    public static final FoodComponent MISO_SOUP = new FoodComponent.Builder().hunger(6).saturationModifier(7f).build();
    public static final FoodComponent TOFU = new FoodComponent.Builder().hunger(5).saturationModifier(3f).build();



    //hk fd
    public static final FoodComponent SIU_MAI = new FoodComponent.Builder().hunger(6).saturationModifier(8.2f).build();
    public static final FoodComponent CURRY_FISHBALL = new FoodComponent.Builder().hunger(6).saturationModifier(8.2f).build();
    public static final FoodComponent CHECKERED_EGG_WAFFLE = new FoodComponent.Builder().hunger(5).saturationModifier(8.6f).build();
    public static final FoodComponent EGG_PUFF = new FoodComponent.Builder().hunger(5).saturationModifier(8.6f).build();
    public static final FoodComponent BEEF_BALLS = new FoodComponent.Builder().hunger(6).saturationModifier(8.2f).build();
    public static final FoodComponent PORK_RICE_NOODLE = new FoodComponent.Builder().hunger(12).saturationModifier(14.4f).build();
    public static final FoodComponent BRIDGE_RICE_NOODLE = new FoodComponent.Builder().hunger(16).saturationModifier(18.4f).build();
    public static final FoodComponent EGG_TART = new FoodComponent.Builder().hunger(4).saturationModifier(4.3f).build();


    //snacks
    public static final FoodComponent BEEF_JERKY = new FoodComponent.Builder().hunger(2).saturationModifier(2f).snack().build();
    public static final FoodComponent PORK_JERKY = new FoodComponent.Builder().hunger(2).saturationModifier(2f).snack().build();
    public static final FoodComponent MUTTON_JERKY = new FoodComponent.Builder().hunger(2).saturationModifier(2f).snack().build();
    public static final FoodComponent PICKLED_EGG = new FoodComponent.Builder().hunger(5).saturationModifier(3f).build();
    public static final FoodComponent PICKLE = new FoodComponent.Builder().hunger(3).saturationModifier(1.8f).build();
    public static final FoodComponent RAISINS = new FoodComponent.Builder().hunger(3).saturationModifier(0.6f).snack().build();
    public static final FoodComponent RICE_CRACKER = new FoodComponent.Builder().hunger(2).saturationModifier(1f).snack().build();

    //drinks
    public static final FoodComponent CUP_OF_TEA = new FoodComponent.Builder().hunger(5).saturationModifier(6f).build();
    public static final FoodComponent BUBBLE_TEA = new FoodComponent.Builder().hunger(6).saturationModifier(7.2f).build();
    public static final FoodComponent HOT_CHOCOLATE = new FoodComponent.Builder().hunger(5).saturationModifier(6f).build();
    public static final FoodComponent MILK_TEA = new FoodComponent.Builder().hunger(5).saturationModifier(6f).build();

    public static final FoodComponent VODKA = new FoodComponent.Builder().hunger(5).saturationModifier(6f).statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 200), 1f).statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 100,1), 1f).build();
    public static final FoodComponent RED_WINE = new FoodComponent.Builder().hunger(5).saturationModifier(6f).statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 150), 1f).statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 200,0), 1f).build();
    public static final FoodComponent BEER = new FoodComponent.Builder().hunger(5).saturationModifier(6f).statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 100), 1f).statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 100,0), 1f).build();
    public static final FoodComponent GRAPE_WINE = new FoodComponent.Builder().hunger(5).saturationModifier(6f).statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 150), 1f).statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 200,0), 1f).build();


    //nether and end
    public static final FoodComponent NETHER_COOKIE = new FoodComponent.Builder().hunger(2).saturationModifier(0.4f).build();
    public static final FoodComponent NETHER_MUSHROOM_STEW = new FoodComponent.Builder().hunger(6).saturationModifier(7.2f).build();
    public static final FoodComponent NETHER_ICE_CREAM = new FoodComponent.Builder().hunger(3).saturationModifier(0.6f).statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 10,0), 0.5f).build();
    public static final FoodComponent FUNGUS_STEW = new FoodComponent.Builder().hunger(6).saturationModifier(7.2f).statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 100), 0.2f).statusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 100,0), 0.2f).statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 100,0), 0.2f).statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 100, 0), 0.2f).statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 1,0), 0.2f).statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_DAMAGE, 10,0), 0.2f).statusEffect(new StatusEffectInstance(StatusEffects.BLINDNESS, 1000,0), 0.2f).build();
    public static final FoodComponent ENDER_COOKIE = new FoodComponent.Builder().hunger(2).saturationModifier(0.4f).build();
    public static final FoodComponent NETHER_WART_PIE = new FoodComponent.Builder().hunger(8).saturationModifier(4.8f).build();
    public static final FoodComponent END_PIE = new FoodComponent.Builder().hunger(8).saturationModifier(4.8f).statusEffect(new StatusEffectInstance(StatusEffects.LEVITATION, 200,1), 0.5f).build();


    //ingredients
    public static final FoodComponent CHEESE = new FoodComponent.Builder().hunger(2).saturationModifier(1f).build();
    public static final FoodComponent OIL = new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 100,1), 0.2f).build();
    public static final FoodComponent MUSTARD = new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 100,1), 0.2f).build();
    public static final FoodComponent SALAD_DRESSING = new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 100,1), 0.2f).build();
    public static final FoodComponent SYRUP = new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 100,1), 0.2f).build();
    public static final FoodComponent VINEGAR = new FoodComponent.Builder().hunger(2).saturationModifier(1f).build();

    //what. the. fk.
    public static final FoodComponent STRAWBERRY_PICKAXE = new FoodComponent.Builder().hunger(6).saturationModifier(0.6f).statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 100,0), 1f).statusEffect(new StatusEffectInstance(StatusEffects.POISON, 200,0), 0.02f).build();
    public static final FoodComponent STRAWBERRY_AXE = new FoodComponent.Builder().hunger(6).saturationModifier(0.6f).statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 100,0), 1f).statusEffect(new StatusEffectInstance(StatusEffects.POISON, 200,0), 0.02f).build();
    public static final FoodComponent STRAWBERRY_HOE = new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 100,0), 1f).statusEffect(new StatusEffectInstance(StatusEffects.POISON, 200,0), 0.02f).build();
    public static final FoodComponent STRAWBERRY_SHOVEL = new FoodComponent.Builder().hunger(2).saturationModifier(0.2f).statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 100,0), 1f).statusEffect(new StatusEffectInstance(StatusEffects.POISON, 200,0), 0.02f).build();
    public static final FoodComponent STRAWBERRY_SWORD = new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 100,0), 1f).statusEffect(new StatusEffectInstance(StatusEffects.POISON, 200,0), 0.02f).build();
}

