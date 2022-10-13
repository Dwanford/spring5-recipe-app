package dwanford.springframework.spring5recipeapp.services;

import dwanford.springframework.spring5recipeapp.commands.RecipeCommand;
import dwanford.springframework.spring5recipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();
    Recipe findById(Long id);

    RecipeCommand saveRecipeCommand(RecipeCommand command);

}
