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
            ResourceLocation basketsSection = ResourceLocation.fromNamespaceAndPath(Intecrate.MOD_ID, "baskets");
            ResourceLocation barrelsSection = ResourceLocation.fromNamespaceAndPath(Intecrate.MOD_ID, "barrels");
            ResourceLocation bucketsSection = ResourceLocation.fromNamespaceAndPath(Intecrate.MOD_ID, "buckets");
            ResourceLocation bagsSection = ResourceLocation.fromNamespaceAndPath(Intecrate.MOD_ID, "bags");

            /* Crates */
            SectionedItems.addItem(cratesSection, DecoCrates.CRATE.get());
            SectionedItems.addItem(cratesSection, DecoCrates.APPLE_CRATE.get());
            SectionedItems.addItem(cratesSection, DecoCrates.CARROT_CRATE.get());
            SectionedItems.addItem(cratesSection, DecoCrates.BEETROOT_CRATE.get());
            SectionedItems.addItem(cratesSection, DecoCrates.POTATO_CRATE.get());
            SectionedItems.addItem(cratesSection, DecoCrates.POISONOUS_POTATO_CRATE.get());
            SectionedItems.addItem(cratesSection, DecoCrates.RED_MUSHROOM_CRATE.get());
            SectionedItems.addItem(cratesSection, DecoCrates.BROWN_MUSHROOM_CRATE.get());

            /* Baskets */
            SectionedItems.addItem(basketsSection, DecoBaskets.BASKET.get());
            SectionedItems.addItem(basketsSection, DecoBaskets.ALLIUM_BASKET.get());
            SectionedItems.addItem(basketsSection, DecoBaskets.CORNFLOWER_BASKET.get());
            SectionedItems.addItem(basketsSection, DecoBaskets.DANDELION_BASKET.get());
            SectionedItems.addItem(basketsSection, DecoBaskets.POPPY_BASKET.get());
            SectionedItems.addItem(basketsSection, DecoBaskets.SWEET_BERRY_BASKET.get());
            SectionedItems.addItem(basketsSection, DecoBaskets.OXEYE_DAISY_BASKET.get());
            SectionedItems.addItem(basketsSection, DecoBaskets.AZURE_BLUET_BASKET.get());

            /* Barrels */
            SectionedItems.addItem(barrelsSection, DecoBarrels.FISH_BARREL.get());
            SectionedItems.addItem(barrelsSection, DecoBarrels.COD_BARREL.get());
            SectionedItems.addItem(barrelsSection, DecoBarrels.PUFFERFISH_BARREL.get());
            SectionedItems.addItem(barrelsSection, DecoBarrels.SALMON_BARREL.get());
            SectionedItems.addItem(barrelsSection, DecoBarrels.TROPICAL_FISH_BARREL.get());

            /* Buckets */
            SectionedItems.addItem(bucketsSection, DecoBuckets.STORAGE_BUCKET.get());
            SectionedItems.addItem(bucketsSection, DecoBuckets.BRAIN_CORAL_BUCKET.get());
            SectionedItems.addItem(bucketsSection, DecoBuckets.BUBBLE_CORAL_BUCKET.get());
            SectionedItems.addItem(bucketsSection, DecoBuckets.FIRE_CORAL_BUCKET.get());
            SectionedItems.addItem(bucketsSection, DecoBuckets.HORN_CORAL_BUCKET.get());
            SectionedItems.addItem(bucketsSection, DecoBuckets.TUBE_CORAL_BUCKET.get());

            /* Bags */
            SectionedItems.addItem(bagsSection, DecoBags.SEED_BAG.get());
            SectionedItems.addItem(bagsSection, DecoBags.WHEAT_SEED_BAG.get());
            SectionedItems.addItem(bagsSection, DecoBags.PUMPKIN_SEED_BAG.get());
            SectionedItems.addItem(bagsSection, DecoBags.MELON_SEED_BAG.get());
            SectionedItems.addItem(bagsSection, DecoBags.BEETROOT_SEED_BAG.get());
        });
    }
}