package com.fukuda.intecrate.common.block;

import com.fukuda.intecrate.Intecrate;
import com.fukuda.intecrate.common.block.noted.extended.IntecrateSpecialFlammableMultiFaceBlock;
import com.fukuda.intecrate.common.item.IntecrateItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
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

    private static BlockBehaviour.Properties createDefaultProperties(String name) {
        return BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Intecrate.MOD_ID, name)));
    }

    public static final DeferredBlock<Block> CRATE = registerStorageBlock(
            "crate",
            () -> new IntecrateSpecialFlammableMultiFaceBlock(createDefaultProperties("crate")
                    .sound(SoundType.WOOD)
                    .mapColor(MapColor.WOOD)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.5f)
                    .noOcclusion()));
    public static final DeferredBlock<Block> APPLE_CRATE = registerStorageBlock(
            "apple_crate",
            () -> new IntecrateSpecialFlammableMultiFaceBlock(createDefaultProperties("apple_crate")
                    .sound(SoundType.WOOD)
                    .mapColor(MapColor.WOOD)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.5f)));
    public static final DeferredBlock<Block> CARROT_CRATE = registerStorageBlock(
            "carrot_crate",
            () -> new IntecrateSpecialFlammableMultiFaceBlock(createDefaultProperties("carrot_crate")
                    .sound(SoundType.WOOD)
                    .mapColor(MapColor.WOOD)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.5f)));
    public static final DeferredBlock<Block> BEETROOT_CRATE = registerStorageBlock(
            "beetroot_crate",
            () -> new IntecrateSpecialFlammableMultiFaceBlock(createDefaultProperties("beetroot_crate")
                    .sound(SoundType.WOOD)
                    .mapColor(MapColor.WOOD)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.5f)
                    .ignitedByLava()));
    public static final DeferredBlock<Block> POTATO_CRATE = registerStorageBlock(
            "potato_crate",
            () -> new IntecrateSpecialFlammableMultiFaceBlock(createDefaultProperties("potato_crate")
                    .sound(SoundType.WOOD)
                    .mapColor(MapColor.WOOD)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.5f)
                    .ignitedByLava()));
    public static final DeferredBlock<Block> POISONOUS_POTATO_CRATE = registerStorageBlock(
            "poisonous_potato_crate",
            () -> new IntecrateSpecialFlammableMultiFaceBlock(createDefaultProperties("poisonous_potato_crate")
                    .sound(SoundType.WOOD)
                    .mapColor(MapColor.WOOD)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.5f)
                    .ignitedByLava()));
    public static final DeferredBlock<Block> RED_MUSHROOM_CRATE = registerStorageBlock(
            "red_mushroom_crate",
            () -> new IntecrateSpecialFlammableMultiFaceBlock(createDefaultProperties("red_mushroom_crate")
                    .sound(SoundType.WOOD)
                    .mapColor(MapColor.WOOD)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.5f)
                    .ignitedByLava()));
    public static final DeferredBlock<Block> BROWN_MUSHROOM_CRATE = registerStorageBlock(
            "brown_mushroom_crate",
            () -> new IntecrateSpecialFlammableMultiFaceBlock(createDefaultProperties("brown_mushroom_crate")
                    .sound(SoundType.WOOD)
                    .mapColor(MapColor.WOOD)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.5f)
                    .ignitedByLava()));


    private static <T extends Block> DeferredBlock<T> registerStorageBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = DECOCRATE.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        IntecrateItems.ITEM.register(name, id -> new BlockItem(block.get(), new Item.Properties().setId(ResourceKey.create(Registries.ITEM, id))));
    }

    public static void register(IEventBus eventBus) {
        DECOCRATE.register(eventBus);
    }
}