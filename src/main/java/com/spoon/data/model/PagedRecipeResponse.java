/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.spoon.data.model;

import java.util.List;

/**
 *
 * @author User
 */
public record PagedRecipeResponse(
        List<RecipeSearchResult> recipes,
        int totalResults,
        int currentPage,
        int pageSize,
        int totalPages
        ) {

    public PagedRecipeResponse(List<RecipeSearchResult> recipes, int totalResults, int currentPage, int pageSize) {
        this(
                recipes,
                totalResults,
                currentPage,
                pageSize,
                (int) Math.ceil((double) totalResults / pageSize)
        );
    }
}
