package com.fukuda.intecrate.common.block;

import com.fukuda.intecrate.Intecrate;
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

public class Crates {
    public static final DeferredRegister.Blocks CRATES = DeferredRegister.createBlocks(Intecrate.MOD_ID);

    public static final DeferredBlock<Block> APPLE_CRATE = registerBlock("apple_crate",
            () -> new INTFlammableRotatedPillarBlock(BlockBehaviour.Properties.of()
                    .sound(SoundType.WOOD)
                    .mapColor(MapColor.WOOD)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.5F)
            ));
    public static final DeferredBlock<Block> CARROT_CRATE = registerBlock("carrot_crate",
            () -> new INTFlammableRotatedPillarBlock(BlockBehaviour.Properties.of()
                    .sound(SoundType.WOOD)
                    .mapColor(MapColor.WOOD)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.5F)
            ));
    public static final DeferredBlock<Block> BEETROOT_CRATE = registerBlock("beetroot_crate",
            () -> new INTFlammableRotatedPillarBlock(BlockBehaviour.Properties.of()
                    .sound(SoundType.WOOD)
                    .mapColor(MapColor.WOOD)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.5F)
                    .ignitedByLava()
            ));


    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = CRATES.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        IntecrateItems.ITEM.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        CRATES.register(eventBus);
    }
}
