package com.fukuda.intecrate.common.data.recipes;

import com.fukuda.intecrate.common.data.recipes.IntecrateRecipeCategory;
import net.minecraft.advancements.Advancement;
import net.minecraft.advancements.AdvancementHolder;
import net.minecraft.advancements.AdvancementRewards;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.advancements.Criterion;
import net.minecraft.advancements.critereon.RecipeUnlockedTrigger;
import net.minecraft.core.HolderLookup;
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
import net.minecraft.world.item.crafting.ShapedRecipe;
import net.minecraft.world.item.crafting.ShapedRecipePattern;
import net.minecraft.world.level.ItemLike;

import javax.annotation.Nullable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class IntecrateShapedRecipeBuilder implements RecipeBuilder {
    private final IntecrateRecipeCategory category;
    private final Item result;
    private final int count;
    private final List<String> rows;
    private final Map<Character, Ingredient> key = new LinkedHashMap<>();
    private final Map<String, Criterion<?>> criteria = new LinkedHashMap<>();
    @Nullable
    private String group;

    public IntecrateShapedRecipeBuilder(IntecrateRecipeCategory category, ItemLike result, int count) {
        this.category = category;
        this.result = result.asItem();
        this.count = count;
        this.rows = new java.util.ArrayList<>();
    }

    public static IntecrateShapedRecipeBuilder shaped(IntecrateRecipeCategory category, ItemLike result) {
        return shaped(category, result, 1);
    }

    public static IntecrateShapedRecipeBuilder shaped(IntecrateRecipeCategory category, ItemLike result, int count) {
        return new IntecrateShapedRecipeBuilder(category, result, count);
    }

    public IntecrateShapedRecipeBuilder define(Character symbol, TagKey<Item> tag) {
        return this.define(symbol, Ingredient.of(BuiltInRegistries.ITEM.getOrThrow(tag)));
    }

    public IntecrateShapedRecipeBuilder define(Character symbol, ItemLike item) {
        return this.define(symbol, Ingredient.of(item));
    }

    public IntecrateShapedRecipeBuilder define(Character symbol, Ingredient ingredient) {
        if (this.key.containsKey(symbol)) {
            throw new IllegalArgumentException("Symbol '" + symbol + "' is already defined.");
        } else if (symbol == ' ') {
            throw new IllegalArgumentException("Symbol ' ' cannot be defined.");
        } else {
            this.key.put(symbol, ingredient);
            return this;
        }
    }

    public IntecrateShapedRecipeBuilder pattern(String pattern) {
        this.rows.add(pattern);
        return this;
    }

    @Override
    public IntecrateShapedRecipeBuilder unlockedBy(String name, Criterion<?> criterion) {
        this.criteria.put(name, criterion);
        return this;
    }

    @Override
    public IntecrateShapedRecipeBuilder group(@Nullable String groupName) {
        this.group = groupName;
        return this;
    }

    @Override
    public Item getResult() {
        this.result.asItem();
        return this.result;
    }

    @Override
    public void save(RecipeOutput recipeOutput, ResourceKey<Recipe<?>> id) {
        ShapedRecipePattern shapedrecipepattern = ShapedRecipePattern.of(this.key, this.rows);
        ShapedRecipe shapedrecipe = new ShapedRecipe(
                this.group == null ? "" : this.group,
                CraftingBookCategory.MISC,
                shapedrecipepattern,
                new ItemStack(this.result, this.count)
        );

        Advancement.Builder advancement$builder = recipeOutput.advancement()
                .addCriterion("has_the_recipe", RecipeUnlockedTrigger.unlocked(id))
                .rewards(AdvancementRewards.Builder.recipe(id));

        this.criteria.forEach(advancement$builder::addCriterion);

        ResourceLocation advancementId = id.location().withPrefix("recipes/" + this.category.getFolderName() + "/");

        recipeOutput.accept(id, shapedrecipe, advancement$builder.build(advancementId));
    }
}