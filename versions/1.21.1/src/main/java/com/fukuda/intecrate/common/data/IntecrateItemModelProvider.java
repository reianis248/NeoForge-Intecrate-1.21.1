package com.fukuda.intecrate.common.data;

import com.fukuda.intecrate.Intecrate;
import com.fukuda.intecrate.common.block.*;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class IntecrateItemModelProvider extends ItemModelProvider {
    public IntecrateItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Intecrate.MOD_ID, existingFileHelper);
    }

    @Override protected void registerModels() {
        simpleBlockItem(DecoCrates.CRATE.get());
        simpleBlockItem(DecoCrates.APPLE_CRATE.get());
        simpleBlockItem(DecoCrates.CARROT_CRATE.get());
        simpleBlockItem(DecoCrates.BEETROOT_CRATE.get());
        simpleBlockItem(DecoCrates.POTATO_CRATE.get());
        simpleBlockItem(DecoCrates.POISONOUS_POTATO_CRATE.get());
        simpleBlockItem(DecoCrates.RED_MUSHROOM_CRATE.get());
        simpleBlockItem(DecoCrates.BROWN_MUSHROOM_CRATE.get());

        simpleBlockItem(DecoBaskets.BASKET.get());
        simpleBlockItem(DecoBaskets.ALLIUM_BASKET.get());
        simpleBlockItem(DecoBaskets.CORNFLOWER_BASKET.get());
        simpleBlockItem(DecoBaskets.DANDELION_BASKET.get());
        simpleBlockItem(DecoBaskets.POPPY_BASKET.get());
        simpleBlockItem(DecoBaskets.SWEET_BERRY_BASKET.get());
        simpleBlockItem(DecoBaskets.OXEYE_DAISY_BASKET.get());
        simpleBlockItem(DecoBaskets.AZURE_BLUET_BASKET.get());

        simpleBlockItem(DecoBarrels.FISH_BARREL.get());
        simpleBlockItem(DecoBarrels.COD_BARREL.get());
        simpleBlockItem(DecoBarrels.PUFFERFISH_BARREL.get());
        simpleBlockItem(DecoBarrels.SALMON_BARREL.get());
        simpleBlockItem(DecoBarrels.TROPICAL_FISH_BARREL.get());

        simpleBlockItem(DecoBuckets.STORAGE_BUCKET.get());
        simpleBlockItem(DecoBuckets.BRAIN_CORAL_BUCKET.get());
        simpleBlockItem(DecoBuckets.BUBBLE_CORAL_BUCKET.get());
        simpleBlockItem(DecoBuckets.FIRE_CORAL_BUCKET.get());
        simpleBlockItem(DecoBuckets.HORN_CORAL_BUCKET.get());
        simpleBlockItem(DecoBuckets.TUBE_CORAL_BUCKET.get());

        simpleBlockItem(DecoBoxes.MEAT_BOX.get());
        simpleBlockItem(DecoBoxes.BEEF_BOX.get());
        simpleBlockItem(DecoBoxes.PORKCHOP_BOX.get());
        simpleBlockItem(DecoBoxes.MUTTON_BOX.get());
        simpleBlockItem(DecoBoxes.CHICKEN_BOX.get());
        simpleBlockItem(DecoBoxes.RABBIT_BOX.get());
    }
}
