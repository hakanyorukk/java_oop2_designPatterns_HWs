package Lab5.factories;

import Lab5.contracts.Product;
import Lab5.contracts.ProductCreator;

public class ProductFactory {
   public static Product createProduct(ProductCreator creator, String name) {
        return creator.create(name);
    }
}
