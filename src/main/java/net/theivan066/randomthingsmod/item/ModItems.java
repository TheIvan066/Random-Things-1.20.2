package net.theivan066.randomthingsmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.theivan066.randomthingsmod.RandomThingsMod;
import net.theivan066.randomthingsmod.block.ModBlocks;
import net.theivan066.randomthingsmod.entity.ModEntities;
import net.theivan066.randomthingsmod.item.custom.*;



public class ModItems {

    public static final Item TEST = registerItem("test", new Item(new FabricItemSettings()));

    public static final Item DRIED_ROTTEN_FLESH = registerItem("dried_rotten_flesh", new Item(new FabricItemSettings()));

    public static final Item GRAPE_SEEDS = registerItem("grape_seeds",
            new AliasedBlockItem(ModBlocks.GRAPE_VINE, new FabricItemSettings()));

    public static final Item INFINI_FUEL = registerItem("infini_fuel",
            new Item(new FabricItemSettings().rarity(Rarity.EPIC)));


//fruit
    public static final Item GRAPE = registerItem("grape",
            new Item(new FabricItemSettings().food(ModFoodComponents.GRAPE)));
    public static final Item CHERRY = registerItem("cherry",
            new Item(new FabricItemSettings().food(ModFoodComponents.CHERRY)));
    public static final Item BANANA = registerItem("banana",
            new Item(new FabricItemSettings().food(ModFoodComponents.BANANA)));
    public static final Item BLUEBERRY = registerItem("blueberry",
            new AliasedBlockItem(ModBlocks.BLUEBERRY_BUSH, new FabricItemSettings().food(ModFoodComponents.BLUEBERRY)));
    public static final Item LEMON = registerItem("lemon",
            new Item(new FabricItemSettings().food(ModFoodComponents.LEMON)));
    public static final Item LIME = registerItem("lime",
            new Item(new FabricItemSettings().food(ModFoodComponents.LIME)));
    public static final Item MANGO = registerItem("mango",
            new Item(new FabricItemSettings().food(ModFoodComponents.MANGO)));
    public static final Item ORANGE = registerItem("orange",
            new Item(new FabricItemSettings().food(ModFoodComponents.ORANGE)));
    public static final Item PEACH = registerItem("peach",
            new Item(new FabricItemSettings().food(ModFoodComponents.PEACH)));
    public static final Item PEAR = registerItem("pear",
            new Item(new FabricItemSettings().food(ModFoodComponents.PEAR)));
    public static final Item POMEGRANATE = registerItem("pomegranate",
            new Item(new FabricItemSettings().food(ModFoodComponents.POMEGRANATE)));
    public static final Item STRAWBERRY = registerItem("strawberry",
            new AliasedBlockItem(ModBlocks.STRAWBERRY_BUSH,new FabricItemSettings().food(ModFoodComponents.STRAWBERRY)));
//veggie
    public static final Item CORN = registerItem("corn",
            new AliasedBlockItem(ModBlocks.CORN, new FabricItemSettings().food(ModFoodComponents.CORN)));
    public static final Item PARSNIP = registerItem("parsnip",
            new AliasedBlockItem(ModBlocks.PARSNIP, new FabricItemSettings().food(ModFoodComponents.PARSNIP)));
    public static final Item EGGPLANT = registerItem("eggplant",
            new AliasedBlockItem(ModBlocks.EGGPLANT, new FabricItemSettings().food(ModFoodComponents.EGGPLANT)));
    public static final Item TOMATO = registerItem("tomato",
            new AliasedBlockItem(ModBlocks.TOMATO, new FabricItemSettings().food(ModFoodComponents.TOMATO)));
    public static final Item BAKCHOY = registerItem("bakchoy",
            new AliasedBlockItem(ModBlocks.BAKCHOY, new FabricItemSettings().food(ModFoodComponents.BAKCHOY)));
    public static final Item BROCCOLI = registerItem("broccoli",
            new AliasedBlockItem(ModBlocks.BROCCOLI, new FabricItemSettings().food(ModFoodComponents.BROCCOLI)));
    public static final Item CAULIFLOWER = registerItem("cauliflower",
            new AliasedBlockItem(ModBlocks.CAULIFLOWER, new FabricItemSettings().food(ModFoodComponents.CAULIFLOWER)));
    public static final Item CABBAGE = registerItem("cabbage",
            new AliasedBlockItem(ModBlocks.CABBAGE, new FabricItemSettings().food(ModFoodComponents.CABBAGE)));
    public static final Item CELERY = registerItem("celery",
            new AliasedBlockItem(ModBlocks.CELERY, new FabricItemSettings().food(ModFoodComponents.CELERY)));
    public static final Item CINNAMON = registerItem("cinnamon",
            new AliasedBlockItem(ModBlocks.CINNAMON, new FabricItemSettings().food(ModFoodComponents.CINNAMON)));
    public static final Item CHESTNUT = registerItem("chestnut",
            new AliasedBlockItem(ModBlocks.CHESTNUT, new FabricItemSettings().food(ModFoodComponents.CHESTNUT)));
    public static final Item CUCUMBER = registerItem("cucumber",
            new AliasedBlockItem(ModBlocks.CUCUMBER, new FabricItemSettings().food(ModFoodComponents.CUCUMBER)));
    public static final Item MINT = registerItem("mint",
            new AliasedBlockItem(ModBlocks.MINT, new FabricItemSettings().food(ModFoodComponents.MINT)));
    public static final Item VANILLA = registerItem("vanilla",
            new AliasedBlockItem(ModBlocks.VANILLA, new FabricItemSettings().food(ModFoodComponents.VANILLA)));
    public static final Item UBE = registerItem("ube",
            new AliasedBlockItem(ModBlocks.UBE, new FabricItemSettings().food(ModFoodComponents.UBE)));
    public static final Item KALE = registerItem("kale",
            new AliasedBlockItem(ModBlocks.KALE, new FabricItemSettings().food(ModFoodComponents.KALE)));
    public static final Item SCALLION = registerItem("scallion",
            new AliasedBlockItem(ModBlocks.SCALLION, new FabricItemSettings().food(ModFoodComponents.SCALLION)));
    public static final Item LETTUCE = registerItem("lettuce",
            new AliasedBlockItem(ModBlocks.LETTUCE, new FabricItemSettings().food(ModFoodComponents.LETTUCE)));
    public static final Item GINGER = registerItem("ginger",
            new AliasedBlockItem(ModBlocks.LETTUCE, new FabricItemSettings().food(ModFoodComponents.GINGER)));
    public static final Item SPINACH = registerItem("spinach",
            new AliasedBlockItem(ModBlocks.SPINACH, new FabricItemSettings().food(ModFoodComponents.SPINACH)));
    public static final Item YAM = registerItem("yam",
            new YamItem(ModBlocks.YAM, new FabricItemSettings().food(ModFoodComponents.YAM)));
    public static final Item PINEAPPLE = registerItem("pineapple",
            new AliasedBlockItem(ModBlocks.PINEAPPLE, new FabricItemSettings().food(ModFoodComponents.PINEAPPLE)));
    public static final Item HOT_PEPPER = registerItem("hot_pepper",
            new AliasedBlockItem(ModBlocks.HOT_PEPPER, new FabricItemSettings().food(ModFoodComponents.HOT_PEPPER)));
    public static final Item GREEN_PEPPER = registerItem("green_pepper",
            new Item(new FabricItemSettings().food(ModFoodComponents.GREEN_PEPPER)));
    public static final Item GHOST_PEPPER = registerItem("ghost_pepper",
            new GhostPepperItem(new FabricItemSettings().food(ModFoodComponents.GHOST_PEPPER)));
    public static final Item ONION = registerItem("onion",
            new AliasedBlockItem(ModBlocks.ONION, new FabricItemSettings().food(ModFoodComponents.ONION)));
    public static final Item GARLIC = registerItem("garlic",
            new AliasedBlockItem(ModBlocks.GARLIC, new FabricItemSettings().food(ModFoodComponents.GARLIC)));
    public static final Item BLACK_BEANS = registerItem("black_beans",
            new AliasedBlockItem(ModBlocks.BLACK_BEANS, new FabricItemSettings().food(ModFoodComponents.BLACK_BEANS)));
    public static final Item GREEN_BEANS = registerItem("green_beans",
            new AliasedBlockItem(ModBlocks.GREEN_BEANS, new FabricItemSettings().food(ModFoodComponents.GREEN_BEANS)));
    public static final Item RED_BEANS = registerItem("red_beans",
            new AliasedBlockItem(ModBlocks.RED_BEANS, new FabricItemSettings().food(ModFoodComponents.RED_BEANS)));
    public static final Item ALMOND = registerItem("almond",
            new AliasedBlockItem(ModBlocks.ALMOND, new FabricItemSettings().food(ModFoodComponents.ALMOND)));
    public static final Item CHICKPEA = registerItem("chickpea",
            new AliasedBlockItem(ModBlocks.CHICKPEA, new FabricItemSettings().food(ModFoodComponents.CHICKPEA)));
    public static final Item PISTACHIO = registerItem("pistachio",
            new PistachioItem(ModBlocks.PISTACHIO, new FabricItemSettings().food(ModFoodComponents.PISTACHIO)));


