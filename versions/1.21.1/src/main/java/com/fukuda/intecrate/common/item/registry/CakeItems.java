package com.fukuda.intecrate.common.item.registry;

import com.fukuda.intecrate.Intecrate;
import com.fukuda.intecrate.common.block.registry.food.DecoCakeBlocks;
import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class CakeItems {
    public static final DeferredRegister.Items CAKEITEM = DeferredRegister.createItems(Intecrate.MOD_ID);

    public static final DeferredItem<Item> PLAIN_CAKE = CAKEITEM.register("plain_cake",
                () -> new BlockItem(DecoCakeBlocks.PLAIN_CAKE.get(),
                        (new Item.Properties()).stacksTo(1)));

    public static final DeferredItem<Item> SWEET_BERRY_CAKE = CAKEITEM.register("sweet_berry_cake",
            () -> new BlockItem(DecoCakeBlocks.SWEET_BERRY_CAKE.get(),
                    (new Item.Properties()).stacksTo(1)));

    public static final DeferredItem<Item> GLOW_BERRY_CAKE = CAKEITEM.register("glow_berry_cake",
            () -> new BlockItem(DecoCakeBlocks.GLOW_BERRY_CAKE.get(),
                    (new Item.Properties()).stacksTo(1)));

    public static final DeferredItem<Item> CHORUS_FRUIT_CAKE = CAKEITEM.register("chorus_fruit_cake",
            () -> new BlockItem(DecoCakeBlocks.CHORUS_FRUIT_CAKE.get(),
                    (new Item.Properties()).stacksTo(1)));

    public static final DeferredItem<Item> CARROT_CAKE = CAKEITEM.register("carrot_cake",
            () -> new BlockItem(DecoCakeBlocks.CARROT_CAKE.get(),
                    (new Item.Properties()).stacksTo(1)));

    public static final DeferredItem<Item> HONEY_CAKE = CAKEITEM.register("honey_cake",
            () -> new BlockItem(DecoCakeBlocks.HONEY_CAKE.get(),
                    (new Item.Properties()).stacksTo(1)));


    public static void register(IEventBus eventBus) {
        CAKEITEM.register(eventBus);
    }
}
