package com.fukuda.intecrate.common.data;

import com.fukuda.intecrate.common.block.*;
import com.fukuda.intecrate.common.data.recipes.IntecrateRecipeCategory;
import com.fukuda.intecrate.common.data.recipes.IntecrateShapedRecipeBuilder;
import com.fukuda.intecrate.common.data.recipes.IntecrateShapelessRecipeBuilder;
import com.fukuda.intecrate.common.util.IntecrateTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;

import java.util.concurrent.CompletableFuture;

public class IntecrateRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public IntecrateRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {

        /* Crates */
        IntecrateShapedRecipeBuilder.shaped(IntecrateRecipeCategory.CRATES, DecoCrates.CRATE.get())
                .pattern("###")
                .pattern("!!!")
                .pattern("###")
                .define('#', Ingredient.of(IntecrateTags.Items.WOODEN_SLABS))
                .define('!', Items.STICK)
                .unlockedBy("has_wooden_slabs", has(IntecrateTags.Items.WOODEN_SLABS))
                .unlockedBy("has_stick", has(Items.STICK))
                .save(recipeOutput);

        IntecrateShapelessRecipeBuilder.shapeless(IntecrateRecipeCategory.CRATES, Items.APPLE, 9)
                .requires(DecoCrates.APPLE_CRATE)
                .unlockedBy("has_apple_crate", has(DecoCrates.APPLE_CRATE)).save(recipeOutput);
        IntecrateShapedRecipeBuilder.shaped(IntecrateRecipeCategory.CRATES, DecoCrates.APPLE_CRATE.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', Ingredient.of(Items.APPLE))
                .unlockedBy("has_apple", has(Items.APPLE))
                .save(recipeOutput);

        IntecrateShapelessRecipeBuilder.shapeless(IntecrateRecipeCategory.CRATES, Items.CARROT, 9)
                .requires(DecoCrates.CARROT_CRATE)
                .unlockedBy("has_carrot_crate", has(DecoCrates.CARROT_CRATE)).save(recipeOutput);
        IntecrateShapedRecipeBuilder.shaped(IntecrateRecipeCategory.CRATES, DecoCrates.CARROT_CRATE.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', Ingredient.of(Items.CARROT))
                .unlockedBy("has_carrot", has(Items.CARROT))
                .save(recipeOutput);

        IntecrateShapelessRecipeBuilder.shapeless(IntecrateRecipeCategory.CRATES, Items.BEETROOT, 9)
                .requires(DecoCrates.BEETROOT_CRATE)
                .unlockedBy("has_beetroot_crate", has(DecoCrates.BEETROOT_CRATE)).save(recipeOutput);
        IntecrateShapedRecipeBuilder.shaped(IntecrateRecipeCategory.CRATES, DecoCrates.BEETROOT_CRATE.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', Ingredient.of(Items.BEETROOT))
                .unlockedBy("has_beetroot", has(Items.BEETROOT))
                .save(recipeOutput);

        IntecrateShapelessRecipeBuilder.shapeless(IntecrateRecipeCategory.CRATES, Items.POTATO, 9)
                .requires(DecoCrates.POTATO_CRATE)
                .unlockedBy("has_potato_crate", has(DecoCrates.POTATO_CRATE)).save(recipeOutput);
        IntecrateShapedRecipeBuilder.shaped(IntecrateRecipeCategory.CRATES, DecoCrates.POTATO_CRATE.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', Ingredient.of(Items.POTATO))
                .unlockedBy("has_potato", has(Items.POTATO))
                .save(recipeOutput);

        IntecrateShapelessRecipeBuilder.shapeless(IntecrateRecipeCategory.CRATES, Items.POISONOUS_POTATO, 9)
                .requires(DecoCrates.POISONOUS_POTATO_CRATE)
                .unlockedBy("has_poisonous_potato_crate", has(DecoCrates.POISONOUS_POTATO_CRATE)).save(recipeOutput);
        IntecrateShapedRecipeBuilder.shaped(IntecrateRecipeCategory.CRATES, DecoCrates.POISONOUS_POTATO_CRATE.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', Ingredient.of(Items.POISONOUS_POTATO))
                .unlockedBy("has_poisonous_potato", has(Items.POISONOUS_POTATO))
                .save(recipeOutput);

        IntecrateShapelessRecipeBuilder.shapeless(IntecrateRecipeCategory.CRATES, Items.RED_MUSHROOM, 9)
                .requires(DecoCrates.RED_MUSHROOM_CRATE)
                .unlockedBy("has_red_mushroom_crate", has(DecoCrates.RED_MUSHROOM_CRATE)).save(recipeOutput);
        IntecrateShapedRecipeBuilder.shaped(IntecrateRecipeCategory.CRATES, DecoCrates.RED_MUSHROOM_CRATE.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', Ingredient.of(Items.RED_MUSHROOM))
                .unlockedBy("has_red_mushroom", has(Items.RED_MUSHROOM))
                .save(recipeOutput);

        IntecrateShapelessRecipeBuilder.shapeless(IntecrateRecipeCategory.CRATES, Items.BROWN_MUSHROOM, 9)
                .requires(DecoCrates.BROWN_MUSHROOM_CRATE)
                .unlockedBy("has_brown_mushroom_crate", has(DecoCrates.BROWN_MUSHROOM_CRATE)).save(recipeOutput);
        IntecrateShapedRecipeBuilder.shaped(IntecrateRecipeCategory.CRATES, DecoCrates.BROWN_MUSHROOM_CRATE.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', Ingredient.of(Items.BROWN_MUSHROOM))
                .unlockedBy("has_brown_mushroom", has(Items.BROWN_MUSHROOM))
                .save(recipeOutput);

        /* Baskets */
        IntecrateShapedRecipeBuilder.shaped(IntecrateRecipeCategory.BASKETS, DecoBaskets.BASKET.get())
                .pattern("!!!")
                .pattern("!!!")
                .pattern("###")
                .define('#', Ingredient.of(IntecrateTags.Items.WOODEN_SLABS))
                .define('!', Items.STICK)
                .unlockedBy("has_wooden_slabs", has(IntecrateTags.Items.WOODEN_SLABS))
                .unlockedBy("has_stick", has(Items.STICK))
                .save(recipeOutput);

        IntecrateShapelessRecipeBuilder.shapeless(IntecrateRecipeCategory.BASKETS, Items.ALLIUM, 9)
                .requires(DecoBaskets.ALLIUM_BASKET)
                .unlockedBy("has_allium_basket", has(DecoBaskets.ALLIUM_BASKET)).save(recipeOutput);
        IntecrateShapedRecipeBuilder.shaped(IntecrateRecipeCategory.BASKETS, DecoBaskets.ALLIUM_BASKET.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', Ingredient.of(Items.ALLIUM))
                .unlockedBy("has_allium", has(Items.ALLIUM))
                .save(recipeOutput);

        IntecrateShapelessRecipeBuilder.shapeless(IntecrateRecipeCategory.BASKETS, Items.CORNFLOWER, 9)
                .requires(DecoBaskets.CORNFLOWER_BASKET)
                .unlockedBy("has_cornflower_basket", has(DecoBaskets.CORNFLOWER_BASKET)).save(recipeOutput);
        IntecrateShapedRecipeBuilder.shaped(IntecrateRecipeCategory.BASKETS, DecoBaskets.CORNFLOWER_BASKET.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', Ingredient.of(Items.CORNFLOWER))
                .unlockedBy("has_cornflower", has(Items.CORNFLOWER))
                .save(recipeOutput);

        IntecrateShapelessRecipeBuilder.shapeless(IntecrateRecipeCategory.BASKETS, Items.DANDELION, 9)
                .requires(DecoBaskets.DANDELION_BASKET)
                .unlockedBy("has_dandelion_basket", has(DecoBaskets.DANDELION_BASKET)).save(recipeOutput);
        IntecrateShapedRecipeBuilder.shaped(IntecrateRecipeCategory.BASKETS, DecoBaskets.DANDELION_BASKET.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', Ingredient.of(Items.DANDELION))
                .unlockedBy("has_dandelion", has(Items.DANDELION))
                .save(recipeOutput);

        IntecrateShapelessRecipeBuilder.shapeless(IntecrateRecipeCategory.BASKETS, Items.POPPY, 9)
                .requires(DecoBaskets.POPPY_BASKET)
                .unlockedBy("has_poppy_basket", has(DecoBaskets.POPPY_BASKET)).save(recipeOutput);
        IntecrateShapedRecipeBuilder.shaped(IntecrateRecipeCategory.BASKETS, DecoBaskets.POPPY_BASKET.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', Ingredient.of(Items.POPPY))
                .unlockedBy("has_poppy", has(Items.POPPY))
                .save(recipeOutput);

        IntecrateShapelessRecipeBuilder.shapeless(IntecrateRecipeCategory.BASKETS, Items.SWEET_BERRIES, 9)
                .requires(DecoBaskets.SWEET_BERRY_BASKET)
                .unlockedBy("has_sweet_berry_basket", has(DecoBaskets.SWEET_BERRY_BASKET)).save(recipeOutput);
        IntecrateShapedRecipeBuilder.shaped(IntecrateRecipeCategory.BASKETS, DecoBaskets.SWEET_BERRY_BASKET.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', Ingredient.of(Items.SWEET_BERRIES))
                .unlockedBy("has_sweet_berries", has(Items.SWEET_BERRIES))
                .save(recipeOutput);

        IntecrateShapelessRecipeBuilder.shapeless(IntecrateRecipeCategory.BASKETS, Items.OXEYE_DAISY, 9)
                .requires(DecoBaskets.OXEYE_DAISY_BASKET)
                .unlockedBy("has_oxeye_daisy_basket", has(DecoBaskets.OXEYE_DAISY_BASKET)).save(recipeOutput);
        IntecrateShapedRecipeBuilder.shaped(IntecrateRecipeCategory.BASKETS, DecoBaskets.OXEYE_DAISY_BASKET.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', Ingredient.of(Items.OXEYE_DAISY))
                .unlockedBy("has_oxeye_daisy", has(Items.OXEYE_DAISY))
                .save(recipeOutput);

        IntecrateShapelessRecipeBuilder.shapeless(IntecrateRecipeCategory.BASKETS, Items.AZURE_BLUET, 9)
                .requires(DecoBaskets.AZURE_BLUET_BASKET)
                .unlockedBy("has_azure_bluet_basket", has(DecoBaskets.AZURE_BLUET_BASKET)).save(recipeOutput);
        IntecrateShapedRecipeBuilder.shaped(IntecrateRecipeCategory.BASKETS, DecoBaskets.AZURE_BLUET_BASKET.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', Ingredient.of(Items.AZURE_BLUET))
                .unlockedBy("has_azure_bluet", has(Items.AZURE_BLUET))
                .save(recipeOutput);

        /* Barrels */
        IntecrateShapedRecipeBuilder.shaped(IntecrateRecipeCategory.BARRELS, DecoBarrels.FISH_BARREL.get())
                .pattern("###")
                .pattern("$!$")
                .pattern("###")
                .define('#', Ingredient.of(IntecrateTags.Items.WOODEN_SLABS))
                .define('!', Items.IRON_NUGGET)
                .define('$', Ingredient.of(Items.IRON_INGOT))
                .unlockedBy("has_wooden_slabs", has(IntecrateTags.Items.WOODEN_SLABS))
                .unlockedBy("has_iron_nugget", has(Items.IRON_NUGGET))
                .unlockedBy("has_iron_ingot", has(Items.IRON_INGOT))
                .save(recipeOutput);

        IntecrateShapelessRecipeBuilder.shapeless(IntecrateRecipeCategory.BARRELS, Items.COD, 9)
                .requires(DecoBarrels.COD_BARREL)
                .unlockedBy("has_cod_barrel", has(DecoBarrels.COD_BARREL)).save(recipeOutput);
        IntecrateShapedRecipeBuilder.shaped(IntecrateRecipeCategory.BARRELS, DecoBarrels.COD_BARREL.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', Ingredient.of(Items.COD))
                .unlockedBy("has_cod", has(Items.COD))
                .save(recipeOutput);

        IntecrateShapelessRecipeBuilder.shapeless(IntecrateRecipeCategory.BARRELS, Items.PUFFERFISH, 9)
                .requires(DecoBarrels.PUFFERFISH_BARREL)
                .unlockedBy("has_pufferfish_barrel", has(DecoBarrels.PUFFERFISH_BARREL)).save(recipeOutput);
        IntecrateShapedRecipeBuilder.shaped(IntecrateRecipeCategory.BARRELS, DecoBarrels.PUFFERFISH_BARREL.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', Ingredient.of(Items.PUFFERFISH))
                .unlockedBy("has_pufferfish", has(Items.PUFFERFISH))
                .save(recipeOutput);

        IntecrateShapelessRecipeBuilder.shapeless(IntecrateRecipeCategory.BARRELS, Items.SALMON, 9)
                .requires(DecoBarrels.SALMON_BARREL)
                .unlockedBy("has_salmon_barrel", has(DecoBarrels.SALMON_BARREL)).save(recipeOutput);
        IntecrateShapedRecipeBuilder.shaped(IntecrateRecipeCategory.BARRELS, DecoBarrels.SALMON_BARREL.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', Ingredient.of(Items.SALMON))
                .unlockedBy("has_salmon", has(Items.SALMON))
                .save(recipeOutput);

        IntecrateShapelessRecipeBuilder.shapeless(IntecrateRecipeCategory.BARRELS, Items.TROPICAL_FISH, 9)
                .requires(DecoBarrels.TROPICAL_FISH_BARREL)
                .unlockedBy("has_tropical_fish_barrel", has(DecoBarrels.TROPICAL_FISH_BARREL)).save(recipeOutput);
        IntecrateShapedRecipeBuilder.shaped(IntecrateRecipeCategory.BARRELS, DecoBarrels.TROPICAL_FISH_BARREL.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', Ingredient.of(Items.TROPICAL_FISH))
                .unlockedBy("has_tropical_fish", has(Items.TROPICAL_FISH))
                .save(recipeOutput);

        /* Buckets */
        IntecrateShapedRecipeBuilder.shaped(IntecrateRecipeCategory.BUCKETS, DecoBuckets.STORAGE_BUCKET.get())
                .pattern("!!!")
                .pattern("$#$")
                .pattern("$$$")
                .define('#', Ingredient.of(Items.BUCKET))
                .define('$', Ingredient.of(Items.IRON_INGOT))
                .define('!', Items.IRON_NUGGET)
                .unlockedBy("has_iron_ingot", has(Items.IRON_INGOT))
                .unlockedBy("has_iron_nugget", has(Items.IRON_NUGGET))
                .unlockedBy("has_bucket", has(Items.BUCKET))
                .save(recipeOutput);

        IntecrateShapelessRecipeBuilder.shapeless(IntecrateRecipeCategory.BUCKETS, Items.BRAIN_CORAL, 9)
                .requires(DecoBuckets.BRAIN_CORAL_BUCKET)
                .unlockedBy("has_brain_coral_bucket", has(DecoBuckets.BRAIN_CORAL_BUCKET)).save(recipeOutput);
        IntecrateShapedRecipeBuilder.shaped(IntecrateRecipeCategory.BUCKETS, DecoBuckets.BRAIN_CORAL_BUCKET.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', Ingredient.of(Items.BRAIN_CORAL))
                .unlockedBy("has_brain_coral", has(Items.BRAIN_CORAL))
                .save(recipeOutput);

        IntecrateShapelessRecipeBuilder.shapeless(IntecrateRecipeCategory.BUCKETS, Items.BUBBLE_CORAL, 9)
                .requires(DecoBuckets.BUBBLE_CORAL_BUCKET)
                .unlockedBy("has_bubble_coral_bucket", has(DecoBuckets.BUBBLE_CORAL_BUCKET)).save(recipeOutput);
        IntecrateShapedRecipeBuilder.shaped(IntecrateRecipeCategory.BUCKETS, DecoBuckets.BUBBLE_CORAL_BUCKET.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', Ingredient.of(Items.BUBBLE_CORAL))
                .unlockedBy("has_bubble_coral", has(Items.BUBBLE_CORAL))
                .save(recipeOutput);

        IntecrateShapelessRecipeBuilder.shapeless(IntecrateRecipeCategory.BUCKETS, Items.FIRE_CORAL, 9)
                .requires(DecoBuckets.FIRE_CORAL_BUCKET)
                .unlockedBy("has_fire_coral_bucket", has(DecoBuckets.FIRE_CORAL_BUCKET)).save(recipeOutput);
        IntecrateShapedRecipeBuilder.shaped(IntecrateRecipeCategory.BUCKETS, DecoBuckets.FIRE_CORAL_BUCKET.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', Ingredient.of(Items.FIRE_CORAL))
                .unlockedBy("has_fire_coral", has(Items.FIRE_CORAL))
                .save(recipeOutput);

        IntecrateShapelessRecipeBuilder.shapeless(IntecrateRecipeCategory.BUCKETS, Items.HORN_CORAL, 9)
                .requires(DecoBuckets.HORN_CORAL_BUCKET)
                .unlockedBy("has_horn_coral_bucket", has(DecoBuckets.HORN_CORAL_BUCKET)).save(recipeOutput);
        IntecrateShapedRecipeBuilder.shaped(IntecrateRecipeCategory.BUCKETS, DecoBuckets.HORN_CORAL_BUCKET.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', Ingredient.of(Items.HORN_CORAL))
                .unlockedBy("has_horn_coral", has(Items.HORN_CORAL))
                .save(recipeOutput);

        IntecrateShapelessRecipeBuilder.shapeless(IntecrateRecipeCategory.BUCKETS, Items.TUBE_CORAL, 9)
                .requires(DecoBuckets.TUBE_CORAL_BUCKET)
                .unlockedBy("has_tube_coral_bucket", has(DecoBuckets.TUBE_CORAL_BUCKET)).save(recipeOutput);
        IntecrateShapedRecipeBuilder.shaped(IntecrateRecipeCategory.BUCKETS, DecoBuckets.TUBE_CORAL_BUCKET.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', Ingredient.of(Items.TUBE_CORAL))
                .unlockedBy("has_tube_coral", has(Items.TUBE_CORAL))
                .save(recipeOutput);

        /* Bags */
        IntecrateShapedRecipeBuilder.shaped(IntecrateRecipeCategory.BAGS, DecoBags.SEED_BAG.get())
                .pattern("!!!")
                .pattern("###")
                .pattern("###")
                .define('#', Ingredient.of(Items.LEATHER))
                .define('!', Items.STRING)
                .unlockedBy("has_leather", has(Items.LEATHER))
                .unlockedBy("has_string", has(Items.STRING))
                .save(recipeOutput);

        IntecrateShapelessRecipeBuilder.shapeless(IntecrateRecipeCategory.BAGS, Items.WHEAT_SEEDS, 9)
                .requires(DecoBags.WHEAT_SEED_BAG)
                .unlockedBy("has_wheat_seed_bag", has(DecoBags.WHEAT_SEED_BAG)).save(recipeOutput);
        IntecrateShapedRecipeBuilder.shaped(IntecrateRecipeCategory.BAGS, DecoBags.WHEAT_SEED_BAG.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', Ingredient.of(Items.WHEAT_SEEDS))
                .unlockedBy("has_wheat_seeds", has(Items.WHEAT_SEEDS))
                .save(recipeOutput);

        IntecrateShapelessRecipeBuilder.shapeless(IntecrateRecipeCategory.BAGS, Items.PUMPKIN_SEEDS, 9)
                .requires(DecoBags.PUMPKIN_SEED_BAG)
                .unlockedBy("has_pumpkin_seed_bag", has(DecoBags.PUMPKIN_SEED_BAG)).save(recipeOutput);
        IntecrateShapedRecipeBuilder.shaped(IntecrateRecipeCategory.BAGS, DecoBags.PUMPKIN_SEED_BAG.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', Ingredient.of(Items.PUMPKIN_SEEDS))
                .unlockedBy("has_pumpkin_seeds", has(Items.PUMPKIN_SEEDS))
                .save(recipeOutput);

        IntecrateShapelessRecipeBuilder.shapeless(IntecrateRecipeCategory.BAGS, Items.MELON_SEEDS, 9)
                .requires(DecoBags.MELON_SEED_BAG)
                .unlockedBy("has_melon_seed_bag", has(DecoBags.MELON_SEED_BAG)).save(recipeOutput);
        IntecrateShapedRecipeBuilder.shaped(IntecrateRecipeCategory.BAGS, DecoBags.MELON_SEED_BAG.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', Ingredient.of(Items.MELON_SEEDS))
                .unlockedBy("has_melon_seeds", has(Items.MELON_SEEDS))
                .save(recipeOutput);

        IntecrateShapelessRecipeBuilder.shapeless(IntecrateRecipeCategory.BAGS, Items.BEETROOT_SEEDS, 9)
                .requires(DecoBags.BEETROOT_SEED_BAG)
                .unlockedBy("has_beetroot_seed_bag", has(DecoBags.BEETROOT_SEED_BAG)).save(recipeOutput);
        IntecrateShapedRecipeBuilder.shaped(IntecrateRecipeCategory.BAGS, DecoBags.BEETROOT_SEED_BAG.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', Ingredient.of(Items.BEETROOT_SEEDS))
                .unlockedBy("has_beetroot_seeds", has(Items.BEETROOT_SEEDS))
                .save(recipeOutput);

    }
}