    //raw
    public static final Item BACON = registerItem("bacon",
            new Item(new FabricItemSettings().food(ModFoodComponents.BACON)));
    public static final Item PEPPERONI = registerItem("pepperoni",
            new Item(new FabricItemSettings().food(ModFoodComponents.PEPPERONI)));
    public static final Item SAUSAGE = registerItem("sausage",
            new Item(new FabricItemSettings().food(ModFoodComponents.SAUSAGE)));
    public static final Item RAW_HAMBURGER_STEAK = registerItem("raw_hamburger_steak",
            new Item(new FabricItemSettings().food(ModFoodComponents.RAW_HAMBURGER_STEAK)));
    public static final Item RAW_CHICKEN_STEAK = registerItem("raw_chicken_steak",
            new Item(new FabricItemSettings().food(ModFoodComponents.RAW_CHICKEN_STEAK)));
    public static final Item RAW_HORSE_MEAT = registerItem("raw_horse_meat",
            new Item(new FabricItemSettings().food(ModFoodComponents.RAW_HORSE_MEAT)));
//fish
    public static final Item TUNA = registerItem("tuna",
            new Item(new FabricItemSettings().food(ModFoodComponents.TUNA)));
    public static final Item ALBACORE = registerItem("albacore",
            new Item(new FabricItemSettings().food(ModFoodComponents.ALBACORE)));
    public static final Item FLOUNDER = registerItem("flounder",
            new Item(new FabricItemSettings().food(ModFoodComponents.FLOUNDER)));
    public static final Item JAPANESE_AMBERJACK = registerItem("japanese_amberjack",
            new Item(new FabricItemSettings().food(ModFoodComponents.JAPANESE_AMBERJACK)));
    public static final Item MACKEREL = registerItem("mackerel",
            new Item(new FabricItemSettings().food(ModFoodComponents.MACKEREL)));
    public static final Item SHRIMP = registerItem("shrimp",
            new Item(new FabricItemSettings().food(ModFoodComponents.SHRIMP)));
    public static final Item CRAB = registerItem("crab",
            new Item(new FabricItemSettings().food(ModFoodComponents.CRAB)));
    public static final Item RAW_SQUID = registerItem("raw_squid",
            new Item(new FabricItemSettings().food(ModFoodComponents.RAW_SQUID)));
//fast fd
    public static final Item RAW_FRIES = registerItem("raw_fries",
            new Item(new FabricItemSettings().food(ModFoodComponents.RAW_FRIES)));
    public static final Item FRIES = registerItem("fries",
            new Item(new FabricItemSettings().food(ModFoodComponents.FRIES)));
    public static final Item FISH_N_CHIPS = registerItem("fish_n_chips",
            new Item(new FabricItemSettings().food(ModFoodComponents.FISH_N_CHIPS)));
    public static final Item BURGER_BUN = registerItem("burger_bun",
            new Item(new FabricItemSettings().food(ModFoodComponents.BURGER_BUN)));
    public static final Item SLICE_OF_BREAD = registerItem("slice_of_bread",
            new Item(new FabricItemSettings().food(ModFoodComponents.SLICE_OF_BREAD)));
    public static final Item BEEF_BURGER = registerItem("beef_burger",
            new Item(new FabricItemSettings().food(ModFoodComponents.BEEF_BURGER)));
    public static final Item BACON_BURGER = registerItem("bacon_burger",
            new Item(new FabricItemSettings().food(ModFoodComponents.BACON_BURGER)));
    public static final Item MUSHROOM_BURGER = registerItem("mushroom_burger",
            new Item(new FabricItemSettings().food(ModFoodComponents.MUSHROOM_BURGER)));
    public static final Item TOAST = registerItem("toast",
            new Item(new FabricItemSettings().food(ModFoodComponents.TOAST)));
    public static final Item HOT_DOG = registerItem("hot_dog",
            new Item(new FabricItemSettings().food(ModFoodComponents.HOT_DOG)));
    public static final Item OMELETTE = registerItem("omelette",
            new Item(new FabricItemSettings().food(ModFoodComponents.OMELETTE)));
    public static final Item OMELETTE_RICE = registerItem("omelette_rice",
            new Item(new FabricItemSettings().food(ModFoodComponents.OMELETTE_RICE)));
    public static final Item PEPPERONI_PIZZA = registerItem("pepperoni_pizza",
            new Item(new FabricItemSettings().food(ModFoodComponents.PEPPERONI_PIZZA)));
    public static final Item CHEESE_PIZZA = registerItem("cheese_pizza",
            new Item(new FabricItemSettings().food(ModFoodComponents.CHEESE_PIZZA)));
    public static final Item VEGETARIAN_PIZZA = registerItem("vegetarian_pizza",
            new Item(new FabricItemSettings().food(ModFoodComponents.VEGETARIAN_PIZZA)));
    public static final Item CROISSANT = registerItem("croissant",
            new Item(new FabricItemSettings().food(ModFoodComponents.CROISSANT)));
    public static final Item LASAGNA = registerItem("lasagna",
            new Item(new FabricItemSettings().food(ModFoodComponents.LASAGNA)));
    public static final Item BURRITO = registerItem("burrito",
            new Item(new FabricItemSettings().food(ModFoodComponents.BURRITO)));
    public static final Item NACHOS = registerItem("nachos",
            new Item(new FabricItemSettings().food(ModFoodComponents.NACHOS)));
    public static final Item CHICKEN_NUGGETS = registerItem("chicken_nuggets",
            new Item(new FabricItemSettings().food(ModFoodComponents.CHICKEN_NUGGETS)));
    public static final Item CHURRO = registerItem("churro",
            new Item(new FabricItemSettings().food(ModFoodComponents.CHURRO)));
    public static final Item FISH_FILLET = registerItem("fish_fillet",
            new Item(new FabricItemSettings().food(ModFoodComponents.FISH_FILLET)));
    public static final Item FISH_STICK = registerItem("fish_stick",
            new Item(new FabricItemSettings().food(ModFoodComponents.FISH_STICK)));
    public static final Item FALAFEL = registerItem("falafel",
            new Item(new FabricItemSettings().food(ModFoodComponents.FALAFEL)));
    public static final Item ONION_RINGS = registerItem("onion_rings",
            new Item(new FabricItemSettings().food(ModFoodComponents.ONION_RINGS)));
    public static final Item POPCORN = registerItem("popcorn",
            new Item(new FabricItemSettings().food(ModFoodComponents.POPCORN)));
    public static final Item QUICHE = registerItem("quiche",
            new Item(new FabricItemSettings().food(ModFoodComponents.QUICHE)));
    public static final Item SAMOSA = registerItem("samosa",
            new Item(new FabricItemSettings().food(ModFoodComponents.SAMOSA)));
    public static final Item STUFFED_PITA = registerItem("stuffed_pita",
            new Item(new FabricItemSettings().food(ModFoodComponents.STUFFED_PITA)));
    public static final Item TACO = registerItem("taco",
            new Item(new FabricItemSettings().food(ModFoodComponents.TACO)));
    public static final Item TAMALE = registerItem("tamale",
            new Item(new FabricItemSettings().food(ModFoodComponents.TAMALE)));

