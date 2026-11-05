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

public class DecoCrates {
    public static final DeferredRegister.Blocks DECOCRATE = DeferredRegister.createBlocks(Intecrate.MOD_ID);

    public static final DeferredBlock<Block> CRATE = registerDecoBlock(
            "crate",
            () -> new IntecrateSpecialFlammableMultiFaceBlock(crateBlockProperties(MapColor.WOOD)));
    public static final DeferredBlock<Block> APPLE_CRATE = registerDecoBlock(
            "apple_crate",
            () -> new IntecrateSpecialFlammableMultiFaceBlock(crateBlockProperties(MapColor.WOOD)));
    public static final DeferredBlock<Block> CARROT_CRATE = registerDecoBlock(
            "carrot_crate",
            () -> new IntecrateSpecialFlammableMultiFaceBlock(crateBlockProperties(MapColor.WOOD)));
    public static final DeferredBlock<Block> BEETROOT_CRATE = registerDecoBlock(
            "beetroot_crate",
            () -> new IntecrateSpecialFlammableMultiFaceBlock(crateBlockProperties(MapColor.WOOD)));
    public static final DeferredBlock<Block> POTATO_CRATE = registerDecoBlock(
            "potato_crate",
            () -> new IntecrateSpecialFlammableMultiFaceBlock(crateBlockProperties(MapColor.WOOD)));
    public static final DeferredBlock<Block> POISONOUS_POTATO_CRATE = registerDecoBlock(
            "poisonous_potato_crate",
            () -> new IntecrateSpecialFlammableMultiFaceBlock(crateBlockProperties(MapColor.WOOD)));
    public static final DeferredBlock<Block> RED_MUSHROOM_CRATE = registerDecoBlock(
            "red_mushroom_crate",
            () -> new IntecrateSpecialFlammableMultiFaceBlock(crateBlockProperties(MapColor.WOOD)));
    public static final DeferredBlock<Block> BROWN_MUSHROOM_CRATE = registerDecoBlock(
            "brown_mushroom_crate",
            () -> new IntecrateSpecialFlammableMultiFaceBlock(crateBlockProperties(MapColor.WOOD)));


    private static BlockBehaviour.Properties crateBlockProperties(MapColor mapColor) {
        return BlockBehaviour.Properties.of()
                .strength(2.5f)
                .sound(SoundType.WOOD)
                .instrument(NoteBlockInstrument.BASS)
                .ignitedByLava()
                .mapColor(mapColor);
    }

    private static <T extends Block> DeferredBlock<T> registerDecoBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = DECOCRATE.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        IntecrateItems.ITEM.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        DECOCRATE.register(eventBus);
    }
}