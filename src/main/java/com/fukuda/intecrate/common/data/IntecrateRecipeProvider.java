package com.fukuda.intecrate.common.data;

import com.fukuda.intecrate.common.block.StorageBarrels;
import com.fukuda.intecrate.common.block.StorageBaskets;
import com.fukuda.intecrate.common.block.StorageCrates;
import com.fukuda.intecrate.common.data.recipes.IntecrateRecipeCategory;
import com.fukuda.intecrate.common.data.recipes.IntecrateShapedRecipeBuilder;
import com.fukuda.intecrate.common.data.recipes.IntecrateShapelessRecipeBuilder;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;

import java.util.concurrent.CompletableFuture;

public class IntecrateRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public IntecrateRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {

        /* Crates */
        IntecrateShapelessRecipeBuilder.shapeless(IntecrateRecipeCategory.CRATES, Items.APPLE, 9)
                .requires(StorageCrates.APPLE_CRATE)
                .unlockedBy("has_apple_crate", has(StorageCrates.APPLE_CRATE)).save(recipeOutput);
        IntecrateShapedRecipeBuilder.shaped(IntecrateRecipeCategory.CRATES, StorageCrates.APPLE_CRATE.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', Ingredient.of(Items.APPLE))
                .unlockedBy("has_apple", has(Items.APPLE))
                .save(recipeOutput);

        IntecrateShapelessRecipeBuilder.shapeless(IntecrateRecipeCategory.CRATES, Items.CARROT, 9)
                .requires(StorageCrates.CARROT_CRATE)
                .unlockedBy("has_carrot_crate", has(StorageCrates.CARROT_CRATE)).save(recipeOutput);
        IntecrateShapedRecipeBuilder.shaped(IntecrateRecipeCategory.CRATES, StorageCrates.CARROT_CRATE.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', Ingredient.of(Items.CARROT))
                .unlockedBy("has_carrot", has(Items.CARROT))
                .save(recipeOutput);

        IntecrateShapelessRecipeBuilder.shapeless(IntecrateRecipeCategory.CRATES, Items.BEETROOT, 9)
                .requires(StorageCrates.BEETROOT_CRATE)
                .unlockedBy("has_beetroot_crate", has(StorageCrates.BEETROOT_CRATE)).save(recipeOutput);
        IntecrateShapedRecipeBuilder.shaped(IntecrateRecipeCategory.CRATES, StorageCrates.BEETROOT_CRATE.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', Ingredient.of(Items.BEETROOT))
                .unlockedBy("has_beetroot", has(Items.BEETROOT))
                .save(recipeOutput);

        IntecrateShapelessRecipeBuilder.shapeless(IntecrateRecipeCategory.CRATES, Items.POTATO, 9)
                .requires(StorageCrates.POTATO_CRATE)
                .unlockedBy("has_potato_crate", has(StorageCrates.POTATO_CRATE)).save(recipeOutput);
        IntecrateShapedRecipeBuilder.shaped(IntecrateRecipeCategory.CRATES, StorageCrates.POTATO_CRATE.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', Ingredient.of(Items.POTATO))
                .unlockedBy("has_potato", has(Items.POTATO))
                .save(recipeOutput);

        IntecrateShapelessRecipeBuilder.shapeless(IntecrateRecipeCategory.CRATES, Items.POISONOUS_POTATO, 9)
                .requires(StorageCrates.POISONOUS_POTATO_CRATE)
                .unlockedBy("has_poisonous_potato_crate", has(StorageCrates.POISONOUS_POTATO_CRATE)).save(recipeOutput);
        IntecrateShapedRecipeBuilder.shaped(IntecrateRecipeCategory.CRATES, StorageCrates.POISONOUS_POTATO_CRATE.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', Ingredient.of(Items.POISONOUS_POTATO))
                .unlockedBy("has_poisonous_potato", has(Items.POISONOUS_POTATO))
                .save(recipeOutput);

        IntecrateShapelessRecipeBuilder.shapeless(IntecrateRecipeCategory.CRATES, Items.RED_MUSHROOM, 9)
                .requires(StorageCrates.RED_MUSHROOM_CRATE)
                .unlockedBy("has_red_mushroom_crate", has(StorageCrates.RED_MUSHROOM_CRATE)).save(recipeOutput);
        IntecrateShapedRecipeBuilder.shaped(IntecrateRecipeCategory.CRATES, StorageCrates.RED_MUSHROOM_CRATE.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', Ingredient.of(Items.RED_MUSHROOM))
                .unlockedBy("has_red_mushroom", has(Items.RED_MUSHROOM))
                .save(recipeOutput);

        IntecrateShapelessRecipeBuilder.shapeless(IntecrateRecipeCategory.CRATES, Items.BROWN_MUSHROOM, 9)
                .requires(StorageCrates.BROWN_MUSHROOM_CRATE)
                .unlockedBy("has_brown_mushroom_crate", has(StorageCrates.BROWN_MUSHROOM_CRATE)).save(recipeOutput);
        IntecrateShapedRecipeBuilder.shaped(IntecrateRecipeCategory.CRATES, StorageCrates.BROWN_MUSHROOM_CRATE.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', Ingredient.of(Items.BROWN_MUSHROOM))
                .unlockedBy("has_brown_mushroom", has(Items.BROWN_MUSHROOM))
                .save(recipeOutput);

        /* Baskets */
        IntecrateShapelessRecipeBuilder.shapeless(IntecrateRecipeCategory.BASKETS, Items.ALLIUM, 9)
                .requires(StorageBaskets.ALLIUM_BASKET)
                .unlockedBy("has_allium_basket", has(StorageBaskets.ALLIUM_BASKET)).save(recipeOutput);
        IntecrateShapedRecipeBuilder.shaped(IntecrateRecipeCategory.BASKETS, StorageBaskets.ALLIUM_BASKET.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', Ingredient.of(Items.ALLIUM))
                .unlockedBy("has_allium", has(Items.ALLIUM))
                .save(recipeOutput);

        IntecrateShapelessRecipeBuilder.shapeless(IntecrateRecipeCategory.BASKETS, Items.CORNFLOWER, 9)
                .requires(StorageBaskets.CORNFLOWER_BASKET)
                .unlockedBy("has_cornflower_basket", has(StorageBaskets.CORNFLOWER_BASKET)).save(recipeOutput);
        IntecrateShapedRecipeBuilder.shaped(IntecrateRecipeCategory.BASKETS, StorageBaskets.CORNFLOWER_BASKET.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', Ingredient.of(Items.CORNFLOWER))
                .unlockedBy("has_cornflower", has(Items.CORNFLOWER))
                .save(recipeOutput);

        IntecrateShapelessRecipeBuilder.shapeless(IntecrateRecipeCategory.BASKETS, Items.DANDELION, 9)
                .requires(StorageBaskets.DANDELION_BASKET)
                .unlockedBy("has_dandelion_basket", has(StorageBaskets.DANDELION_BASKET)).save(recipeOutput);
        IntecrateShapedRecipeBuilder.shaped(IntecrateRecipeCategory.BASKETS, StorageBaskets.DANDELION_BASKET.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', Ingredient.of(Items.DANDELION))
                .unlockedBy("has_dandelion", has(Items.DANDELION))
                .save(recipeOutput);

        IntecrateShapelessRecipeBuilder.shapeless(IntecrateRecipeCategory.BASKETS, Items.POPPY, 9)
                .requires(StorageBaskets.POPPY_BASKET)
                .unlockedBy("has_poppy_basket", has(StorageBaskets.POPPY_BASKET)).save(recipeOutput);
        IntecrateShapedRecipeBuilder.shaped(IntecrateRecipeCategory.BASKETS, StorageBaskets.POPPY_BASKET.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', Ingredient.of(Items.POPPY))
                .unlockedBy("has_poppy", has(Items.POPPY))
                .save(recipeOutput);

        IntecrateShapelessRecipeBuilder.shapeless(IntecrateRecipeCategory.BASKETS, Items.SWEET_BERRIES, 9)
                .requires(StorageBaskets.SWEET_BERRY_BASKET)
                .unlockedBy("has_sweet_berry_basket", has(StorageBaskets.SWEET_BERRY_BASKET)).save(recipeOutput);
        IntecrateShapedRecipeBuilder.shaped(IntecrateRecipeCategory.BASKETS, StorageBaskets.SWEET_BERRY_BASKET.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', Ingredient.of(Items.SWEET_BERRIES))
                .unlockedBy("has_sweet_berries", has(Items.SWEET_BERRIES))
                .save(recipeOutput);

        IntecrateShapelessRecipeBuilder.shapeless(IntecrateRecipeCategory.BASKETS, Items.OXEYE_DAISY, 9)
                .requires(StorageBaskets.OXEYE_DAISY_BASKET)
                .unlockedBy("has_oxeye_daisy_basket", has(StorageBaskets.OXEYE_DAISY_BASKET)).save(recipeOutput);
        IntecrateShapedRecipeBuilder.shaped(IntecrateRecipeCategory.BASKETS, StorageBaskets.OXEYE_DAISY_BASKET.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', Ingredient.of(Items.OXEYE_DAISY))
                .unlockedBy("has_oxeye_daisy", has(Items.OXEYE_DAISY))
                .save(recipeOutput);

        IntecrateShapelessRecipeBuilder.shapeless(IntecrateRecipeCategory.BASKETS, Items.AZURE_BLUET, 9)
                .requires(StorageBaskets.AZURE_BLUET_BASKET)
                .unlockedBy("has_azure_bluet_basket", has(StorageBaskets.AZURE_BLUET_BASKET)).save(recipeOutput);
        IntecrateShapedRecipeBuilder.shaped(IntecrateRecipeCategory.BASKETS, StorageBaskets.AZURE_BLUET_BASKET.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', Ingredient.of(Items.AZURE_BLUET))
                .unlockedBy("has_azure_bluet", has(Items.AZURE_BLUET))
                .save(recipeOutput);

        /* Barrels */
        IntecrateShapelessRecipeBuilder.shapeless(IntecrateRecipeCategory.BARRELS, Items.COD, 9)
                .requires(StorageBarrels.COD_BARREL)
                .unlockedBy("has_cod_barrel", has(StorageBarrels.COD_BARREL)).save(recipeOutput);
        IntecrateShapedRecipeBuilder.shaped(IntecrateRecipeCategory.BARRELS, StorageBarrels.COD_BARREL.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', Ingredient.of(Items.COD))
                .unlockedBy("has_cod", has(Items.COD))
                .save(recipeOutput);

        IntecrateShapelessRecipeBuilder.shapeless(IntecrateRecipeCategory.BARRELS, Items.PUFFERFISH, 9)
                .requires(StorageBarrels.PUFFERFISH_BARREL)
                .unlockedBy("has_pufferfish_barrel", has(StorageBarrels.PUFFERFISH_BARREL)).save(recipeOutput);
        IntecrateShapedRecipeBuilder.shaped(IntecrateRecipeCategory.BARRELS, StorageBarrels.PUFFERFISH_BARREL.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', Ingredient.of(Items.PUFFERFISH))
                .unlockedBy("has_pufferfish", has(Items.PUFFERFISH))
                .save(recipeOutput);

        IntecrateShapelessRecipeBuilder.shapeless(IntecrateRecipeCategory.BARRELS, Items.SALMON, 9)
                .requires(StorageBarrels.SALMON_BARREL)
                .unlockedBy("has_salmon_barrel", has(StorageBarrels.SALMON_BARREL)).save(recipeOutput);
        IntecrateShapedRecipeBuilder.shaped(IntecrateRecipeCategory.BARRELS, StorageBarrels.SALMON_BARREL.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', Ingredient.of(Items.SALMON))
                .unlockedBy("has_salmon", has(Items.SALMON))
                .save(recipeOutput);

        IntecrateShapelessRecipeBuilder.shapeless(IntecrateRecipeCategory.BARRELS, Items.TROPICAL_FISH, 9)
                .requires(StorageBarrels.TROPICAL_FISH_BARREL)
                .unlockedBy("has_tropical_fish_barrel", has(StorageBarrels.TROPICAL_FISH_BARREL)).save(recipeOutput);
        IntecrateShapedRecipeBuilder.shaped(IntecrateRecipeCategory.BARRELS, StorageBarrels.TROPICAL_FISH_BARREL.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', Ingredient.of(Items.TROPICAL_FISH))
                .unlockedBy("has_tropical_fish", has(Items.TROPICAL_FISH))
                .save(recipeOutput);
    }
}