    public static final Item DOSA = registerItem("dosa",
            new Item(new FabricItemSettings().food(ModFoodComponents.DOSA)));
    public static final Item CURRY_RICE = registerItem("curry_rice",
            new Item(new FabricItemSettings().food(ModFoodComponents.CURRY_RICE)));
    public static final Item SAMBAR = registerItem("sambar",
            new Item(new FabricItemSettings().food(ModFoodComponents.SAMBAR)));

    //aisu
    public static final Item GRAPE_ICE_CREAM = registerItem("grape_ice_cream",
            new Item(new FabricItemSettings().food(ModFoodComponents.GRAPE_ICE_CREAM).maxCount(8)));
    public static final Item CHERRY_ICE_CREAM = registerItem("cherry_ice_cream",
            new Item(new FabricItemSettings().food(ModFoodComponents.CHERRY_ICE_CREAM).maxCount(8)));
    public static final Item BANANA_ICE_CREAM = registerItem("banana_ice_cream",
            new Item(new FabricItemSettings().food(ModFoodComponents.BANANA_ICE_CREAM).maxCount(8)));
    public static final Item BLUEBERRY_ICE_CREAM = registerItem("blueberry_ice_cream",
            new Item(new FabricItemSettings().food(ModFoodComponents.BLUEBERRY_ICE_CREAM).maxCount(8)));
    public static final Item LEMON_ICE_CREAM = registerItem("lemon_ice_cream",
            new Item(new FabricItemSettings().food(ModFoodComponents.LEMON_ICE_CREAM).maxCount(8)));
    public static final Item LIME_ICE_CREAM = registerItem("lime_ice_cream",
            new Item(new FabricItemSettings().food(ModFoodComponents.LIME_ICE_CREAM).maxCount(8)));
    public static final Item MANGO_ICE_CREAM = registerItem("mango_ice_cream",
            new Item(new FabricItemSettings().food(ModFoodComponents.MANGO_ICE_CREAM).maxCount(8)));
    public static final Item ORANGE_ICE_CREAM = registerItem("orange_ice_cream",
            new Item(new FabricItemSettings().food(ModFoodComponents.ORANGE_ICE_CREAM).maxCount(8)));
    public static final Item PEACH_ICE_CREAM = registerItem("peach_ice_cream",
            new Item(new FabricItemSettings().food(ModFoodComponents.PEACH_ICE_CREAM).maxCount(8)));
    public static final Item PEAR_ICE_CREAM = registerItem("pear_ice_cream",
            new Item(new FabricItemSettings().food(ModFoodComponents.PEAR_ICE_CREAM).maxCount(8)));
    public static final Item POMEGRANATE_ICE_CREAM = registerItem("pomegranate_ice_cream",
            new Item(new FabricItemSettings().food(ModFoodComponents.POMEGRANATE_ICE_CREAM).maxCount(8)));
    public static final Item STRAWBERRY_ICE_CREAM = registerItem("strawberry_ice_cream",
            new Item(new FabricItemSettings().food(ModFoodComponents.STRAWBERRY_ICE_CREAM).maxCount(8)));
    public static final Item APPLE_ICE_CREAM = registerItem("apple_ice_cream",
            new Item(new FabricItemSettings().food(ModFoodComponents.APPLE_ICE_CREAM).maxCount(8)));
    public static final Item WATERMELON_ICE_CREAM = registerItem("watermelon_ice_cream",
            new Item(new FabricItemSettings().food(ModFoodComponents.WATERMELON_ICE_CREAM).maxCount(8)));
    public static final Item SWEET_BERRY_ICE_CREAM = registerItem("sweet_berry_ice_cream",
            new Item(new FabricItemSettings().food(ModFoodComponents.SWEET_BERRY_ICE_CREAM).maxCount(8)));
    public static final Item VANILLA_ICE_CREAM = registerItem("vanilla_ice_cream",
            new Item(new FabricItemSettings().food(ModFoodComponents.VANILLA_ICE_CREAM).maxCount(8)));
    public static final Item ICE_CREAM_CONE = registerItem("ice_cream_cone",
            new Item(new FabricItemSettings().food(ModFoodComponents.ICE_CREAM_CONE)));
//smoothie
    public static final Item GRAPE_SMOOTHIE = registerItem("grape_smoothie",
            new Item(new FabricItemSettings().food(ModFoodComponents.GRAPE_SMOOTHIE).maxCount(16)));
    public static final Item CHERRY_SMOOTHIE = registerItem("cherry_smoothie",
            new Item(new FabricItemSettings().food(ModFoodComponents.CHERRY_SMOOTHIE).maxCount(16)));
    public static final Item BANANA_SMOOTHIE = registerItem("banana_smoothie",
            new Item(new FabricItemSettings().food(ModFoodComponents.BANANA_SMOOTHIE).maxCount(16)));
    public static final Item BLUEBERRY_SMOOTHIE = registerItem("blueberry_smoothie",
            new Item(new FabricItemSettings().food(ModFoodComponents.BLUEBERRY_SMOOTHIE).maxCount(16)));
    public static final Item LEMON_SMOOTHIE = registerItem("lemon_smoothie",
            new Item(new FabricItemSettings().food(ModFoodComponents.LEMON_SMOOTHIE).maxCount(16)));
    public static final Item LIME_SMOOTHIE = registerItem("lime_smoothie",
            new Item(new FabricItemSettings().food(ModFoodComponents.LIME_SMOOTHIE).maxCount(16)));
    public static final Item MANGO_SMOOTHIE = registerItem("mango_smoothie",
            new Item(new FabricItemSettings().food(ModFoodComponents.MANGO_SMOOTHIE).maxCount(16)));
    public static final Item ORANGE_SMOOTHIE = registerItem("orange_smoothie",
            new Item(new FabricItemSettings().food(ModFoodComponents.ORANGE_SMOOTHIE).maxCount(16)));
    public static final Item PEACH_SMOOTHIE = registerItem("peach_smoothie",
            new Item(new FabricItemSettings().food(ModFoodComponents.PEACH_SMOOTHIE).maxCount(16)));
    public static final Item PEAR_SMOOTHIE = registerItem("pear_smoothie",
            new Item(new FabricItemSettings().food(ModFoodComponents.PEAR_SMOOTHIE).maxCount(16)));
    public static final Item POMEGRANATE_SMOOTHIE = registerItem("pomegranate_smoothie",
            new Item(new FabricItemSettings().food(ModFoodComponents.POMEGRANATE_SMOOTHIE).maxCount(16)));
    public static final Item STRAWBERRY_SMOOTHIE = registerItem("strawberry_smoothie",
            new Item(new FabricItemSettings().food(ModFoodComponents.STRAWBERRY_SMOOTHIE).maxCount(16)));
    public static final Item APPLE_SMOOTHIE = registerItem("apple_smoothie",
            new Item(new FabricItemSettings().food(ModFoodComponents.APPLE_SMOOTHIE).maxCount(16)));
    public static final Item WATERMELON_SMOOTHIE = registerItem("watermelon_smoothie",
            new Item(new FabricItemSettings().food(ModFoodComponents.WATERMELON_SMOOTHIE).maxCount(16)));
    public static final Item SWEET_BERRY_SMOOTHIE = registerItem("sweet_berry_smoothie",
            new Item(new FabricItemSettings().food(ModFoodComponents.SWEET_BERRY_SMOOTHIE).maxCount(16)));
//pie
    public static final Item CHERRY_PIE = registerItem("cherry_pie",
            new Item(new FabricItemSettings().food(ModFoodComponents.CHERRY_PIE)));
    public static final Item BANANA_PIE = registerItem("banana_pie",
            new Item(new FabricItemSettings().food(ModFoodComponents.BANANA_PIE)));
    public static final Item BLUEBERRY_PIE = registerItem("blueberry_pie",
            new Item(new FabricItemSettings().food(ModFoodComponents.BLUEBERRY_PIE)));
    public static final Item LEMON_PIE = registerItem("lemon_pie",
            new Item(new FabricItemSettings().food(ModFoodComponents.LEMON_PIE)));
    public static final Item MANGO_PIE = registerItem("mango_pie",
            new Item(new FabricItemSettings().food(ModFoodComponents.MANGO_PIE)));
    public static final Item ORANGE_PIE = registerItem("orange_pie",
            new Item(new FabricItemSettings().food(ModFoodComponents.ORANGE_PIE)));
    public static final Item STRAWBERRY_PIE = registerItem("strawberry_pie",
            new Item(new FabricItemSettings().food(ModFoodComponents.STRAWBERRY_PIE)));
    public static final Item APPLE_PIE = registerItem("apple_pie",
            new Item(new FabricItemSettings().food(ModFoodComponents.APPLE_PIE)));
    public static final Item SWEET_BERRY_PIE = registerItem("sweet_berry_pie",
            new Item(new FabricItemSettings().food(ModFoodComponents.SWEET_BERRY_PIE)));
    public static final Item CHOCOLATE_PIE = registerItem("chocolate_pie",
            new Item(new FabricItemSettings().food(ModFoodComponents.CHOCOLATE_PIE)));
    public static final Item CHEESE_PIE = registerItem("cheese_pie",
            new Item(new FabricItemSettings().food(ModFoodComponents.CHEESE_PIE)));
    public static final Item BEEF_PIE = registerItem("beef_pie",
            new Item(new FabricItemSettings().food(ModFoodComponents.BEEF_PIE)));
    public static final Item PORK_PIE = registerItem("pork_pie",
            new Item(new FabricItemSettings().food(ModFoodComponents.PORK_PIE)));
    public static final Item CHICKEN_PIE = registerItem("chicken_pie",
            new Item(new FabricItemSettings().food(ModFoodComponents.CHICKEN_PIE)));
    public static final Item MUTTON_PIE = registerItem("mutton_pie",
            new Item(new FabricItemSettings().food(ModFoodComponents.MUTTON_PIE)));
    public static final Item RABBIT_PIE = registerItem("rabbit_pie",
            new Item(new FabricItemSettings().food(ModFoodComponents.RABBIT_PIE)));
    public static final Item FISH_PIE = registerItem("fish_pie",
            new Item(new FabricItemSettings().food(ModFoodComponents.FISH_PIE)));
    public static final Item PIE_BASE = registerItem("pie_base",
            new Item(new FabricItemSettings().food(ModFoodComponents.PIE_BASE)));

