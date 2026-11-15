package com.fukuda.intecrate.common.item.registry;

import com.fukuda.intecrate.Intecrate;
import com.fukuda.intecrate.common.item.food.CakeFoodProperties;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class SlicedCake {
    public static final DeferredRegister.Items SLICEDCAKE = DeferredRegister.createItems(Intecrate.MOD_ID);

    public static final DeferredItem<Item> SLICED_PLAIN_CAKE = SLICEDCAKE.register("sliced_plain_cake",
            () -> new Item(slicedCake(CakeFoodProperties.SLICED_CAKE)));
    public static final DeferredItem<Item> SLICED_SWEET_BERRY_CAKE = SLICEDCAKE.register("sliced_sweet_berry_cake",
            () -> new Item(slicedCake(CakeFoodProperties.SLICED_CAKE)));
    public static final DeferredItem<Item> SLICED_GLOW_BERRY_CAKE = SLICEDCAKE.register("sliced_glow_berry_cake",
            () -> new Item(slicedCake(CakeFoodProperties.SLICED_CAKE)));
    public static final DeferredItem<Item> SLICED_CHORUS_FRUIT_CAKE = SLICEDCAKE.register("sliced_chorus_fruit_cake",
            () -> new Item(slicedCake(CakeFoodProperties.SLICED_CAKE)));
    public static final DeferredItem<Item> SLICED_CARROT_CAKE = SLICEDCAKE.register("sliced_carrot_cake",
            () -> new Item(slicedCake(CakeFoodProperties.SLICED_CAKE)));
    public static final DeferredItem<Item> SLICED_HONEY_CAKE = SLICEDCAKE.register("sliced_honey_cake",
            () -> new Item(slicedCake(CakeFoodProperties.SLICED_CAKE)));


    private static Item.Properties slicedCake(FoodProperties foodProperties) {
        return new Item.Properties()
                .food(foodProperties);
    }

    public static void register(IEventBus eventBus) {
        SLICEDCAKE.register(eventBus);
    }
}
