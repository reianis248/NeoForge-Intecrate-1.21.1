package com.fukuda.intecrate.common.block.registry;

import com.fukuda.intecrate.Intecrate;
import com.fukuda.intecrate.common.block.noted.blockstate.extended.IntecrateSpecialFlammableMultiFaceBlock;
import com.fukuda.intecrate.common.item.registry.IntecrateItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

import static com.fukuda.intecrate.common.block.properties.DecoBlockProperties.basketBlockProperties;

public class DecoBaskets {
    public static final DeferredRegister.Blocks DECOBASKET = DeferredRegister.createBlocks(Intecrate.MOD_ID);

    public static final DeferredBlock<Block> BASKET = registerDecoBlock(
            "basket",
            () -> new IntecrateSpecialFlammableMultiFaceBlock(basketBlockProperties(MapColor.WOOD)));
    public static final DeferredBlock<Block> ALLIUM_BASKET = registerDecoBlock(
            "allium_basket",
            () -> new IntecrateSpecialFlammableMultiFaceBlock(basketBlockProperties(MapColor.WOOD)));
    public static final DeferredBlock<Block> CORNFLOWER_BASKET = registerDecoBlock(
            "cornflower_basket",
            () -> new IntecrateSpecialFlammableMultiFaceBlock(basketBlockProperties(MapColor.WOOD)));
    public static final DeferredBlock<Block> DANDELION_BASKET = registerDecoBlock(
            "dandelion_basket",
            () -> new IntecrateSpecialFlammableMultiFaceBlock(basketBlockProperties(MapColor.WOOD)));
    public static final DeferredBlock<Block> POPPY_BASKET = registerDecoBlock(
            "poppy_basket",
            () -> new IntecrateSpecialFlammableMultiFaceBlock(basketBlockProperties(MapColor.WOOD)));
    public static final DeferredBlock<Block> SWEET_BERRY_BASKET = registerDecoBlock(
            "sweet_berry_basket",
            () -> new IntecrateSpecialFlammableMultiFaceBlock(basketBlockProperties(MapColor.WOOD)));
    public static final DeferredBlock<Block> OXEYE_DAISY_BASKET = registerDecoBlock(
            "oxeye_daisy_basket",
            () -> new IntecrateSpecialFlammableMultiFaceBlock(basketBlockProperties(MapColor.WOOD)));
    public static final DeferredBlock<Block> AZURE_BLUET_BASKET = registerDecoBlock(
            "azure_bluet_basket",
            () -> new IntecrateSpecialFlammableMultiFaceBlock(basketBlockProperties(MapColor.WOOD)));


    private static <T extends Block> DeferredBlock<T> registerDecoBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = DECOBASKET.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        IntecrateItems.ITEM.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        DECOBASKET.register(eventBus);
    }
}