    //bread?
    public static final Item BAGEL = registerItem("bagel",
            new Item(new FabricItemSettings().food(ModFoodComponents.BAGEL)));
    public static final Item BAGUETTE = registerItem("baguette",
            new BaguetteItem(new FabricItemSettings().food(ModFoodComponents.BAGUETTE), 1, 1));
    public static final Item HUMONGOUS_BAGUETTE = registerItem("humongous_baguette",
            new BaguetteItem(new FabricItemSettings().food(ModFoodComponents.HUMONGOUS_BAGUETTE), 2,2));
    public static final Item GARGANTUAN_BAGUETTE = registerItem("gargantuan_baguette",
            new Item(new FabricItemSettings().food(ModFoodComponents.GARGANTUAN_BAGUETTE)));

    //deserts
    public static final Item RED_VELVET = registerItem("red_velvet",
            new Item(new FabricItemSettings().food(ModFoodComponents.RED_VELVET)));
    public static final Item BLUE_VELVET = registerItem("blue_velvet",
            new Item(new FabricItemSettings().food(ModFoodComponents.BLUE_VELVET)));
    public static final Item GREEN_VELVET = registerItem("green_velvet",
            new Item(new FabricItemSettings().food(ModFoodComponents.GREEN_VELVET)));
    public static final Item MEDOVIK = registerItem("medovik",
            new Item(new FabricItemSettings().food(ModFoodComponents.MEDOVIK)));
    public static final Item VICTORIA_SPONGE_CAKE = registerItem("victoria_sponge_cake",
            new Item(new FabricItemSettings().food(ModFoodComponents.VICTORIA_SPONGE_CAKE)));
    public static final Item CHEESE_CAKE = registerItem("cheese_cake",
            new Item(new FabricItemSettings().food(ModFoodComponents.CHEESE_CAKE)));
    public static final Item CHOCOLATE_CAKE = registerItem("chocolate_cake",
            new Item(new FabricItemSettings().food(ModFoodComponents.CHOCOLATE_CAKE)));
    public static final Item CHOCOLATE_LAVA_CAKE = registerItem("chocolate_lava_cake",
            new Item(new FabricItemSettings().food(ModFoodComponents.CHOCOLATE_LAVA_CAKE)));
    public static final Item STRAWBERRY_CAKE = registerItem("strawberry_cake",
            new Item(new FabricItemSettings().food(ModFoodComponents.STRAWBERRY_CAKE)));
    public static final Item DANGO = registerItem("dango",
            new Item(new FabricItemSettings().food(ModFoodComponents.DANGO)));
    public static final Item MOCHI = registerItem("mochi",
            new Item(new FabricItemSettings().food(ModFoodComponents.MOCHI)));
    public static final Item DONUT = registerItem("donut",
            new Item(new FabricItemSettings().food(ModFoodComponents.DONUT)));
    public static final Item CHOCOLATE_DONUT = registerItem("chocolate_donut",
            new Item(new FabricItemSettings().food(ModFoodComponents.CHOCOLATE_DONUT)));
    public static final Item BROWNIE = registerItem("brownie",
            new Item(new FabricItemSettings().food(ModFoodComponents.BROWNIE)));
    public static final Item LOLLIPOP = registerItem("lollipop",
            new Item(new FabricItemSettings().food(ModFoodComponents.LOLLIPOP)));
    public static final Item PRETZEL = registerItem("pretzel",
            new Item(new FabricItemSettings().food(ModFoodComponents.PRETZEL)));
    public static final Item FLAN = registerItem("flan",
            new Item(new FabricItemSettings().food(ModFoodComponents.FLAN)));
    public static final Item FORTUNE_COOKIE = registerItem("fortune_cookie",
            new FortuneCookieItem(new FabricItemSettings().food(ModFoodComponents.FORTUNE_COOKIE)));
    public static final Item GINGERBREAD_MAN = registerItem("gingerbread_man",
            new Item(new FabricItemSettings().food(ModFoodComponents.GINGERBREAD_MAN)));
    public static final Item GULAB_JAMUN = registerItem("gulab_jamun",
            new Item(new FabricItemSettings().food(ModFoodComponents.GULAB_JAMUN)));
    public static final Item MOONCAKE = registerItem("mooncake",
            new Item(new FabricItemSettings().food(ModFoodComponents.MOONCAKE)));
    public static final Item MUFFIN = registerItem("muffin",
            new Item(new FabricItemSettings().food(ModFoodComponents.MUFFIN)));


