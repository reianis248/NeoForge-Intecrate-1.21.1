package com.fukuda.intecrate.common.block;

import com.fukuda.intecrate.Intecrate;
import com.fukuda.intecrate.common.block.noted.INTFacingBlock;
import com.fukuda.intecrate.common.item.IntecrateItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class DecoBuckets {
    public static final DeferredRegister.Blocks DECOBUCKET = DeferredRegister.createBlocks(Intecrate.MOD_ID);

    public static final DeferredBlock<Block> STORAGE_BUCKET = registerDecoBlock(
            "storage_bucket",
            () -> new INTFacingBlock(bucketBlockProperties(MapColor.METAL)));
    public static final DeferredBlock<Block> BRAIN_CORAL_BUCKET = registerDecoBlock(
            "brain_coral_bucket",
            () -> new INTFacingBlock(bucketBlockProperties(MapColor.METAL)));
    public static final DeferredBlock<Block> BUBBLE_CORAL_BUCKET = registerDecoBlock(
            "bubble_coral_bucket",
            () -> new INTFacingBlock(bucketBlockProperties(MapColor.METAL)));
    public static final DeferredBlock<Block> FIRE_CORAL_BUCKET = registerDecoBlock(
            "fire_coral_bucket",
            () -> new INTFacingBlock(bucketBlockProperties(MapColor.METAL)));
    public static final DeferredBlock<Block> HORN_CORAL_BUCKET = registerDecoBlock(
            "horn_coral_bucket",
            () -> new INTFacingBlock(bucketBlockProperties(MapColor.METAL)));
    public static final DeferredBlock<Block> TUBE_CORAL_BUCKET = registerDecoBlock(
            "tube_coral_bucket",
            () -> new INTFacingBlock(bucketBlockProperties(MapColor.METAL)));


    private static BlockBehaviour.Properties bucketBlockProperties(MapColor mapColor) {
        return BlockBehaviour.Properties.of()
                .strength(3.46f, 1.48f)
                .sound(SoundType.METAL)
                .instrument(NoteBlockInstrument.BASS)
                .mapColor(mapColor);
    }

    private static <T extends Block> DeferredBlock<T> registerDecoBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = DECOBUCKET.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        IntecrateItems.ITEM.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        DECOBUCKET.register(eventBus);
    }
}