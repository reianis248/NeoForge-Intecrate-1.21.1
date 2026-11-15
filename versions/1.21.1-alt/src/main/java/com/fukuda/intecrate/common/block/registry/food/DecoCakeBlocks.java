package com.fukuda.intecrate.common.block.registry.food;

import com.fukuda.intecrate.Intecrate;
import com.fukuda.intecrate.common.block.noted.food.FourSliceCakeBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.PushReaction;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class DecoCakeBlocks {
    public static final DeferredRegister.Blocks CAKEBLOCK = DeferredRegister.createBlocks(Intecrate.MOD_ID);

    public static final DeferredBlock<FourSliceCakeBlock> PLAIN_CAKE = registerCakeBlock(
            "plain_cake",
            () -> new FourSliceCakeBlock(cakeBlockProperties()));
    public static final DeferredBlock<FourSliceCakeBlock> SWEET_BERRY_CAKE = registerCakeBlock(
            "sweet_berry_cake",
            () -> new FourSliceCakeBlock(cakeBlockProperties()));
    public static final DeferredBlock<FourSliceCakeBlock> GLOW_BERRY_CAKE = registerCakeBlock(
            "glow_berry_cake",
            () -> new FourSliceCakeBlock(glowCakeBlockProperties()));
    public static final DeferredBlock<FourSliceCakeBlock> CHORUS_FRUIT_CAKE = registerCakeBlock(
            "chorus_fruit_cake",
            () -> new FourSliceCakeBlock(cakeBlockProperties()));
    public static final DeferredBlock<FourSliceCakeBlock> CARROT_CAKE = registerCakeBlock(
            "carrot_cake",
            () -> new FourSliceCakeBlock(cakeBlockProperties()));
    public static final DeferredBlock<FourSliceCakeBlock> HONEY_CAKE = registerCakeBlock(
            "honey_cake",
            () -> new FourSliceCakeBlock(cakeBlockProperties()));


    private static BlockBehaviour.Properties cakeBlockProperties() {
        return BlockBehaviour.Properties.of()
                .forceSolidOn()
                .noOcclusion()
                .strength(0.5f)
                .sound(SoundType.WOOL)
                .pushReaction(PushReaction.DESTROY);
    }
    private static BlockBehaviour.Properties glowCakeBlockProperties() {
        return BlockBehaviour.Properties.of()
                .forceSolidOn()
                .noOcclusion()
                .strength(0.5f)
                .sound(SoundType.WOOL)
                .lightLevel(state -> 11)
                .pushReaction(PushReaction.DESTROY);
    }

    private static <T extends Block> DeferredBlock<T> registerCakeBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = CAKEBLOCK.register(name, block);
        return toReturn;
    }

    public static void register(IEventBus eventBus) {
        CAKEBLOCK.register(eventBus);
    }
}