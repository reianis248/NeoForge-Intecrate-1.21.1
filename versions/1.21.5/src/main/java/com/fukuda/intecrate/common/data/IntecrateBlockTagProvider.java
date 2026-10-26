package com.fukuda.intecrate.common.data;

import com.fukuda.intecrate.Intecrate;
import com.fukuda.intecrate.common.block.*;
import com.fukuda.intecrate.common.util.IntecrateTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.common.data.BlockTagsProvider;

import java.util.concurrent.CompletableFuture;

public class IntecrateBlockTagProvider extends BlockTagsProvider {
    public IntecrateBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider, Intecrate.MOD_ID);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(BlockTags.MINEABLE_WITH_AXE)
                .addTag(IntecrateTags.Blocks.IS_DECORATION_CRATE)
                .addTag(IntecrateTags.Blocks.IS_DECORATION_BASKET)
                .addTag(IntecrateTags.Blocks.IS_DECORATION_BARREL);

        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .addTag(IntecrateTags.Blocks.IS_DECORATION_BUCKET);

        tag(IntecrateTags.Blocks.WOODEN_SLABS)
                .add(Blocks.OAK_SLAB)
                .add(Blocks.SPRUCE_SLAB)
                .add(Blocks.BIRCH_SLAB)
                .add(Blocks.JUNGLE_SLAB)
                .add(Blocks.ACACIA_SLAB)
                .add(Blocks.DARK_OAK_SLAB)
                .add(Blocks.CRIMSON_SLAB)
                .add(Blocks.WARPED_SLAB)
                .add(Blocks.CHERRY_SLAB)
                .add(Blocks.MANGROVE_SLAB)
                .add(Blocks.BAMBOO_SLAB);


        tag(IntecrateTags.Blocks.IS_DECORATION_CRATE)
                .add(DecoCrates.CRATE.get())
                .add(DecoCrates.APPLE_CRATE.get())
                .add(DecoCrates.CARROT_CRATE.get())
                .add(DecoCrates.BEETROOT_CRATE.get())
                .add(DecoCrates.POTATO_CRATE.get())
                .add(DecoCrates.POISONOUS_POTATO_CRATE.get())
                .add(DecoCrates.RED_MUSHROOM_CRATE.get())
                .add(DecoCrates.BROWN_MUSHROOM_CRATE.get());

        tag(IntecrateTags.Blocks.IS_DECORATION_BASKET)
                .add(DecoBaskets.BASKET.get())
                .add(DecoBaskets.ALLIUM_BASKET.get())
                .add(DecoBaskets.CORNFLOWER_BASKET.get())
                .add(DecoBaskets.DANDELION_BASKET.get())
                .add(DecoBaskets.POPPY_BASKET.get())
                .add(DecoBaskets.SWEET_BERRY_BASKET.get())
                .add(DecoBaskets.OXEYE_DAISY_BASKET.get())
                .add(DecoBaskets.AZURE_BLUET_BASKET.get());

        tag(IntecrateTags.Blocks.IS_DECORATION_BARREL)
                .add(DecoBarrels.FISH_BARREL.get())
                .add(DecoBarrels.COD_BARREL.get())
                .add(DecoBarrels.PUFFERFISH_BARREL.get())
                .add(DecoBarrels.SALMON_BARREL.get())
                .add(DecoBarrels.TROPICAL_FISH_BARREL.get());

        tag(IntecrateTags.Blocks.IS_DECORATION_BUCKET)
                .add(DecoBuckets.STORAGE_BUCKET.get())
                .add(DecoBuckets.BRAIN_CORAL_BUCKET.get())
                .add(DecoBuckets.BUBBLE_CORAL_BUCKET.get())
                .add(DecoBuckets.FIRE_CORAL_BUCKET.get())
                .add(DecoBuckets.HORN_CORAL_BUCKET.get())
                .add(DecoBuckets.TUBE_CORAL_BUCKET.get());

        tag(IntecrateTags.Blocks.IS_DECORATION_BAG)
                .add(DecoBags.SEED_BAG.get())
                .add(DecoBags.WHEAT_SEED_BAG.get())
                .add(DecoBags.PUMPKIN_SEED_BAG.get())
                .add(DecoBags.MELON_SEED_BAG.get())
                .add(DecoBags.BEETROOT_SEED_BAG.get());

    }
}
