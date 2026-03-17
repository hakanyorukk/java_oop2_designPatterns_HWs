package Lab5.factories;

import Lab5.contracts.Product;
import Lab5.contracts.ProductCreator;
import Lab5.models.PromotionalProduct;

public class PromotionalProductFactory implements ProductCreator {

    @Override
    public Product create(String name) {
        return new PromotionalProduct(name);
    }
}
