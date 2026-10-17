package com.fukuda.intecrate.client;

import com.fukuda.intecrate.Intecrate;
import com.fukuda.intecrate.common.block.*;
import com.fukuda.intecrate.common.util.IntecrateCreativeModeTabs;

import de.Roboter007.moderntabs.ModernTabs;
import de.Roboter007.moderntabs.section.item.SectionedItems;

import net.minecraft.resources.ResourceLocation;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;

@EventBusSubscriber(modid = Intecrate.MOD_ID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientEvents {

    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
            // Enable sections on your creative mode tab
            ModernTabs.TabDesign tabDesign = new ModernTabs.TabDesign()
                    .sectionsEnabled(true);

            ModernTabs.configureTab(IntecrateCreativeModeTabs.INTECRATE.get(), tabDesign);

            ResourceLocation cratesSection = ResourceLocation.fromNamespaceAndPath(Intecrate.MOD_ID, "crates");
            ResourceLocation bucketsSection = ResourceLocation.fromNamespaceAndPath(Intecrate.MOD_ID, "buckets");
            ResourceLocation basketsSection = ResourceLocation.fromNamespaceAndPath(Intecrate.MOD_ID, "baskets");
            ResourceLocation barrelsSection = ResourceLocation.fromNamespaceAndPath(Intecrate.MOD_ID, "barrels");
            ResourceLocation bagsSection = ResourceLocation.fromNamespaceAndPath(Intecrate.MOD_ID, "bags");

            // Crates
            SectionedItems.addItem(cratesSection, StorageCrates.CRATE.get());
            SectionedItems.addItem(cratesSection, StorageCrates.APPLE_CRATE.get());
            SectionedItems.addItem(cratesSection, StorageCrates.CARROT_CRATE.get());
            SectionedItems.addItem(cratesSection, StorageCrates.BEETROOT_CRATE.get());
            SectionedItems.addItem(cratesSection, StorageCrates.POTATO_CRATE.get());
            SectionedItems.addItem(cratesSection, StorageCrates.POISONOUS_POTATO_CRATE.get());
            SectionedItems.addItem(cratesSection, StorageCrates.RED_MUSHROOM_CRATE.get());
            SectionedItems.addItem(cratesSection, StorageCrates.BROWN_MUSHROOM_CRATE.get());

            // Baskets
            SectionedItems.addItem(basketsSection, StorageBaskets.BASKET.get());
            SectionedItems.addItem(basketsSection, StorageBaskets.ALLIUM_BASKET.get());
            SectionedItems.addItem(basketsSection, StorageBaskets.CORNFLOWER_BASKET.get());
            SectionedItems.addItem(basketsSection, StorageBaskets.DANDELION_BASKET.get());
            SectionedItems.addItem(basketsSection, StorageBaskets.POPPY_BASKET.get());
            SectionedItems.addItem(basketsSection, StorageBaskets.SWEET_BERRY_BASKET.get());
            SectionedItems.addItem(basketsSection, StorageBaskets.OXEYE_DAISY_BASKET.get());
            SectionedItems.addItem(basketsSection, StorageBaskets.AZURE_BLUET_BASKET.get());

            // Buckets
            SectionedItems.addItem(bucketsSection, StorageBuckets.BRAIN_CORAL_BUCKET.get());
            SectionedItems.addItem(bucketsSection, StorageBuckets.BUBBLE_CORAL_BUCKET.get());
            SectionedItems.addItem(bucketsSection, StorageBuckets.FIRE_CORAL_BUCKET.get());
            SectionedItems.addItem(bucketsSection, StorageBuckets.HORN_CORAL_BUCKET.get());
            SectionedItems.addItem(bucketsSection, StorageBuckets.TUBE_CORAL_BUCKET.get());

            // Barrels
            SectionedItems.addItem(barrelsSection, StorageBarrels.FISH_BARREL.get());
            SectionedItems.addItem(barrelsSection, StorageBarrels.COD_BARREL.get());
            SectionedItems.addItem(barrelsSection, StorageBarrels.PUFFERFISH_BARREL.get());
            SectionedItems.addItem(barrelsSection, StorageBarrels.SALMON_BARREL.get());
            SectionedItems.addItem(barrelsSection, StorageBarrels.TROPICAL_FISH_BARREL.get());

            // Bags
            SectionedItems.addItem(bagsSection, StorageBags.WHEAT_SEED_BAG.get());
            SectionedItems.addItem(bagsSection, StorageBags.PUMPKIN_SEED_BAG.get());
            SectionedItems.addItem(bagsSection, StorageBags.MELON_SEED_BAG.get());
            SectionedItems.addItem(bagsSection, StorageBags.BEETROOT_SEED_BAG.get());
        });
    }
}