package HW4.factory;

import HW4.contracts.Cuisine;
import HW4.contracts.CuisineCreator;
import HW4.models.BulgarianCuisine;

public class BulgarianCuisineFactory implements CuisineCreator {

    @Override
    public Cuisine createCuisine(String recipeName) {
        return new BulgarianCuisine(recipeName);
    }
}
