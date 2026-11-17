package com.fukuda.intecrate.common.block.registry;

import com.fukuda.intecrate.Intecrate;
import com.fukuda.intecrate.common.block.noted.blockstate.extended.IntecrateSpecialFlammableMultiFaceBlock;
import com.fukuda.intecrate.common.item.registry.IntecrateItems;
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

import static com.fukuda.intecrate.common.block.properties.DecoBlockProperties.bagBlockProperties;

public class DecoBags {
    public static final DeferredRegister.Blocks DECOBAG = DeferredRegister.createBlocks(Intecrate.MOD_ID);

    public static final DeferredBlock<Block> SEED_BAG = registerDecoBlock(
            "seed_bag",
            () -> new IntecrateSpecialFlammableMultiFaceBlock(bagBlockProperties(MapColor.COLOR_BROWN)));
    public static final DeferredBlock<Block> WHEAT_SEED_BAG = registerDecoBlock(
            "wheat_seed_bag",
            () -> new IntecrateSpecialFlammableMultiFaceBlock(bagBlockProperties(MapColor.COLOR_BROWN)));
    public static final DeferredBlock<Block> PUMPKIN_SEED_BAG = registerDecoBlock(
            "pumpkin_seed_bag",
            () -> new IntecrateSpecialFlammableMultiFaceBlock(bagBlockProperties(MapColor.COLOR_BROWN)));
    public static final DeferredBlock<Block> MELON_SEED_BAG = registerDecoBlock(
            "melon_seed_bag",
            () -> new IntecrateSpecialFlammableMultiFaceBlock(bagBlockProperties(MapColor.COLOR_BROWN)));
    public static final DeferredBlock<Block> BEETROOT_SEED_BAG = registerDecoBlock(
            "beetroot_seed_bag",
            () -> new IntecrateSpecialFlammableMultiFaceBlock(bagBlockProperties(MapColor.COLOR_BROWN)));


    private static <T extends Block> DeferredBlock<T> registerDecoBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = DECOBAG.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        IntecrateItems.ITEM.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        DECOBAG.register(eventBus);
    }
}