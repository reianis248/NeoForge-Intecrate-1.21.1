package com.fukuda.intecrate.common.data;

import com.fukuda.intecrate.Intecrate;
import com.fukuda.intecrate.common.block.DecoCrates;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.core.Holder;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import java.util.stream.Stream;

public class IntecrateModelProvider extends ModelProvider {
    public IntecrateModelProvider(PackOutput output) {
        super(output, Intecrate.MOD_ID);
    }

    @Override
    protected void registerModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {
        // Register your custom item or block models here using itemModels or blockModels
    }

    @Override
    protected Stream<Holder<Block>> getKnownBlocks() {
        return Stream.of();
    }

    @Override
    protected Stream<Holder<Item>> getKnownItems() {
        return Stream.of(
                DecoCrates.CRATE.asItem().builtInRegistryHolder(),
                DecoCrates.APPLE_CRATE.asItem().builtInRegistryHolder(),
                DecoCrates.CARROT_CRATE.asItem().builtInRegistryHolder(),
                DecoCrates.BEETROOT_CRATE.asItem().builtInRegistryHolder(),
                DecoCrates.POTATO_CRATE.asItem().builtInRegistryHolder(),
                DecoCrates.POISONOUS_POTATO_CRATE.asItem().builtInRegistryHolder(),
                DecoCrates.RED_MUSHROOM_CRATE.asItem().builtInRegistryHolder(),
                DecoCrates.BROWN_MUSHROOM_CRATE.asItem().builtInRegistryHolder()
        );
    }
}
