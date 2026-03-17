package Lab5;

import Lab5.factories.BeverageProductFactory;
import Lab5.factories.FoodProductFactory;
import Lab5.factories.PromotionalProductFactory;
import Lab5.singleton.Brochure;

public class Application {
    public static void main(String[] args) {
        // brochure -> singleton

        Brochure brochure = Brochure.getInstance();
        brochure.addProduct(new BeverageProductFactory(), "Raki");
        brochure.addProduct(new FoodProductFactory(), "Pizza");
        brochure.addProduct(new PromotionalProductFactory(), "Chocolate");

        System.out.println(brochure.getBrochureCatalog());
    }
}
