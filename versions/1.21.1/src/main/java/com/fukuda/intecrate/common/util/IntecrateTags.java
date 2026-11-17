package com.fukuda.intecrate.common.util;

import com.fukuda.intecrate.Intecrate;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class IntecrateTags {
    public static class Blocks {
        private static TagKey<Block> createTag(String name) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(Intecrate.MOD_ID, name));
        }

        public static final TagKey<Block> WOODEN_SLABS = createTag("wooden_slabs");
        public static final TagKey<Block> CRATE = createTag("rate");
        public static final TagKey<Block> BASKET = createTag("basket");
        public static final TagKey<Block> BARREL = createTag("barrel");
        public static final TagKey<Block> BUCKET = createTag("bucket");
        public static final TagKey<Block> BOX = createTag("box");
        public static final TagKey<Block> BAG = createTag("bag");
        public static final TagKey<Block> CAKE = createTag("cake");
    }

    public static class Items {
        private static TagKey<Item> createTag(String name) {
            return  ItemTags.create(ResourceLocation.fromNamespaceAndPath(Intecrate.MOD_ID, name));
        }

        public static final TagKey<Item> WOODEN_SLABS = createTag("wooden_slabs");
        public static final TagKey<Item> SLICED_CAKE = createTag("sliced_cake");
        public static final TagKey<Item> KNIVES = createTag("knives");
    }
}