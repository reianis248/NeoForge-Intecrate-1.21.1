package com.fukuda.intecrate.common.block;

import com.fukuda.intecrate.Intecrate;
import com.fukuda.intecrate.common.block.noted.INTFacingBlock;
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

public class StorageBaskets {
    public static final DeferredRegister.Blocks STOREBASKET = DeferredRegister.createBlocks(Intecrate.MOD_ID);

    public static final DeferredBlock<Block> ALLIUM_BASKET = registerStorageBlock(
            "allium_basket",
            () -> new INTFlammableRotatedPillarBlock(BlockBehaviour.Properties.of()
                    .sound(SoundType.SCAFFOLDING)
                    .mapColor(MapColor.WOOD)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(1.98f)
                    .ignitedByLava()
            ));
    public static final DeferredBlock<Block> CORNFLOWER_BASKET = registerStorageBlock(
            "cornflower_basket",
            () -> new INTFlammableRotatedPillarBlock(BlockBehaviour.Properties.of()
                    .sound(SoundType.SCAFFOLDING)
                    .mapColor(MapColor.WOOD)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(1.98f)
                    .ignitedByLava()
            ));
    public static final DeferredBlock<Block> DANDELION_BASKET = registerStorageBlock(
            "dandelion_basket",
            () -> new INTFlammableRotatedPillarBlock(BlockBehaviour.Properties.of()
                    .sound(SoundType.SCAFFOLDING)
                    .mapColor(MapColor.WOOD)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(1.98f)
                    .ignitedByLava()
            ));
    public static final DeferredBlock<Block> POPPY_BASKET = registerStorageBlock(
            "poppy_basket",
            () -> new INTFlammableRotatedPillarBlock(BlockBehaviour.Properties.of()
                    .sound(SoundType.SCAFFOLDING)
                    .mapColor(MapColor.WOOD)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(1.98f)
                    .ignitedByLava()
            ));
    public static final DeferredBlock<Block> SWEET_BERRY_BASKET = registerStorageBlock(
            "sweet_berry_basket",
            () -> new INTFlammableRotatedPillarBlock(BlockBehaviour.Properties.of()
                    .sound(SoundType.SCAFFOLDING)
                    .mapColor(MapColor.WOOD)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(1.98f)
                    .ignitedByLava()
            ));


    private static <T extends Block> DeferredBlock<T> registerStorageBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = STOREBASKET.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        IntecrateItems.ITEM.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        STOREBASKET.register(eventBus);
    }
}
