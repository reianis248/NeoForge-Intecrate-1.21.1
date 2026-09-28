package com.fukuda.intecrate.common.block;

import com.fukuda.intecrate.Intecrate;
import com.fukuda.intecrate.common.block.noted.INTFacingBlock;
import com.fukuda.intecrate.common.block.noted.INTFlammableRotatableFacingBlock;
import com.fukuda.intecrate.common.block.noted.INTRotatableFacingBlock;
import com.fukuda.intecrate.common.item.IntecrateItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class StorageBuckets {
    public static final DeferredRegister.Blocks STOREBUCKET = DeferredRegister.createBlocks(Intecrate.MOD_ID);

    public static final DeferredBlock<Block> BRAIN_CORAL_BUCKET = registerStorageBlock(
            "brain_coral_bucket",
            () -> new INTFacingBlock(BlockBehaviour.Properties.of()
                    .sound(SoundType.METAL)
                    .mapColor(MapColor.METAL)
                    .strength(3.48f, 1.48f
                    )));


    private static <T extends Block> DeferredBlock<T> registerStorageBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = STOREBUCKET.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        IntecrateItems.ITEM.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        STOREBUCKET.register(eventBus);
    }
}