    //cooked
    public static final Item ROASTED_SEEDS = registerItem("roasted_seeds",
            new Item(new FabricItemSettings().food(ModFoodComponents.ROASTED_SEEDS)));
    public static final Item COOKED_MUSHROOM = registerItem("cooked_mushroom",
            new Item(new FabricItemSettings().food(ModFoodComponents.COOKED_MUSHROOM)));
    public static final Item COOKED_FUNGUS = registerItem("cooked_fungus",
            new Item(new FabricItemSettings().food(ModFoodComponents.COOKED_FUNGUS)));
    public static final Item COOKED_CARROT = registerItem("cooked_carrot",
            new Item(new FabricItemSettings().food(ModFoodComponents.COOKED_CARROT)));
    public static final Item FRIED_EGG = registerItem("fried_egg",
            new Item(new FabricItemSettings().food(ModFoodComponents.FRIED_EGG)));
    public static final Item BARBECUED_CORN = registerItem("barbecued_corn",
            new Item(new FabricItemSettings().food(ModFoodComponents.BARBECUED_CORN)));
//cooked meat
    public static final Item COOKED_BACON = registerItem("cooked_bacon",
            new Item(new FabricItemSettings().food(ModFoodComponents.COOKED_BACON)));
    public static final Item COOKED_PEPPERONI = registerItem("cooked_pepperoni",
            new Item(new FabricItemSettings().food(ModFoodComponents.COOKED_PEPPERONI)));
    public static final Item COOKED_SAUSAGE = registerItem("cooked_sausage",
            new Item(new FabricItemSettings().food(ModFoodComponents.COOKED_SAUSAGE)));
    public static final Item COOKED_HAMBURGER_STEAK = registerItem("cooked_hamburger_steak",
            new Item(new FabricItemSettings().food(ModFoodComponents.COOKED_HAMBURGER_STEAK)));
    public static final Item COOKED_CHICKEN_STEAK = registerItem("cooked_chicken_steak",
            new Item(new FabricItemSettings().food(ModFoodComponents.COOKED_CHICKEN_STEAK)));
    public static final Item COOKED_HORSE_MEAT = registerItem("cooked_horse_meat",
            new Item(new FabricItemSettings().food(ModFoodComponents.COOKED_HORSE_MEAT)));
    public static final Item COOKED_TUNA = registerItem("cooked_tuna",
            new Item(new FabricItemSettings().food(ModFoodComponents.COOKED_TUNA)));
    public static final Item COOKED_ALBACORE = registerItem("cooked_albacore",
            new Item(new FabricItemSettings().food(ModFoodComponents.COOKED_ALBACORE)));
    public static final Item COOKED_FLOUNDER = registerItem("cooked_flounder",
            new Item(new FabricItemSettings().food(ModFoodComponents.COOKED_FLOUNDER)));
    public static final Item COOKED_JAPANESE_AMBERJACK = registerItem("cooked_japanese_amberjack",
            new Item(new FabricItemSettings().food(ModFoodComponents.COOKED_JAPANESE_AMBERJACK)));
    public static final Item COOKED_MACKEREL = registerItem("cooked_mackerel",
            new Item(new FabricItemSettings().food(ModFoodComponents.COOKED_MACKEREL)));
    public static final Item COOKED_SHRIMP = registerItem("cooked_shrimp",
            new Item(new FabricItemSettings().food(ModFoodComponents.COOKED_SHRIMP)));
    public static final Item COOKED_CRAB = registerItem("cooked_crab",
            new Item(new FabricItemSettings().food(ModFoodComponents.COOKED_CRAB)));
    public static final Item COOKED_SQUID = registerItem("cooked_squid",
            new Item(new FabricItemSettings().food(ModFoodComponents.COOKED_SQUID)));
//non-edible
    public static final Item SALT = registerItem("salt", new Item(new FabricItemSettings()));
    public static final Item BUTTER = registerItem("butter", new Item(new FabricItemSettings()));
    public static final Item COFFEE_BEANS = registerItem("coffee_beans", new Item(new FabricItemSettings()));
    public static final Item HOT_DRINKS_CUP = registerItem("hot_drinks_cup", new Item(new FabricItemSettings()));
    public static final Item COLD_DRINKS_CUP = registerItem("cold_drinks_cup", new Item(new FabricItemSettings()));
    public static final Item YEAST = registerItem("yeast", new Item(new FabricItemSettings()));
    public static final Item CURRY = registerItem("curry", new Item(new FabricItemSettings()));
    public static final Item CREAM = registerItem("cream", new Item(new FabricItemSettings()));
    public static final Item STARCH = registerItem("starch", new Item(new FabricItemSettings()));
    public static final Item RICE = registerItem("rice", new Item(new FabricItemSettings()));
    public static final Item PASTA = registerItem("pasta", new Item(new FabricItemSettings()));
    public static final Item RAMEN = registerItem("ramen", new Item(new FabricItemSettings()));
    public static final Item RICE_NOODLE = registerItem("rice_noodle", new Item(new FabricItemSettings()));
    public static final Item FLOUR = registerItem("flour", new Item(new FabricItemSettings()));
    public static final Item TEA_LEAVES = registerItem("tea_leaves", new Item(new FabricItemSettings()));

    public static final Item TOMATO_SAUCE = registerItem("tomato_sauce", new Item(new FabricItemSettings()));
    public static final Item RED_FOOD_COLORING = registerItem("red_food_coloring", new Item(new FabricItemSettings()));
    public static final Item BLUE_FOOD_COLORING = registerItem("blue_food_coloring", new Item(new FabricItemSettings()));
    public static final Item GREEN_FOOD_COLORING = registerItem("green_food_coloring", new Item(new FabricItemSettings()));
    public static final Item HOT_SAUCE = registerItem("hot_sauce", new Item(new FabricItemSettings()));
    public static final Item GHOST_PEPPER_HOT_SAUCE = registerItem("ghost_pepper_hot_sauce", new Item(new FabricItemSettings()));



