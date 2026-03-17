package Lab5.models;

import Lab5.contracts.Product;

public class PromotionalProduct implements Product {

    private String name;

    public PromotionalProduct(String name) {
        this.name = name;
    }

    @Override
    public String getProductDescription() {
        return "Promotional product, " + name;
    }
}
