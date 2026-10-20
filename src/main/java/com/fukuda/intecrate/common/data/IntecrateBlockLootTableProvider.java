package com.fukuda.intecrate.common.data;

import com.fukuda.intecrate.common.block.*;
import de.Roboter007.moderntabs.section.item.SectionedItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;

import java.util.Set;

public class IntecrateBlockLootTableProvider extends BlockLootSubProvider {
    protected IntecrateBlockLootTableProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {
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
}
