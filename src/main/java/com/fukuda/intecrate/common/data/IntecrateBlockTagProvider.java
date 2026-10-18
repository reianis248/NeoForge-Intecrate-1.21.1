package com.fukuda.intecrate.common.data;

import com.fukuda.intecrate.Intecrate;
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
                .add(StorageCrates.BROWN_MUSHROOM_CRATE.get());
    }
}
