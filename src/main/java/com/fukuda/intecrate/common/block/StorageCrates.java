package com.fukuda.intecrate.common.block;

import com.fukuda.intecrate.Intecrate;
import com.fukuda.intecrate.common.block.noted.INTFlammableRotatableFacingBlock;
import com.fukuda.intecrate.common.block.noted.INTFlammableRotatedPillarBlock;
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

public class StorageCrates {
    public static final DeferredRegister.Blocks STORECRATE = DeferredRegister.createBlocks(Intecrate.MOD_ID);

    public static final DeferredBlock<Block> APPLE_CRATE = registerStorageBlock(
            "apple_crate",
            () -> new INTFlammableRotatedPillarBlock(BlockBehaviour.Properties.of()
                    .sound(SoundType.WOOD)
                    .mapColor(MapColor.WOOD)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.5f)
            ));
    public static final DeferredBlock<Block> CARROT_CRATE = registerStorageBlock(
            "carrot_crate",
            () -> new INTFlammableRotatedPillarBlock(BlockBehaviour.Properties.of()
                    .sound(SoundType.WOOD)
                    .mapColor(MapColor.WOOD)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.5f)
            ));
    public static final DeferredBlock<Block> BEETROOT_CRATE = registerStorageBlock(
            "beetroot_crate",
            () -> new INTFlammableRotatedPillarBlock(BlockBehaviour.Properties.of()
                    .sound(SoundType.WOOD)
                    .mapColor(MapColor.WOOD)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.5f)
                    .ignitedByLava()
            ));
    public static final DeferredBlock<Block> POTATO_CRATE = registerStorageBlock(
            "potato_crate",
            () -> new INTFlammableRotatedPillarBlock(BlockBehaviour.Properties.of()
                    .sound(SoundType.WOOD)
                    .mapColor(MapColor.WOOD)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.5f)
                    .ignitedByLava()
            ));
    public static final DeferredBlock<Block> POISONOUS_POTATO_CRATE = registerStorageBlock(
            "poisonous_potato_crate",
            () -> new INTFlammableRotatedPillarBlock(BlockBehaviour.Properties.of()
                    .sound(SoundType.WOOD)
                    .mapColor(MapColor.WOOD)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.5f)
                    .ignitedByLava()
            ));
    public static final DeferredBlock<Block> RED_MUSHROOM_CRATE = registerStorageBlock(
            "red_mushroom_crate",
            () -> new INTFlammableRotatedPillarBlock(BlockBehaviour.Properties.of()
                    .sound(SoundType.WOOD)
                    .mapColor(MapColor.WOOD)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.5f)
                    .ignitedByLava()
            ));
    public static final DeferredBlock<Block> BROWN_MUSHROOM_CRATE = registerStorageBlock(
            "brown_mushroom_crate",
            () -> new INTFlammableRotatedPillarBlock(BlockBehaviour.Properties.of()
                    .sound(SoundType.WOOD)
                    .mapColor(MapColor.WOOD)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.5f)
                    .ignitedByLava()
            ));


    private static <T extends Block> DeferredBlock<T> registerStorageBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = STORECRATE.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        IntecrateItems.ITEM.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        STORECRATE.register(eventBus);
    }
}
