package com.fukuda.intecrate.common.data;

import com.fukuda.intecrate.Intecrate;
import com.fukuda.intecrate.common.util.IntecrateTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.level.block.Block;

import java.util.concurrent.CompletableFuture;

public class IntecrateItemTagProvider extends ItemTagsProvider {
    public IntecrateItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, CompletableFuture<TagLookup<Block>> blockTags) {
        super(output, lookupProvider, blockTags, Intecrate.MOD_ID);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
//        tag(IntecrateTags.Items.WOODEN_SLABS)
//                .add(IntecrateItems.EXAMPLE_ITEM.get());

        copy(IntecrateTags.Blocks.WOODEN_SLABS, IntecrateTags.Items.WOODEN_SLABS);
        copy(IntecrateTags.Blocks.IS_DECORATION_CRATE, IntecrateTags.Items.IS_DECORATION_CRATE);
        copy(IntecrateTags.Blocks.IS_DECORATION_BASKET, IntecrateTags.Items.IS_DECORATION_BASKET);
        copy(IntecrateTags.Blocks.IS_DECORATION_BARREL, IntecrateTags.Items.IS_DECORATION_BARREL);
        copy(IntecrateTags.Blocks.IS_DECORATION_BUCKET, IntecrateTags.Items.IS_DECORATION_BUCKET);
        copy(IntecrateTags.Blocks.IS_DECORATION_BAG, IntecrateTags.Items.IS_DECORATION_BAG);
    }
}