    //apple
    public static final Item IRON_APPLE = registerItem("iron_apple",
            new Item(new FabricItemSettings().food(ModFoodComponents.IRON_APPLE).rarity(Rarity.UNCOMMON)));
    public static final Item DIAMOND_APPLE = registerItem("diamond_apple",
            new Item(new FabricItemSettings().food(ModFoodComponents.DIAMOND_APPLE).rarity(Rarity.UNCOMMON)));
    public static final Item EMERALD_APPLE = registerItem("emerald_apple",
            new Item(new FabricItemSettings().food(ModFoodComponents.EMERALD_APPLE).rarity(Rarity.UNCOMMON)));
    public static final Item REDSTONE_APPLE = registerItem("redstone_apple",
            new Item(new FabricItemSettings().food(ModFoodComponents.REDSTONE_APPLE).rarity(Rarity.UNCOMMON)));
    public static final Item LAPIS_APPLE = registerItem("lapis_apple",
            new Item(new FabricItemSettings().food(ModFoodComponents.LAPIS_APPLE).rarity(Rarity.UNCOMMON)));
    public static final Item OBSIDIAN_APPLE = registerItem("obsidian_apple",
            new Item(new FabricItemSettings().food(ModFoodComponents.OBSIDIAN_APPLE).rarity(Rarity.UNCOMMON)));
    public static final Item GLOWSTONE_APPLE = registerItem("glowstone_apple",
            new Item(new FabricItemSettings().food(ModFoodComponents.GLOWSTONE_APPLE).rarity(Rarity.UNCOMMON)));
    public static final Item NETHERITE_APPLE = registerItem("netherite_apple",
            new Item(new FabricItemSettings().food(ModFoodComponents.NETHERITE_APPLE).rarity(Rarity.RARE)));
    public static final Item MAGMA_CARROT = registerItem("magma_carrot",
            new Item(new FabricItemSettings().food(ModFoodComponents.MAGMA_CARROT).rarity(Rarity.UNCOMMON)));
//sasimi
    public static final Item PUFFERFISH_SASHIMI = registerItem("pufferfish_sashimi",
            new Item(new FabricItemSettings().food(ModFoodComponents.PUFFERFISH_SASHIMI)));
    public static final Item SALMON_SASHIMI = registerItem("salmon_sashimi",
            new Item(new FabricItemSettings().food(ModFoodComponents.SALMON_SASHIMI)));
    public static final Item TUNA_SASHIMI = registerItem("tuna_sashimi",
            new Item(new FabricItemSettings().food(ModFoodComponents.TUNA_SASHIMI)));
    public static final Item ALBACORE_SASHIMI = registerItem("albacore_sashimi",
            new Item(new FabricItemSettings().food(ModFoodComponents.ALBACORE_SASHIMI)));
    public static final Item FLOUNDER_SASHIMI = registerItem("flounder_sashimi",
            new Item(new FabricItemSettings().food(ModFoodComponents.FLOUNDER_SASHIMI)));
    public static final Item JAPANESE_AMBERJACK_SASHIMI = registerItem("japanese_amberjack_sashimi",
            new Item(new FabricItemSettings().food(ModFoodComponents.JAPANESE_AMBERJACK_SASHIMI)));
    public static final Item MACKEREL_SASHIMI = registerItem("mackerel_sashimi",
            new Item(new FabricItemSettings().food(ModFoodComponents.MACKEREL_SASHIMI)));
    public static final Item SHRIMP_SASHIMI = registerItem("shrimp_sashimi",
            new Item(new FabricItemSettings().food(ModFoodComponents.SHRIMP_SASHIMI)));
    public static final Item SQUID_SASHIMI = registerItem("squid_sashimi",
            new Item(new FabricItemSettings().food(ModFoodComponents.SQUID_SASHIMI)));
//nether/end
    public static final Item NETHER_COOKIE = registerItem("nether_cookie",
            new Item(new FabricItemSettings().food(ModFoodComponents.NETHER_COOKIE).maxCount(1)));
    public static final Item NETHER_MUSHROOM_STEW = registerItem("nether_mushroom_stew",
            new SoupBowlItem(new FabricItemSettings().food(ModFoodComponents.NETHER_MUSHROOM_STEW).maxCount(1)));
    public static final Item NETHER_ICE_CREAM = registerItem("nether_ice_cream",
            new Item(new FabricItemSettings().food(ModFoodComponents.NETHER_ICE_CREAM).maxCount(8)));
    public static final Item NETHER_WART_PIE = registerItem("nether_wart_pie",
            new Item(new FabricItemSettings().food(ModFoodComponents.NETHER_WART_PIE)));
    public static final Item FUNGUS_STEW = registerItem("fungus_stew",
            new SoupBowlItem(new FabricItemSettings().food(ModFoodComponents.FUNGUS_STEW).maxCount(1)));
    public static final Item ENDER_COOKIE = registerItem("ender_cookie",
            new Item(new FabricItemSettings().food(ModFoodComponents.ENDER_COOKIE)));
    public static final Item END_PIE = registerItem("end_pie",
            new Item(new FabricItemSettings().food(ModFoodComponents.END_PIE)));
//jp fd
    public static final Item ODEN = registerItem("oden",
            new SoupBowlItem(new FabricItemSettings().food(ModFoodComponents.ODEN)));
    public static final Item COOKED_RICE = registerItem("cooked_rice",
            new Item(new FabricItemSettings().food(ModFoodComponents.COOKED_RICE)));
    public static final Item SALMON_ONIGIRI = registerItem("salmon_onigiri",
            new Item(new FabricItemSettings().food(ModFoodComponents.SALMON_ONIGIRI)));
    public static final Item TUNA_ONIGIRI = registerItem("tuna_onigiri",
            new Item(new FabricItemSettings().food(ModFoodComponents.TUNA_ONIGIRI)));
    public static final Item TAMAGO_ONIGIRI = registerItem("tamago_onigiri",
            new Item(new FabricItemSettings().food(ModFoodComponents.TAMAGO_ONIGIRI)));
    public static final Item NOZAWANA_ONIGIRI = registerItem("nozawana_onigiri",
            new Item(new FabricItemSettings().food(ModFoodComponents.NOZAWANA_ONIGIRI)));
    public static final Item TERIYAKI_CHICKEN_ONIGIRI = registerItem("teriyaki_chicken_onigiri",
            new Item(new FabricItemSettings().food(ModFoodComponents.TERIYAKI_CHICKEN_ONIGIRI)));
    public static final Item PUFFERFISH_SUSHI = registerItem("pufferfish_sushi",
            new Item(new FabricItemSettings().food(ModFoodComponents.PUFFERFISH_SUSHI)));
    public static final Item SALMON_SUSHI = registerItem("salmon_sushi",
            new Item(new FabricItemSettings().food(ModFoodComponents.SALMON_SUSHI)));
    public static final Item TUNA_SUSHI = registerItem("tuna_sushi",
            new Item(new FabricItemSettings().food(ModFoodComponents.TUNA_SUSHI)));
    public static final Item ALBACORE_SUSHI = registerItem("albacore_sushi",
            new Item(new FabricItemSettings().food(ModFoodComponents.ALBACORE_SUSHI)));
    public static final Item FLOUNDER_SUSHI = registerItem("flounder_sushi",
            new Item(new FabricItemSettings().food(ModFoodComponents.FLOUNDER_SUSHI)));
    public static final Item JAPANESE_AMBERJACK_SUSHI = registerItem("japanese_amberjack_sushi",
            new Item(new FabricItemSettings().food(ModFoodComponents.JAPANESE_AMBERJACK_SUSHI)));
    public static final Item MACKEREL_SUSHI = registerItem("mackerel_sushi",
            new Item(new FabricItemSettings().food(ModFoodComponents.MACKEREL_SUSHI)));
    public static final Item SHRIMP_SUSHI = registerItem("shrimp_sushi",
            new Item(new FabricItemSettings().food(ModFoodComponents.SHRIMP_SUSHI)));
    public static final Item WAGYUU_SUSHI = registerItem("wagyuu_sushi",
            new Item(new FabricItemSettings().food(ModFoodComponents.WAGYUU_SUSHI)));
    public static final Item TAMAGO_SUSHI = registerItem("tamago_sushi",
            new Item(new FabricItemSettings().food(ModFoodComponents.TAMAGO_SUSHI)));
    public static final Item SEAWEED_SALAD_SUSHI = registerItem("seaweed_salad_sushi",
            new Item(new FabricItemSettings().food(ModFoodComponents.SEAWEED_SALAD_SUSHI)));
    public static final Item SQUID_SUSHI = registerItem("squid_sushi",
            new Item(new FabricItemSettings().food(ModFoodComponents.SQUID_SUSHI)));
    public static final Item CORN_SUSHI = registerItem("corn_sushi",
            new Item(new FabricItemSettings().food(ModFoodComponents.CORN_SUSHI)));
    public static final Item TONKOTSU_RAMEN = registerItem("tonkotsu_ramen",
            new SoupBowlItem(new FabricItemSettings().food(ModFoodComponents.TONKOTSU_RAMEN)));
    public static final Item CHEESE_RAMEN = registerItem("cheese_ramen",
            new SoupBowlItem(new FabricItemSettings().food(ModFoodComponents.CHEESE_RAMEN)));
    public static final Item GYUUDON = registerItem("gyuudon",
            new SoupBowlItem(new FabricItemSettings().food(ModFoodComponents.GYUUDON)));
    public static final Item NARUTOMAKI = registerItem("narutomaki",
            new Item(new FabricItemSettings().food(ModFoodComponents.NARUTOMAKI)));
    public static final Item MISO_SOUP = registerItem("miso_soup",
            new Item(new FabricItemSettings().food(ModFoodComponents.MISO_SOUP)));
    public static final Item TOFU = registerItem("tofu",
            new Item(new FabricItemSettings().food(ModFoodComponents.TOFU)));


