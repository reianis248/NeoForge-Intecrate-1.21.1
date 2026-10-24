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
        public static final TagKey<Block> IS_CRATE = createTag("is_crate");
        public static final TagKey<Block> IS_BASKET = createTag("is_basket");
        public static final TagKey<Block> IS_BARREL = createTag("is_barrel");
        public static final TagKey<Block> IS_BUCKET = createTag("is_bucket");
    }

    public static class Items {
        private static TagKey<Item> createTag(String name) {
            return  ItemTags.create(ResourceLocation.fromNamespaceAndPath(Intecrate.MOD_ID, name));
        }

        public static final TagKey<Item> WOODEN_SLABS = createTag("wooden_slabs");
    }
}
