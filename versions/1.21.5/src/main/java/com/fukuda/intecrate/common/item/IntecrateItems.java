package com.fukuda.intecrate.common.item;

import com.fukuda.intecrate.Intecrate;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class IntecrateItems {
    public static final DeferredRegister.Items ITEM = DeferredRegister.createItems(Intecrate.MOD_ID);


    public static void register(IEventBus eventBus) {
        ITEM.register(eventBus);
    }
}
