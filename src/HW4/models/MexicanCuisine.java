package HW4.models;

import HW4.contracts.Cuisine;

public class MexicanCuisine implements Cuisine {
    String recipeName;

    public MexicanCuisine(String recipeName) {
        this.recipeName = recipeName;
    }
    @Override
    public String getRecipe(String recipeName) {
        return "Mexican Cuisine: " + recipeName;
    }
}
