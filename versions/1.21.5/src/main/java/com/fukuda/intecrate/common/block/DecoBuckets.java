package com.fukuda.intecrate.common.block;

import com.fukuda.intecrate.Intecrate;
import com.fukuda.intecrate.common.block.noted.INTFacingBlock;
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

public class DecoBuckets {
    public static final DeferredRegister.Blocks DECOBUCKET = DeferredRegister.createBlocks(Intecrate.MOD_ID);

    private static BlockBehaviour.Properties createDefaultProperties(String name) {
        return BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Intecrate.MOD_ID, name)));
    }

    public static final DeferredBlock<Block> STORAGE_BUCKET = registerStorageBlock(
            "storage_bucket",
            () -> new INTFacingBlock(createDefaultProperties("storage_bucket")
                    .sound(SoundType.METAL)
                    .mapColor(MapColor.METAL)
                    .strength(3.48f, 1.48f)));
    public static final DeferredBlock<Block> BRAIN_CORAL_BUCKET = registerStorageBlock(
            "brain_coral_bucket",
            () -> new INTFacingBlock(createDefaultProperties("brain_coral_bucket")
                    .sound(SoundType.METAL)
                    .mapColor(MapColor.METAL)
                    .strength(3.48f, 1.48f)));
    public static final DeferredBlock<Block> BUBBLE_CORAL_BUCKET = registerStorageBlock(
            "bubble_coral_bucket",
            () -> new INTFacingBlock(createDefaultProperties("bubble_coral_bucket")
                    .sound(SoundType.METAL)
                    .mapColor(MapColor.METAL)
                    .strength(3.48f, 1.48f)));
    public static final DeferredBlock<Block> FIRE_CORAL_BUCKET = registerStorageBlock(
            "fire_coral_bucket",
            () -> new INTFacingBlock(createDefaultProperties("fire_coral_bucket")
                    .sound(SoundType.METAL)
                    .mapColor(MapColor.METAL)
                    .strength(3.48f, 1.48f)));
    public static final DeferredBlock<Block> HORN_CORAL_BUCKET = registerStorageBlock(
            "horn_coral_bucket",
            () -> new INTFacingBlock(createDefaultProperties("horn_coral_bucket")
                    .sound(SoundType.METAL)
                    .mapColor(MapColor.METAL)
                    .strength(3.48f, 1.48f)));
    public static final DeferredBlock<Block> TUBE_CORAL_BUCKET = registerStorageBlock(
            "tube_coral_bucket",
            () -> new INTFacingBlock(createDefaultProperties("tube_coral_bucket")
                    .sound(SoundType.METAL)
                    .mapColor(MapColor.METAL)
                    .strength(3.48f, 1.48f)));


    private static <T extends Block> DeferredBlock<T> registerStorageBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = DECOBUCKET.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        IntecrateItems.ITEM.register(name, id -> new BlockItem(block.get(), new Item.Properties().setId(ResourceKey.create(Registries.ITEM, id))));
    }

    public static void register(IEventBus eventBus) {
        DECOBUCKET.register(eventBus);
    }
}
