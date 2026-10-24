package com.fukuda.intecrate.common.block;

import com.fukuda.intecrate.Intecrate;
import com.fukuda.intecrate.common.block.noted.extended.IntecrateFlammableFacingBlock;
import com.fukuda.intecrate.common.item.IntecrateItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class DecoBags {
    public static final DeferredRegister.Blocks DECOBAG = DeferredRegister.createBlocks(Intecrate.MOD_ID);

    private static BlockBehaviour.Properties createDefaultProperties(String name) {
        return BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Intecrate.MOD_ID, name)));
    }

    public static final DeferredBlock<Block> SEED_BAG = registerStorageBlock(
            "seed_bag",
            () -> new IntecrateFlammableFacingBlock(createDefaultProperties("seed_bag")
                    .strength(0.8f)
                    .sound(SoundType.WOOL)
                    .mapColor(MapColor.COLOR_BROWN)
            ));
    public static final DeferredBlock<Block> WHEAT_SEED_BAG = registerStorageBlock(
            "wheat_seed_bag",
            () -> new IntecrateFlammableFacingBlock(createDefaultProperties("wheat_seed_bag")
                    .strength(0.8f)
                    .sound(SoundType.WOOL)
                    .mapColor(MapColor.COLOR_BROWN)
            ));
    public static final DeferredBlock<Block> PUMPKIN_SEED_BAG = registerStorageBlock(
            "pumpkin_seed_bag",
            () -> new IntecrateFlammableFacingBlock(createDefaultProperties("pumpkin_seed_bag")
                    .strength(0.8f)
                    .sound(SoundType.WOOL)
                    .mapColor(MapColor.COLOR_BROWN)
            ));
    public static final DeferredBlock<Block> MELON_SEED_BAG = registerStorageBlock(
            "melon_seed_bag",
            () -> new IntecrateFlammableFacingBlock(createDefaultProperties("melon_seed_bag")
                    .strength(0.8f)
                    .sound(SoundType.WOOL)
                    .mapColor(MapColor.COLOR_BROWN)
            ));

    public static final DeferredBlock<Block> BEETROOT_SEED_BAG = registerStorageBlock(
            "beetroot_seed_bag",
            () -> new IntecrateFlammableFacingBlock(createDefaultProperties("beetroot_seed_bag")
                    .strength(0.8f)
                    .sound(SoundType.WOOL)
                    .mapColor(MapColor.COLOR_BROWN)
            ));


    private static <T extends Block> DeferredBlock<T> registerStorageBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = DECOBAG.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        IntecrateItems.ITEM.register(name, id -> new BlockItem(block.get(), new Item.Properties().setId(ResourceKey.create(Registries.ITEM, id))));
    }

    public static void register(IEventBus eventBus) {
        DECOBAG.register(eventBus);
    }
}
