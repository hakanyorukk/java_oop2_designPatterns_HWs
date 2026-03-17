package Lab5.factories;

import Lab5.contracts.Product;
import Lab5.contracts.ProductCreator;
import Lab5.models.BeverageProduct;

public class BeverageProductFactory implements ProductCreator {
    @Override
    public Product create(String name) {
        return new BeverageProduct(name);
    }
}