    //hk
    public static final Item SIU_MAI = registerItem("siu_mai",
            new Item(new FabricItemSettings().food(ModFoodComponents.SIU_MAI)));
    public static final Item CURRY_FISHBALL = registerItem("curry_fishball",
            new Item(new FabricItemSettings().food(ModFoodComponents.CURRY_FISHBALL)));
    public static final Item CHECKERED_EGG_WAFFLE = registerItem("checkered_egg_waffle",
            new Item(new FabricItemSettings().food(ModFoodComponents.CHECKERED_EGG_WAFFLE)));
    public static final Item EGG_PUFF = registerItem("egg_puff",
            new Item(new FabricItemSettings().food(ModFoodComponents.EGG_PUFF)));
    public static final Item BEEF_BALLS = registerItem("beef_balls",
            new Item(new FabricItemSettings().food(ModFoodComponents.BEEF_BALLS)));
    public static final Item PORK_RICE_NOODLE = registerItem("pork_rice_noodle",
            new Item(new FabricItemSettings().food(ModFoodComponents.PORK_RICE_NOODLE)));
    public static final Item BRIDGE_RICE_NOODLE = registerItem("bridge_rice_noodle",
            new Item(new FabricItemSettings().food(ModFoodComponents.BRIDGE_RICE_NOODLE)));
    public static final Item EGG_TART = registerItem("egg_tart",
            new Item(new FabricItemSettings().food(ModFoodComponents.EGG_TART)));

//snack
public static final Item BEEF_JERKY = registerItem("beef_jerky",
        new Item(new FabricItemSettings().food(ModFoodComponents.BEEF_JERKY)));
    public static final Item PORK_JERKY = registerItem("pork_jerky",
            new Item(new FabricItemSettings().food(ModFoodComponents.PORK_JERKY)));
    public static final Item MUTTON_JERKY = registerItem("mutton_jerky",
            new Item(new FabricItemSettings().food(ModFoodComponents.MUTTON_JERKY)));
    public static final Item PICKLED_EGG = registerItem("pickled_egg",
            new Item(new FabricItemSettings().food(ModFoodComponents.PICKLED_EGG)));
    public static final Item PICKLE = registerItem("pickle",
            new Item(new FabricItemSettings().food(ModFoodComponents.PICKLE)));
    public static final Item RAISINS = registerItem("raisins",
            new Item(new FabricItemSettings().food(ModFoodComponents.RAISINS)));
    public static final Item RICE_CRACKER = registerItem("rice_cracker",
            new Item(new FabricItemSettings().food(ModFoodComponents.RICE_CRACKER)));


    //drink
    public static final Item CUP_OF_TEA = registerItem("cup_of_tea",
            new Item(new FabricItemSettings().food(ModFoodComponents.CUP_OF_TEA)));
    public static final Item BUBBLE_TEA = registerItem("bubble_tea",
            new Item(new FabricItemSettings().food(ModFoodComponents.BUBBLE_TEA)));
    public static final Item HOT_CHOCOLATE = registerItem("hot_chocolate",
            new Item(new FabricItemSettings().food(ModFoodComponents.HOT_CHOCOLATE)));
    public static final Item MILK_TEA = registerItem("milk_tea",
            new Item(new FabricItemSettings().food(ModFoodComponents.MILK_TEA)));

//alco
    public static final Item VODKA = registerItem("vodka",
            new VodkaItem(new FabricItemSettings().food(ModFoodComponents.VODKA).recipeRemainder(Items.GLASS_BOTTLE)));
    public static final Item RED_WINE = registerItem("red_wine",
            new RedWineItem(new FabricItemSettings().food(ModFoodComponents.RED_WINE).recipeRemainder(Items.GLASS_BOTTLE)));
    public static final Item BEER = registerItem("beer",
            new BeerItem(new FabricItemSettings().food(ModFoodComponents.BEER).recipeRemainder(Items.GLASS_BOTTLE)));
    public static final Item GRAPE_WINE = registerItem("grape_wine",
            new GrapeWineItem(new FabricItemSettings().food(ModFoodComponents.GRAPE_WINE).recipeRemainder(Items.GLASS_BOTTLE)));
//ingredient
    public static final Item CHEESE = registerItem("cheese",
            new Item(new FabricItemSettings().food(ModFoodComponents.CHEESE)));
    public static final Item OIL = registerItem("oil",
            new OilItem(new FabricItemSettings().food(ModFoodComponents.OIL).recipeRemainder(Items.GLASS_BOTTLE)));
    public static final Item MUSTARD = registerItem("mustard",
            new MustardItem(new FabricItemSettings().food(ModFoodComponents.MUSTARD).recipeRemainder(Items.BOWL)));
    public static final Item SALAD_DRESSING = registerItem("salad_dressing",
            new SaladDressingItem(new FabricItemSettings().food(ModFoodComponents.SALAD_DRESSING).recipeRemainder(Items.BOWL)));
    public static final Item SYRUP = registerItem("syrup",
            new SyrupItem(new FabricItemSettings().food(ModFoodComponents.SYRUP).recipeRemainder(Items.GLASS_BOTTLE)));
    public static final Item VINEGAR = registerItem("vinegar",
            new BottledItem(new FabricItemSettings().food(ModFoodComponents.VINEGAR).recipeRemainder(Items.GLASS_BOTTLE)));






    public static final Item EMERALD_HELMET = registerItem("emerald_helmet",
        new ArmorItem(ModArmorMaterials.EMERALD, ArmorItem.Type.HELMET,new FabricItemSettings()));
    public static final Item EMERALD_CHESTPLATE = registerItem("emerald_chestplate",
            new ArmorItem(ModArmorMaterials.EMERALD, ArmorItem.Type.CHESTPLATE,new FabricItemSettings()));
    public static final Item EMERALD_LEGGINGS = registerItem("emerald_leggings",
            new ArmorItem(ModArmorMaterials.EMERALD, ArmorItem.Type.LEGGINGS,new FabricItemSettings()));
    public static final Item EMERALD_BOOTS = registerItem("emerald_boots",
            new ArmorItem(ModArmorMaterials.EMERALD, ArmorItem.Type.BOOTS,new FabricItemSettings()));
    public static final Item OBSIDIAN_HELMET = registerItem("obsidian_helmet",
            new ArmorItem(ModArmorMaterials.OBSIDIAN, ArmorItem.Type.HELMET,new FabricItemSettings()));
    public static final Item OBSIDIAN_CHESTPLATE = registerItem("obsidian_chestplate",
            new ArmorItem(ModArmorMaterials.OBSIDIAN, ArmorItem.Type.CHESTPLATE,new FabricItemSettings()));
    public static final Item OBSIDIAN_LEGGINGS = registerItem("obsidian_leggings",
            new ArmorItem(ModArmorMaterials.OBSIDIAN, ArmorItem.Type.LEGGINGS,new FabricItemSettings()));
    public static final Item OBSIDIAN_BOOTS = registerItem("obsidian_boots",
            new ArmorItem(ModArmorMaterials.OBSIDIAN, ArmorItem.Type.BOOTS,new FabricItemSettings()));
    public static final Item COBBLESTONE_HELMET = registerItem("cobblestone_helmet",
            new ArmorItem(ModArmorMaterials.COBBLESTONE, ArmorItem.Type.HELMET,new FabricItemSettings()));
    public static final Item COBBLESTONE_CHESTPLATE = registerItem("cobblestone_chestplate",
            new ArmorItem(ModArmorMaterials.COBBLESTONE, ArmorItem.Type.CHESTPLATE,new FabricItemSettings()));
    public static final Item COBBLESTONE_LEGGINGS = registerItem("cobblestone_leggings",
            new ArmorItem(ModArmorMaterials.COBBLESTONE, ArmorItem.Type.LEGGINGS,new FabricItemSettings()));
    public static final Item COBBLESTONE_BOOTS = registerItem("cobblestone_boots",
            new ArmorItem(ModArmorMaterials.COBBLESTONE, ArmorItem.Type.BOOTS,new FabricItemSettings()));
    public static final Item COPPER_HELMET = registerItem("copper_helmet",
            new ArmorItem(ModArmorMaterials.COPPER, ArmorItem.Type.HELMET,new FabricItemSettings()));
    public static final Item COPPER_CHESTPLATE = registerItem("copper_chestplate",
            new ArmorItem(ModArmorMaterials.COPPER, ArmorItem.Type.CHESTPLATE,new FabricItemSettings()));
    public static final Item COPPER_LEGGINGS = registerItem("copper_leggings",
            new ArmorItem(ModArmorMaterials.COPPER, ArmorItem.Type.LEGGINGS,new FabricItemSettings()));
    public static final Item COPPER_BOOTS = registerItem("copper_boots",
            new ArmorItem(ModArmorMaterials.COPPER, ArmorItem.Type.BOOTS,new FabricItemSettings()));


