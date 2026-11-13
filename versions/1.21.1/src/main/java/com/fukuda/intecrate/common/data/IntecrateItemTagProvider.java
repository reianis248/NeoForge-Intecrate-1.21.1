package com.fukuda.intecrate.common.data;

import com.fukuda.intecrate.Intecrate;
import com.fukuda.intecrate.common.item.registry.SlicedCake;
import com.fukuda.intecrate.common.util.IntecrateTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class IntecrateItemTagProvider extends ItemTagsProvider {
    public IntecrateItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, CompletableFuture<TagLookup<Block>> blockTags,  @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, Intecrate.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(IntecrateTags.Items.SLICED_CAKE)
                .add(SlicedCake.SLICED_PLAIN_CAKE.get())
                .add(SlicedCake.SLICED_SWEET_BERRY_CAKE.get())
                .add(SlicedCake.SLICED_GLOW_BERRY_CAKE.get())
                .add(SlicedCake.SLICED_CHORUS_FRUIT_CAKE.get())
                .add(SlicedCake.SLICED_CARROT_CAKE.get())
                .add(SlicedCake.SLICED_HONEY_CAKE.get());

        copy(IntecrateTags.Blocks.WOODEN_SLABS, IntecrateTags.Items.WOODEN_SLABS);
    }
}
