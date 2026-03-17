package Lab5.models;

import Lab5.contracts.Product;

public class FoodProduct implements Product {

    private String name;

    public FoodProduct(String name) {
        this.name = name;
    }

    @Override
    public String getProductDescription() {
        return "Food product, " + name;
    }
}
