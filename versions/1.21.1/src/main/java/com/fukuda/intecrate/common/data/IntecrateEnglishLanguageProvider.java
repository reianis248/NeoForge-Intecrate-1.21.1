package com.fukuda.intecrate.common.data;

import com.fukuda.intecrate.Intecrate;
import com.fukuda.intecrate.common.block.registry.*;
import com.fukuda.intecrate.common.block.registry.food.DecoCakeBlocks;
import com.fukuda.intecrate.common.item.registry.SlicedCake;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;

public class IntecrateEnglishLanguageProvider extends LanguageProvider {
    public IntecrateEnglishLanguageProvider(PackOutput output, String locale) {
        super(output, Intecrate.MOD_ID, "en_us");
    }

    @Override protected void addTranslations() {
        add("itemGroup.intecrate", "Intecrate");
        add("section.intecrate.crates", "Crates");
        add("section.intecrate.baskets", "Baskets");
        add("section.intecrate.barrels", "Barrels");
        add("section.intecrate.buckets", "Buckets");
        add("section.intecrate.bags", "Bags");
        add("section.intecrate.boxes", "Boxes");
        add("section.intecrate.cakes", "Cakes");

        add(DecoCrates.CRATE.get(), "Crates");
        add(DecoCrates.APPLE_CRATE.get(), "Crate of Apples");
        add(DecoCrates.CARROT_CRATE.get(), "Crate of Carrots");
        add(DecoCrates.BEETROOT_CRATE.get(), "Crate of Beetroots");
        add(DecoCrates.POTATO_CRATE.get(), "Crate of Potatoes");
        add(DecoCrates.POISONOUS_POTATO_CRATE.get(), "Crate of Poisonous Potatoes");
        add(DecoCrates.RED_MUSHROOM_CRATE.get(), "Crate of Red Mushrooms");
        add(DecoCrates.BROWN_MUSHROOM_CRATE.get(), "Crate of Brown Mushrooms");

        add(DecoBaskets.BASKET.get(), "Basket");
        add(DecoBaskets.ALLIUM_BASKET.get(), "Allium Basket");
        add(DecoBaskets.CORNFLOWER_BASKET.get(), "Cornflower Basket");
        add(DecoBaskets.DANDELION_BASKET.get(), "Dandelion Basket");
        add(DecoBaskets.POPPY_BASKET.get(), "Poppy Basket");
        add(DecoBaskets.SWEET_BERRY_BASKET.get(), "Sweet Berry Basket");
        add(DecoBaskets.OXEYE_DAISY_BASKET.get(), "Oxeye Daisy Basket");
        add(DecoBaskets.AZURE_BLUET_BASKET.get(), "Azure Bluet Basket");

        add(DecoBarrels.FISH_BARREL.get(), "Fish Barrel");
        add(DecoBarrels.COD_BARREL.get(), "Barrel of Cod");
        add(DecoBarrels.PUFFERFISH_BARREL.get(), "Barrel of Pufferfish");
        add(DecoBarrels.SALMON_BARREL.get(), "Barrel of Salmon");
        add(DecoBarrels.TROPICAL_FISH_BARREL.get(), "Barrel of Tropical Fish");

        add(DecoBuckets.STORAGE_BUCKET.get(), "Storage Bucket");
        add(DecoBuckets.BRAIN_CORAL_BUCKET.get(), "Bucket of Barin Coral");
        add(DecoBuckets.BUBBLE_CORAL_BUCKET.get(), "Bucket of Bubble Coral");
        add(DecoBuckets.FIRE_CORAL_BUCKET.get(), "Bucket of Fire Coral");
        add(DecoBuckets.HORN_CORAL_BUCKET.get(), "Bucket of Horn Coral");
        add(DecoBuckets.TUBE_CORAL_BUCKET.get(), "Bucket of Tube Coral");

        add(DecoBags.SEED_BAG.get(), "Seed Bag");
        add(DecoBags.WHEAT_SEED_BAG.get(), "Bag of Wheat Seeds");
        add(DecoBags.PUMPKIN_SEED_BAG.get(), "Bag of Pumpkin Seeds");
        add(DecoBags.MELON_SEED_BAG.get(), "Bag of Melon Seeds");
        add(DecoBags.BEETROOT_SEED_BAG.get(), "Bag of Beetroot Seeds");

        add(DecoBoxes.MEAT_BOX.get(), "Meat Box");
        add(DecoBoxes.BEEF_BOX.get(), "Box of Beef");
        add(DecoBoxes.PORKCHOP_BOX.get(), "Box of Porkchop");
        add(DecoBoxes.MUTTON_BOX.get(), "Box of Mutton");
        add(DecoBoxes.CHICKEN_BOX.get(), "Box of Chicken");
        add(DecoBoxes.RABBIT_BOX.get(), "Box of Rabbit");

        add(DecoCakeBlocks.PLAIN_CAKE.get(), "Plain Cake");
        add(DecoCakeBlocks.SWEET_BERRY_CAKE.get(), "Sweet Berry Cake");
        add(DecoCakeBlocks.GLOW_BERRY_CAKE.get(), "Glow Berry Cake");
        add(DecoCakeBlocks.CHORUS_FRUIT_CAKE.get(), "Chorus Fruit Cake");
        add(DecoCakeBlocks.CARROT_CAKE.get(), "Carrot Cake");
        add(DecoCakeBlocks.HONEY_CAKE.get(), "Honey Cake");

        add(SlicedCake.SLICED_PLAIN_CAKE.get(), "Sliced Plain Cake");
        add(SlicedCake.SLICED_SWEET_BERRY_CAKE.get(), "Sliced Sweet Berry Cake");
        add(SlicedCake.SLICED_GLOW_BERRY_CAKE.get(), "Sliced Glow Berry Cake");
        add(SlicedCake.SLICED_CHORUS_FRUIT_CAKE.get(), "Sliced Chorus Fruit Cake");
        add(SlicedCake.SLICED_CARROT_CAKE.get(), "Sliced Carrot Cake");
        add(SlicedCake.SLICED_HONEY_CAKE.get(), "Sliced Honey Cake");
    }
}
