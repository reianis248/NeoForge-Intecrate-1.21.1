package com.fukuda.intecrate.common.util;

import com.fukuda.intecrate.Intecrate;
import com.fukuda.intecrate.common.block.*;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class IntecrateCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Intecrate.MOD_ID);


    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> INTECRATE =
            CREATIVE_MODE_TABS.register("intecrate", () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.intecrate"))
                    .icon(() -> new ItemStack(DecoCrates.APPLE_CRATE.get()))
                    .displayItems((parameters, output) -> {
                        output.accept(DecoCrates.CRATE.get());
                        output.accept(DecoCrates.APPLE_CRATE.get());
                        output.accept(DecoCrates.CARROT_CRATE.get());
                        output.accept(DecoCrates.BEETROOT_CRATE.get());
                        output.accept(DecoCrates.POTATO_CRATE.get());
                        output.accept(DecoCrates.POISONOUS_POTATO_CRATE.get());
                        output.accept(DecoCrates.RED_MUSHROOM_CRATE.get());
                        output.accept(DecoCrates.BROWN_MUSHROOM_CRATE.get());

                        output.accept(DecoBaskets.BASKET.get());
                        output.accept(DecoBaskets.ALLIUM_BASKET.get());
                        output.accept(DecoBaskets.CORNFLOWER_BASKET.get());
                        output.accept(DecoBaskets.DANDELION_BASKET.get());
                        output.accept(DecoBaskets.POPPY_BASKET.get());
                        output.accept(DecoBaskets.SWEET_BERRY_BASKET.get());
                        output.accept(DecoBaskets.OXEYE_DAISY_BASKET.get());
                        output.accept(DecoBaskets.AZURE_BLUET_BASKET.get());

                        output.accept(DecoBarrels.FISH_BARREL.get());
                        output.accept(DecoBarrels.COD_BARREL.get());
                        output.accept(DecoBarrels.PUFFERFISH_BARREL.get());
                        output.accept(DecoBarrels.SALMON_BARREL.get());
                        output.accept(DecoBarrels.TROPICAL_FISH_BARREL.get());

                        output.accept(DecoBuckets.STORAGE_BUCKET.get());
                        output.accept(DecoBuckets.BRAIN_CORAL_BUCKET.get());
                        output.accept(DecoBuckets.BUBBLE_CORAL_BUCKET.get());
                        output.accept(DecoBuckets.FIRE_CORAL_BUCKET.get());
                        output.accept(DecoBuckets.HORN_CORAL_BUCKET.get());
                        output.accept(DecoBuckets.TUBE_CORAL_BUCKET.get());

                        output.accept(DecoBags.SEED_BAG.get());
                        output.accept(DecoBags.WHEAT_SEED_BAG.get());
                        output.accept(DecoBags.PUMPKIN_SEED_BAG.get());
                        output.accept(DecoBags.MELON_SEED_BAG.get());
                        output.accept(DecoBags.BEETROOT_SEED_BAG.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
