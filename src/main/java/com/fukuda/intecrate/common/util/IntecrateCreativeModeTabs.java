package com.fukuda.intecrate.common.util;

import com.fukuda.intecrate.Intecrate;
import com.fukuda.intecrate.common.block.StorageBaskets;
import com.fukuda.intecrate.common.block.StorageBuckets;
import com.fukuda.intecrate.common.block.StorageCrates;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.List;
import java.util.function.Supplier;

public class IntecrateCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Intecrate.MOD_ID);


    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> INTECRATE =
            CREATIVE_MODE_TABS.register("intecrate", () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.intecrate"))
                    .icon(() -> new ItemStack(StorageCrates.APPLE_CRATE.get()))
                    .displayItems((parameters, output) -> {
                        output.accept(StorageCrates.APPLE_CRATE.get());
                        output.accept(StorageCrates.CARROT_CRATE.get());
                        output.accept(StorageCrates.BEETROOT_CRATE.get());
                        output.accept(StorageCrates.POTATO_CRATE.get());
                        output.accept(StorageCrates.POISONOUS_POTATO_CRATE.get());
                        output.accept(StorageCrates.RED_MUSHROOM_CRATE.get());
                        output.accept(StorageCrates.BROWN_MUSHROOM_CRATE.get());

                        output.accept(StorageBaskets.ALLIUM_BASKET.get());
                        output.accept(StorageBaskets.CORNFLOWER_BASKET.get());
                        output.accept(StorageBaskets.DANDELION_BASKET.get());
                        output.accept(StorageBaskets.POPPY_BASKET.get());
                        output.accept(StorageBaskets.SWEET_BERRY_BASKET.get());

                        output.accept(StorageBuckets.BRAIN_CORAL_BUCKET.get());
                        output.accept(StorageBuckets.BUBBLE_CORAL_BUCKET.get());
                        output.accept(StorageBuckets.FIRE_CORAL_BUCKET.get());
                        output.accept(StorageBuckets.HORN_CORAL_BUCKET.get());
                        output.accept(StorageBuckets.TUBE_CORAL_BUCKET.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
