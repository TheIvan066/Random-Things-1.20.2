package net.theivan066.randomthingsmod.util;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.theivan066.randomthingsmod.RandomThingsMod;

public class ModTags {
    public static class Blocks {

       /* public static final TagKey<Block> DOWSING_ROD_DETECTABLE_BLOCKS =
                createTag("dowsing_rod_detectable_blocks");
        public static final TagKey<Block> PAXEL_MINEABLE =
                createTag("mineable/paxel");

        public static final TagKey<Block> ORICHALCUM_BLOCKS =
                createCommonTag("orichalcum_blocks");
        public static final TagKey<Block> ORICHALCUM_ORES =
                createCommonTag("orichalcum_ores");  */



        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, new Identifier(RandomThingsMod.MOD_ID, name));
        }

        private static TagKey<Block> createCommonTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, new Identifier("c", name));
        }
    }

    public static class Items {
       /* public static final TagKey<Item> ORICHALCUM_INGOTS = createCommonTag("orichalcum_ingots");
        public static final TagKey<Item> ORICHALCUM_NUGGETS = createCommonTag("orichalcum_nuggets");  */

        public static final TagKey<Item> PEPPERS = createTag("peppers");

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, new Identifier(RandomThingsMod.MOD_ID, name));
        }

        private static TagKey<Item> createCommonTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, new Identifier("c", name));
        }
    }
}