package com.fukuda.intecrate.common.block.food;

import com.fukuda.intecrate.Intecrate;
import com.fukuda.intecrate.common.item.food.CakeItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CakeBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.PushReaction;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class CakeBlocks {
    public static final DeferredRegister.Blocks CAKEBLOCK = DeferredRegister.createBlocks(Intecrate.MOD_ID);

    public static final DeferredBlock<CakeBlock> PLAIN_CAKE = registerCakeBlock(
            "plain_cake",
            () -> new CakeBlock(cakeBlockProperties()));
    public static final DeferredBlock<CakeBlock> SWEET_BERRY_CAKE = registerCakeBlock(
            "sweet_berry_cake",
            () -> new CakeBlock(cakeBlockProperties()));
    public static final DeferredBlock<CakeBlock> GLOW_BERRY_CAKE = registerCakeBlock(
            "glow_berry_cake",
            () -> new CakeBlock(cakeBlockProperties()));
    public static final DeferredBlock<CakeBlock> CHORUS_FRUIT_CAKE = registerCakeBlock(
            "chorus_fruit_cake",
            () -> new CakeBlock(cakeBlockProperties()));


    private static BlockBehaviour.Properties cakeBlockProperties() {
        return BlockBehaviour.Properties.of()
                .forceSolidOn()
                .strength(0.5f)
                .sound(SoundType.WOOL)
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