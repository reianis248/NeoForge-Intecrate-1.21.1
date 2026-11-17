package com.fukuda.intecrate.common.block.registry.food;

import com.fukuda.intecrate.Intecrate;
import com.fukuda.intecrate.common.block.noted.food.FourSliceCakeBlock;
import com.fukuda.intecrate.common.item.registry.SlicedCake;
import net.minecraft.world.level.block.Block;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

import static com.fukuda.intecrate.common.block.properties.DecoBlockProperties.cakeBlockProperties;
import static com.fukuda.intecrate.common.block.properties.DecoBlockProperties.glowCakeBlockProperties;

public class DecoCakeBlocks {
    public static final DeferredRegister.Blocks CAKEBLOCK = DeferredRegister.createBlocks(Intecrate.MOD_ID);

    public static final DeferredBlock<FourSliceCakeBlock> PLAIN_CAKE = registerCakeBlock(
            "plain_cake",
            () -> new FourSliceCakeBlock(cakeBlockProperties(), SlicedCake.SLICED_PLAIN_CAKE));
    public static final DeferredBlock<FourSliceCakeBlock> SWEET_BERRY_CAKE = registerCakeBlock(
            "sweet_berry_cake",
            () -> new FourSliceCakeBlock(cakeBlockProperties(), SlicedCake.SLICED_SWEET_BERRY_CAKE));
    public static final DeferredBlock<FourSliceCakeBlock> GLOW_BERRY_CAKE = registerCakeBlock(
            "glow_berry_cake",
            () -> new FourSliceCakeBlock(glowCakeBlockProperties(), SlicedCake.SLICED_GLOW_BERRY_CAKE));
    public static final DeferredBlock<FourSliceCakeBlock> CHORUS_FRUIT_CAKE = registerCakeBlock(
            "chorus_fruit_cake",
            () -> new FourSliceCakeBlock(cakeBlockProperties(), SlicedCake.SLICED_CHORUS_FRUIT_CAKE));
    public static final DeferredBlock<FourSliceCakeBlock> CARROT_CAKE = registerCakeBlock(
            "carrot_cake",
            () -> new FourSliceCakeBlock(cakeBlockProperties(), SlicedCake.SLICED_CARROT_CAKE));
    public static final DeferredBlock<FourSliceCakeBlock> HONEY_CAKE = registerCakeBlock(
            "honey_cake",
            () -> new FourSliceCakeBlock(cakeBlockProperties(), SlicedCake.SLICED_HONEY_CAKE));


    private static <T extends Block> DeferredBlock<T> registerCakeBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = CAKEBLOCK.register(name, block);
        return toReturn;
    }

    public static void register(IEventBus eventBus) {
        CAKEBLOCK.register(eventBus);
    }
}