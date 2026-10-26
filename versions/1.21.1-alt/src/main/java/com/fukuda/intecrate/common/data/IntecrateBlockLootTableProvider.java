package com.fukuda.intecrate.common.data;

import com.fukuda.intecrate.common.block.*;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class IntecrateBlockLootTableProvider extends BlockLootSubProvider {
    protected IntecrateBlockLootTableProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {
//        dropSelf(CaveMineralBlocks.EXAMPLE_BLOCK);

//        Drops a Minimum to Maximum Amount of Item(s).

//        add(CaveMineralBlocks.TIDE_CRYSTAL_ORE.get(),
//                block -> createMultipleOreDrops(CaveMineralBlocks.TIDE_CRYSTAL_ORE.get(), CaveMineralItems.TIDE_CRYSTAL.get(), 1, 3));

        /* Crates */
        dropSelf(DecoCrates.CRATE.get());
        dropSelf(DecoCrates.APPLE_CRATE.get());
        dropSelf(DecoCrates.CARROT_CRATE.get());
        dropSelf(DecoCrates.BEETROOT_CRATE.get());
        dropSelf(DecoCrates.POTATO_CRATE.get());
        dropSelf(DecoCrates.POISONOUS_POTATO_CRATE.get());
        dropSelf(DecoCrates.RED_MUSHROOM_CRATE.get());
        dropSelf(DecoCrates.BROWN_MUSHROOM_CRATE.get());

        /* Baskets */
        dropSelf(DecoBaskets.BASKET.get());
        dropSelf(DecoBaskets.ALLIUM_BASKET.get());
        dropSelf(DecoBaskets.CORNFLOWER_BASKET.get());
        dropSelf(DecoBaskets.DANDELION_BASKET.get());
        dropSelf(DecoBaskets.POPPY_BASKET.get());
        dropSelf(DecoBaskets.SWEET_BERRY_BASKET.get());
        dropSelf(DecoBaskets.OXEYE_DAISY_BASKET.get());
        dropSelf(DecoBaskets.AZURE_BLUET_BASKET.get());

        /* Barrels */
        dropSelf(DecoBarrels.FISH_BARREL.get());
        dropSelf(DecoBarrels.COD_BARREL.get());
        dropSelf(DecoBarrels.PUFFERFISH_BARREL.get());
        dropSelf(DecoBarrels.SALMON_BARREL.get());
        dropSelf(DecoBarrels.TROPICAL_FISH_BARREL.get());

        /* Buckets */
        dropSelf(DecoBuckets.STORAGE_BUCKET.get());
        dropSelf(DecoBuckets.BRAIN_CORAL_BUCKET.get());
        dropSelf(DecoBuckets.BUBBLE_CORAL_BUCKET.get());
        dropSelf(DecoBuckets.FIRE_CORAL_BUCKET.get());
        dropSelf(DecoBuckets.HORN_CORAL_BUCKET.get());
        dropSelf(DecoBuckets.TUBE_CORAL_BUCKET.get());

        /* Bags */
        dropSelf(DecoBags.SEED_BAG.get());
        dropSelf(DecoBags.WHEAT_SEED_BAG.get());
        dropSelf(DecoBags.PUMPKIN_SEED_BAG.get());
        dropSelf(DecoBags.MELON_SEED_BAG.get());
        dropSelf(DecoBags.BEETROOT_SEED_BAG.get());
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        List<Block> blocks = new ArrayList<>();

        DecoCrates.DECOCRATE.getEntries().forEach(h -> blocks.add(h.value()));
        DecoBaskets.DECOBASKET.getEntries().forEach(h -> blocks.add(h.value()));
        DecoBarrels.DECOBARREL.getEntries().forEach(h -> blocks.add(h.value()));
        DecoBuckets.DECOBUCKET.getEntries().forEach(h -> blocks.add(h.value()));
        DecoBags.DECOBAG.getEntries().forEach(h -> blocks.add(h.value()));
        return blocks;
    }
}
