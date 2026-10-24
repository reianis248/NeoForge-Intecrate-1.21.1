package com.fukuda.intecrate.common.block;

import com.fukuda.intecrate.Intecrate;
import com.fukuda.intecrate.common.block.noted.extended.IntecrateSpecialFlammableMultiFaceBlock;
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

public class DecoBarrels {
    public static final DeferredRegister.Blocks DECOBARREL = DeferredRegister.createBlocks(Intecrate.MOD_ID);

    public static final DeferredBlock<Block> FISH_BARREL = registerStorageBlock(
            "fish_barrel",
            () -> new IntecrateSpecialFlammableMultiFaceBlock(BlockBehaviour.Properties.of()
                    .sound(SoundType.WOOD)
                    .strength(2.5f)
                    .instrument(NoteBlockInstrument.BASS)
                    .mapColor(MapColor.WOOD)
                    .noOcclusion()
            ));
    public static final DeferredBlock<Block> COD_BARREL = registerStorageBlock(
            "cod_barrel",
            () -> new IntecrateSpecialFlammableMultiFaceBlock(BlockBehaviour.Properties.of()
                    .sound(SoundType.WOOD)
                    .strength(2.5f)
                    .instrument(NoteBlockInstrument.BASS)
                    .mapColor(MapColor.WOOD)
            ));
    public static final DeferredBlock<Block> PUFFERFISH_BARREL = registerStorageBlock(
            "pufferfish_barrel",
            () -> new IntecrateSpecialFlammableMultiFaceBlock(BlockBehaviour.Properties.of()
                    .sound(SoundType.WOOD)
                    .strength(2.5f)
                    .instrument(NoteBlockInstrument.BASS)
                    .mapColor(MapColor.WOOD)
            ));
    public static final DeferredBlock<Block> SALMON_BARREL = registerStorageBlock(
            "salmon_barrel",
            () -> new IntecrateSpecialFlammableMultiFaceBlock(BlockBehaviour.Properties.of()
                    .sound(SoundType.WOOD)
                    .strength(2.5f)
                    .instrument(NoteBlockInstrument.BASS)
                    .mapColor(MapColor.WOOD)
            ));
    public static final DeferredBlock<Block> TROPICAL_FISH_BARREL = registerStorageBlock(
            "tropical_fish_barrel",
            () -> new IntecrateSpecialFlammableMultiFaceBlock(BlockBehaviour.Properties.of()
                    .sound(SoundType.WOOD)
                    .strength(2.5f)
                    .instrument(NoteBlockInstrument.BASS)
                    .mapColor(MapColor.WOOD)
            ));


    private static <T extends Block> DeferredBlock<T> registerStorageBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = DECOBARREL.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        IntecrateItems.ITEM.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        DECOBARREL.register(eventBus);
    }
}
