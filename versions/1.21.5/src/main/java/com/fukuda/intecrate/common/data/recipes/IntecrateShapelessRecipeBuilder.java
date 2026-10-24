package com.fukuda.intecrate.common.data.recipes;

import com.fukuda.intecrate.common.data.recipes.IntecrateRecipeCategory;
import net.minecraft.advancements.Advancement;
import net.minecraft.advancements.AdvancementHolder;
import net.minecraft.advancements.AdvancementRewards;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.advancements.Criterion;
import net.minecraft.advancements.critereon.RecipeUnlockedTrigger;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.NonNullList;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.recipes.RecipeBuilder;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.CraftingBookCategory;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.item.crafting.ShapelessRecipe;
import net.minecraft.world.level.ItemLike;

import javax.annotation.Nullable;
import java.util.LinkedHashMap;
import java.util.Map;

public class IntecrateShapelessRecipeBuilder implements RecipeBuilder {
    private final IntecrateRecipeCategory category;
    private final Item result;
    private final int count;
    private final NonNullList<Ingredient> ingredients = NonNullList.create();
    private final Map<String, Criterion<?>> criteria = new LinkedHashMap<>();
    @Nullable
    private String group;

    public IntecrateShapelessRecipeBuilder(IntecrateRecipeCategory category, ItemLike result, int count) {
        this.category = category;
        this.result = result.asItem();
        this.count = count;
    }

    public static IntecrateShapelessRecipeBuilder shapeless(IntecrateRecipeCategory category, ItemLike result) {
        return shapeless(category, result, 1);
    }

    public static IntecrateShapelessRecipeBuilder shapeless(IntecrateRecipeCategory category, ItemLike result, int count) {
        return new IntecrateShapelessRecipeBuilder(category, result, count);
    }

    public IntecrateShapelessRecipeBuilder requires(TagKey<Item> tag) {
        return this.requires(Ingredient.of(BuiltInRegistries.ITEM.getOrThrow(tag)));
    }

    public IntecrateShapelessRecipeBuilder requires(ItemLike item) {
        return this.requires(item, 1);
    }

    public IntecrateShapelessRecipeBuilder requires(ItemLike item, int quantity) {
        for(int i = 0; i < quantity; ++i) {
            this.requires(Ingredient.of(item));
        }
        return this;
    }

    public IntecrateShapelessRecipeBuilder requires(Ingredient ingredient) {
        this.ingredients.add(ingredient);
        return this;
    }

    @Override
    public IntecrateShapelessRecipeBuilder unlockedBy(String name, Criterion<?> criterion) {
        this.criteria.put(name, criterion);
        return this;
    }

    @Override
    public IntecrateShapelessRecipeBuilder group(@Nullable String groupName) {
        this.group = groupName;
        return this;
    }

    @Override
    public Item getResult() {
        return this.result;
    }

    @Override
    public void save(RecipeOutput recipeOutput, ResourceKey<Recipe<?>> id) {
        ShapelessRecipe shapelessrecipe = new ShapelessRecipe(
                this.group == null ? "" : this.group,
                CraftingBookCategory.MISC,
                new ItemStack(this.result, this.count),
                this.ingredients
        );

        Advancement.Builder advancement$builder = recipeOutput.advancement()
                .addCriterion("has_the_recipe", RecipeUnlockedTrigger.unlocked(id))
                .rewards(AdvancementRewards.Builder.recipe(id));

        this.criteria.forEach(advancement$builder::addCriterion);

        ResourceLocation advancementId = id.location().withPrefix("recipes/" + this.category.getFolderName() + "/");

        recipeOutput.accept(id, shapelessrecipe, advancement$builder.build(advancementId));
    }
}