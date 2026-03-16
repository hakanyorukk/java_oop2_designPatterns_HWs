package HW4.models;

import HW4.contracts.Cuisine;

public class BulgarianCuisine implements Cuisine {
    String recipeName;
    public BulgarianCuisine (  String recipeName) {
        this.recipeName = recipeName;
    }
    @Override
    public String getRecipe(String recipeName) {
        return "Bulgarian Cuisine: " + recipeName;
    }
}
