package com.fukuda.intecrate.common.block;

import com.fukuda.intecrate.Intecrate;
import com.fukuda.intecrate.common.block.noted.extended.IntecrateFlammableFacingBlock;
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

public class DecoBoxes {
    public static final DeferredRegister.Blocks DECOBOX = DeferredRegister.createBlocks(Intecrate.MOD_ID);

    public static final DeferredBlock<Block> MEAT_BOX  = registerDecoBlock(
            "meat_box",
            () -> new IntecrateFlammableFacingBlock(boxBlockProperties(MapColor.COLOR_BROWN)));
    public static final DeferredBlock<Block> BEEF_BOX = registerDecoBlock(
            "beef_box",
            () -> new IntecrateFlammableFacingBlock(boxBlockProperties(MapColor.WOOD)));
    public static final DeferredBlock<Block> PORKCHOP_BOX = registerDecoBlock(
            "porkchop_box",
            () -> new IntecrateFlammableFacingBlock(boxBlockProperties(MapColor.WOOD)));
    public static final DeferredBlock<Block> MUTTON_BOX = registerDecoBlock(
            "mutton_box",
            () -> new IntecrateFlammableFacingBlock(boxBlockProperties(MapColor.WOOD)));
    public static final DeferredBlock<Block> CHICKEN_BOX = registerDecoBlock(
            "chicken_box",
            () -> new IntecrateFlammableFacingBlock(boxBlockProperties(MapColor.WOOD)));
    public static final DeferredBlock<Block> RABBIT_BOX = registerDecoBlock(
            "rabbit_box",
            () -> new IntecrateFlammableFacingBlock(boxBlockProperties(MapColor.WOOD)));


    private static BlockBehaviour.Properties boxBlockProperties(MapColor mapColor) {
        return BlockBehaviour.Properties.of()
                .strength(2.5f)
                .sound(SoundType.WOOD)
                .instrument(NoteBlockInstrument.BASS)
                .ignitedByLava()
                .mapColor(mapColor);
    }

    private static <T extends Block> DeferredBlock<T> registerDecoBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = DECOBOX.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        IntecrateItems.ITEM.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        DECOBOX.register(eventBus);
    }
}