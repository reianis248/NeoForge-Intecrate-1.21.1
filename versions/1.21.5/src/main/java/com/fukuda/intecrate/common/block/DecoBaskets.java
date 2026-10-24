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

public class DecoBaskets {
    public static final DeferredRegister.Blocks DECOBASKET = DeferredRegister.createBlocks(Intecrate.MOD_ID);

    private static BlockBehaviour.Properties createDefaultProperties(String name) {
        return BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Intecrate.MOD_ID, name)));
    }

    public static final DeferredBlock<Block> BASKET = registerStorageBlock(
            "basket",
            () -> new IntecrateSpecialFlammableMultiFaceBlock(createDefaultProperties("basket")
                    .sound(SoundType.SCAFFOLDING)
                    .mapColor(MapColor.WOOD)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(1.98f)
                    .ignitedByLava()
            ));
    public static final DeferredBlock<Block> ALLIUM_BASKET = registerStorageBlock(
            "allium_basket",
            () -> new IntecrateSpecialFlammableMultiFaceBlock(createDefaultProperties("allium_basket")
                    .sound(SoundType.SCAFFOLDING)
                    .mapColor(MapColor.WOOD)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(1.98f)
                    .ignitedByLava()
            ));
    public static final DeferredBlock<Block> CORNFLOWER_BASKET = registerStorageBlock(
            "cornflower_basket",
            () -> new IntecrateSpecialFlammableMultiFaceBlock(createDefaultProperties("cornflower_basket")
                    .sound(SoundType.SCAFFOLDING)
                    .mapColor(MapColor.WOOD)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(1.98f)
                    .ignitedByLava()
            ));
    public static final DeferredBlock<Block> DANDELION_BASKET = registerStorageBlock(
            "dandelion_basket",
            () -> new IntecrateSpecialFlammableMultiFaceBlock(createDefaultProperties("dandelion_basket")
                    .sound(SoundType.SCAFFOLDING)
                    .mapColor(MapColor.WOOD)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(1.98f)
                    .ignitedByLava()
            ));
    public static final DeferredBlock<Block> POPPY_BASKET = registerStorageBlock(
            "poppy_basket",
            () -> new IntecrateSpecialFlammableMultiFaceBlock(createDefaultProperties("poppy_basket")
                    .sound(SoundType.SCAFFOLDING)
                    .mapColor(MapColor.WOOD)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(1.98f)
                    .ignitedByLava()
            ));
    public static final DeferredBlock<Block> SWEET_BERRY_BASKET = registerStorageBlock(
            "sweet_berry_basket",
            () -> new IntecrateSpecialFlammableMultiFaceBlock(createDefaultProperties("sweet_berry_basket")
                    .sound(SoundType.SCAFFOLDING)
                    .mapColor(MapColor.WOOD)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(1.98f)
                    .ignitedByLava()
            ));
    public static final DeferredBlock<Block> OXEYE_DAISY_BASKET = registerStorageBlock(
            "oxeye_daisy_basket",
            () -> new IntecrateSpecialFlammableMultiFaceBlock(createDefaultProperties("oxeye_daisy_basket")
                    .sound(SoundType.SCAFFOLDING)
                    .mapColor(MapColor.WOOD)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(1.98f)
                    .ignitedByLava()
            ));
    public static final DeferredBlock<Block> AZURE_BLUET_BASKET = registerStorageBlock(
            "azure_bluet_basket",
            () -> new IntecrateSpecialFlammableMultiFaceBlock(createDefaultProperties("azure_bluet_basket")
                    .sound(SoundType.SCAFFOLDING)
                    .mapColor(MapColor.WOOD)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(1.98f)
                    .ignitedByLava()
            ));


    private static <T extends Block> DeferredBlock<T> registerStorageBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = DECOBASKET.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        IntecrateItems.ITEM.register(name, id -> new BlockItem(block.get(), new Item.Properties().setId(ResourceKey.create(Registries.ITEM, id))));
    }

    public static void register(IEventBus eventBus) {
        DECOBASKET.register(eventBus);
    }
}
