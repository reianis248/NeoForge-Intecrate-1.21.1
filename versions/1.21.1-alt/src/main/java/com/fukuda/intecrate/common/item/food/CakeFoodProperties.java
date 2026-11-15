package com.fukuda.intecrate.common.item.food;

import net.minecraft.world.food.FoodProperties;

public class CakeFoodProperties {
    public static final FoodProperties SLICED_CAKE = (new FoodProperties.Builder())
            .nutrition(2)
            .saturationModifier(0.28f)
            .fast()
            .alwaysEdible()
            .build();
}
