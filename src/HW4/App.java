package HW4;

import HW4.contracts.Cuisine;
import HW4.factory.BulgarianCuisineFactory;
import HW4.factory.CuisineFactory;
import HW4.factory.ItalianCuisineFactory;
import HW4.factory.MexicanCuisineFactory;


public class App {
    public static void main(String[] args) {
        Cuisine firstCuisine = CuisineFactory.createCuisine(new BulgarianCuisineFactory(), "Banitsa");
        Cuisine secondCuisine = CuisineFactory.createCuisine(new ItalianCuisineFactory(), "Pizza");
        Cuisine thirdCuisine = CuisineFactory.createCuisine(new MexicanCuisineFactory(), "Taco");

        System.out.println(firstCuisine.getRecipe("Banitsa"));
        System.out.println(secondCuisine.getRecipe("Pizza"));
        System.out.println(thirdCuisine.getRecipe("Taco"));
    }
}
