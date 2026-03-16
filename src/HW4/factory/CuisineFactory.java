package HW4.factory;

import HW4.contracts.Cuisine;
import HW4.contracts.CuisineCreator;

public class CuisineFactory {
    public static Cuisine createCuisine(CuisineCreator creator, String recipeName) {
        return creator.createCuisine(recipeName);
    }
}
