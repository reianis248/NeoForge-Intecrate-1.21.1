package com.fukuda.intecrate.common.data;

import com.fukuda.intecrate.Intecrate;
import com.fukuda.intecrate.common.block.StorageBarrels;
import com.fukuda.intecrate.common.block.StorageBaskets;
import com.fukuda.intecrate.common.block.StorageBuckets;
import com.fukuda.intecrate.common.block.StorageCrates;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class IntecrateBlockTagProvider extends BlockTagsProvider {
    public IntecrateBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, Intecrate.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(BlockTags.MINEABLE_WITH_AXE)
                /* Crates */
                .add(StorageCrates.CRATE.get())
                .add(StorageCrates.APPLE_CRATE.get())
                .add(StorageCrates.CARROT_CRATE.get())
                .add(StorageCrates.BEETROOT_CRATE.get())
                .add(StorageCrates.POTATO_CRATE.get())
                .add(StorageCrates.POISONOUS_POTATO_CRATE.get())
                .add(StorageCrates.RED_MUSHROOM_CRATE.get())
                .add(StorageCrates.BROWN_MUSHROOM_CRATE.get())
                /* Baskets */
                .add(StorageBaskets.BASKET.get())
                .add(StorageBaskets.ALLIUM_BASKET.get())
                .add(StorageBaskets.CORNFLOWER_BASKET.get())
                .add(StorageBaskets.DANDELION_BASKET.get())
                .add(StorageBaskets.POPPY_BASKET.get())
                .add(StorageBaskets.SWEET_BERRY_BASKET.get())
                .add(StorageBaskets.OXEYE_DAISY_BASKET.get())
                .add(StorageBaskets.AZURE_BLUET_BASKET.get())
                /* Barrels */
                .add(StorageBarrels.FISH_BARREL.get())
                .add(StorageBarrels.COD_BARREL.get())
                .add(StorageBarrels.PUFFERFISH_BARREL.get())
                .add(StorageBarrels.SALMON_BARREL.get())
                .add(StorageBarrels.TROPICAL_FISH_BARREL.get());
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(StorageBuckets.STORAGE_BUCKET.get())
                .add(StorageBuckets.BRAIN_CORAL_BUCKET.get())
                .add(StorageBuckets.BUBBLE_CORAL_BUCKET.get())
                .add(StorageBuckets.FIRE_CORAL_BUCKET.get())
                .add(StorageBuckets.HORN_CORAL_BUCKET.get())
                .add(StorageBuckets.TUBE_CORAL_BUCKET.get());

        tag(IntecrateTags.Blocks.IS_CRATE)
                .add(StorageCrates.CRATE.get())
                .add(StorageCrates.APPLE_CRATE.get())
                .add(StorageCrates.CARROT_CRATE.get())
                .add(StorageCrates.BEETROOT_CRATE.get())
                .add(StorageCrates.POTATO_CRATE.get())
                .add(StorageCrates.POISONOUS_POTATO_CRATE.get())
                .add(StorageCrates.RED_MUSHROOM_CRATE.get())
                .add(StorageCrates.BROWN_MUSHROOM_CRATE.get())
    }
}
