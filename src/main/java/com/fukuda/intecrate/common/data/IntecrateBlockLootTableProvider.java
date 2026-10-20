package com.fukuda.intecrate.common.data;

import com.fukuda.intecrate.common.block.*;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;

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
        dropSelf(StorageCrates.CRATE.get());
        dropSelf(StorageCrates.APPLE_CRATE.get());
        dropSelf(StorageCrates.CARROT_CRATE.get());
        dropSelf(StorageCrates.BEETROOT_CRATE.get());
        dropSelf(StorageCrates.POTATO_CRATE.get());
        dropSelf(StorageCrates.POISONOUS_POTATO_CRATE.get());
        dropSelf(StorageCrates.RED_MUSHROOM_CRATE.get());
        dropSelf(StorageCrates.BROWN_MUSHROOM_CRATE.get());

        /* Baskets */
        dropSelf(StorageBaskets.BASKET.get());
        dropSelf(StorageBaskets.ALLIUM_BASKET.get());
        dropSelf(StorageBaskets.CORNFLOWER_BASKET.get());
        dropSelf(StorageBaskets.DANDELION_BASKET.get());
        dropSelf(StorageBaskets.POPPY_BASKET.get());
        dropSelf(StorageBaskets.SWEET_BERRY_BASKET.get());
        dropSelf(StorageBaskets.OXEYE_DAISY_BASKET.get());
        dropSelf(StorageBaskets.AZURE_BLUET_BASKET.get());

        /* Barrels */
        dropSelf(StorageBarrels.FISH_BARREL.get());
        dropSelf(StorageBarrels.COD_BARREL.get());
        dropSelf(StorageBarrels.PUFFERFISH_BARREL.get());
        dropSelf(StorageBarrels.SALMON_BARREL.get());
        dropSelf(StorageBarrels.TROPICAL_FISH_BARREL.get());

        /* Buckets */
        dropSelf(StorageBuckets.STORAGE_BUCKET.get());
        dropSelf(StorageBuckets.BRAIN_CORAL_BUCKET.get());
        dropSelf(StorageBuckets.BUBBLE_CORAL_BUCKET.get());
        dropSelf(StorageBuckets.FIRE_CORAL_BUCKET.get());
        dropSelf(StorageBuckets.HORN_CORAL_BUCKET.get());
        dropSelf(StorageBuckets.TUBE_CORAL_BUCKET.get());

        /* Bags */
        dropSelf(StorageBags.SEED_BAG.get());
        dropSelf(StorageBags.WHEAT_SEED_BAG.get());
        dropSelf(StorageBags.PUMPKIN_SEED_BAG.get());
        dropSelf(StorageBags.MELON_SEED_BAG.get());
        dropSelf(StorageBags.BEETROOT_SEED_BAG.get());
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        List<Block> blocks = new ArrayList<>();

        StorageCrates.STORECRATE.getEntries().forEach(h -> blocks.add(h.value()));
        StorageBaskets.STOREBASKET.getEntries().forEach(h -> blocks.add(h.value()));
        StorageBarrels.STOREBARREL.getEntries().forEach(h -> blocks.add(h.value()));
        StorageBuckets.STOREBUCKET.getEntries().forEach(h -> blocks.add(h.value()));
        StorageBags.STOREBAG.getEntries().forEach(h -> blocks.add(h.value()));
        return blocks;
    }
}
