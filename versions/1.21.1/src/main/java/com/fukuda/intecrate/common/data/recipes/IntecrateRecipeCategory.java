package com.fukuda.intecrate.common.data.recipes;

public enum IntecrateRecipeCategory {
    CRATES("crate"),
    BASKETS("baskets"),
    BARRELS("barrels"),
    BUCKETS("buckets"),
    BAGS("bags"),
    BOXES("boxes"),
    CAKES("cakes");

    public final String recipeFolderName;

    IntecrateRecipeCategory(String recipeFolderName) {
        this.recipeFolderName = recipeFolderName;
    }

    public String getFolderName() {
        return this.recipeFolderName;
    }
}