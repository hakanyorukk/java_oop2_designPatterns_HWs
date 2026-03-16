package HW4.models;

import HW4.contracts.Cuisine;

public class ItalianCuisine implements Cuisine {
    String recipeName;

    public ItalianCuisine(String recipeName) {
        this.recipeName = recipeName;
    }
    @Override
    public String getRecipe(String recipeName) {
        return "Italian Cuisine: " + recipeName;
    }

}
