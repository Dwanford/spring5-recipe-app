package com.dwanford.spring5recipeapp.services;

import com.dwanford.spring5recipeapp.commands.RecipeCommand;
import com.dwanford.spring5recipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();
    Recipe findById(Long id);

    RecipeCommand saveRecipeCommand(RecipeCommand command);

    RecipeCommand findCommandById(Long id);

    void deleteById(Long id);

}