    public static final Item STRAWBERRY_SWORD = registerItem("strawberry_sword",
            new SwordItem(ModToolMaterials.STRAWBERRY, 1, 2f,
                    new FabricItemSettings().food(ModFoodComponents.STRAWBERRY_SWORD)));
    public static final Item STRAWBERRY_AXE = registerItem("strawberry_axe",
            new ModAxeItem(ModToolMaterials.STRAWBERRY, 1, 1f,
                    new FabricItemSettings().food(ModFoodComponents.STRAWBERRY_AXE)));
    public static final Item STRAWBERRY_HOE = registerItem("strawberry_hoe",
            new ModHoeItem(ModToolMaterials.STRAWBERRY, 0, 0f,
                    new FabricItemSettings().food(ModFoodComponents.STRAWBERRY_HOE)));
    public static final Item STRAWBERRY_SHOVEL = registerItem("strawberry_shovel",
            new ShovelItem(ModToolMaterials.STRAWBERRY, 0, 1f,
                    new FabricItemSettings().food(ModFoodComponents.STRAWBERRY_SHOVEL)));
    public static final Item STRAWBERRY_PICKAXE = registerItem("strawberry_pickaxe",
            new ModPickaxeItem(ModToolMaterials.STRAWBERRY, 1, 0f,
                    new FabricItemSettings().food(ModFoodComponents.STRAWBERRY_PICKAXE)));

    public static final Item COPPER_SWORD = registerItem("copper_sword",
            new SwordItem(ModToolMaterials.COPPER, 3, -2.2f,
                    new FabricItemSettings()));
    public static final Item COPPER_AXE = registerItem("copper_axe",
            new ModAxeItem(ModToolMaterials.COPPER, 6.0f, -2.9f,
                    new FabricItemSettings()));
    public static final Item COPPER_HOE = registerItem("copper_hoe",
            new ModHoeItem(ModToolMaterials.COPPER, -2, -0.8f,
                    new FabricItemSettings()));
    public static final Item COPPER_SHOVEL = registerItem("copper_shovel",
            new ShovelItem(ModToolMaterials.COPPER, 1.5f, -2.8f,
                    new FabricItemSettings()));
    public static final Item COPPER_PICKAXE = registerItem("copper_pickaxe",
            new ModPickaxeItem(ModToolMaterials.COPPER, 1, -2.6f,
                    new FabricItemSettings()));

    public static final Item EMERALD_SWORD = registerItem("emerald_sword",
            new SwordItem(ModToolMaterials.EMERALD, 3, -2.2f,
                    new FabricItemSettings()));
    public static final Item EMERALD_AXE = registerItem("emerald_axe",
            new ModAxeItem(ModToolMaterials.EMERALD, 6.0f, -2.9f,
                    new FabricItemSettings()));
    public static final Item EMERALD_HOE = registerItem("emerald_hoe",
            new ModHoeItem(ModToolMaterials.EMERALD, -2, -0.8f,
                    new FabricItemSettings()));
    public static final Item EMERALD_SHOVEL = registerItem("emerald_shovel",
            new ShovelItem(ModToolMaterials.EMERALD, 1.5f, -2.8f,
                    new FabricItemSettings()));
    public static final Item EMERALD_PICKAXE = registerItem("emerald_pickaxe",
            new ModPickaxeItem(ModToolMaterials.EMERALD, 1, -2.6f,
                    new FabricItemSettings()));

    public static final Item IRON_SPEAR = registerItem("iron_spear",
            new SpearItem(ToolMaterials.IRON, 1, -2.6f, new FabricItemSettings(), 2, 2));

    public static final Item PAN = registerItem("pan",
            new SwordItem(ToolMaterials.IRON, 2, 2f,
                    new FabricItemSettings()));
    public static final Item DIAMOND_PAN = registerItem("diamond_pan",
            new SwordItem(ToolMaterials.DIAMOND, 2, 2f,
                    new FabricItemSettings()));
    public static final Item NETHERITE_PAN = registerItem("netherite_pan",
            new SwordItem(ToolMaterials.NETHERITE, 2, 2.2f,
                    new FabricItemSettings()));

    public static final Item EMOTIONAL_STICK = registerItem("emotional_stick",
            new EmotionalStickItem(ToolMaterials.WOOD, 0, 5f,
                    new FabricItemSettings()));

//    public static final Item CHERRY_SIGN = registerItem("cherry_sign",
//            new SignItem(new FabricItemSettings().maxCount(16), ModBlocks.STANDING_CHERRY_SIGN, ModBlocks.WALL_CHERRY_SIGN));
//    public static final Item HANGING_CHERRY_SIGN = registerItem("cherry_hanging_sign",
//            new HangingSignItem(ModBlocks.HANGING_CHERRY_SIGN, ModBlocks.WALL_HANGING_CHERRY_SIGN, new FabricItemSettings().maxCount(16)));

    public static final Item MUMMY_SPAWN_EGG = registerItem("mummy_spawn_egg",
            new SpawnEggItem(ModEntities.MUMMY,0xf1c593, 0x918272,
                    new FabricItemSettings()));
    public static final Item NATSU_SPAWN_EGG = registerItem("natsu_spawn_egg",
            new SpawnEggItem(ModEntities.NATSU,0xcd6cc2, 0xe4566c,
                    new FabricItemSettings()));
    public static final Item ZEROFOUR_SPAWN_EGG = registerItem("zerofour_spawn_egg",
            new SpawnEggItem(ModEntities.ZEROFOUR,0x7a6a57, 0xf0c8a0,
                    new FabricItemSettings()));
    public static final Item YAGI_SPAWN_EGG = registerItem("yagi_spawn_egg",
            new SpawnEggItem(ModEntities.YAGI,0xddbc65, 0x6a6161,
                    new FabricItemSettings()));
    public static final Item TORA_SPAWN_EGG = registerItem("tora_spawn_egg",
            new SpawnEggItem(ModEntities.TORA,0xaccdff, 0x5a5c5b,
                    new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(RandomThingsMod.MOD_ID, name), item);
    }


    public static void registerModItems() {
        RandomThingsMod.LOGGER.info("Registering Mod Items for " + RandomThingsMod.MOD_ID);
    }
}


