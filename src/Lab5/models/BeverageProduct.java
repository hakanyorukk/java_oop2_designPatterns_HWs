package Lab5.models;

import Lab5.contracts.Product;

public class BeverageProduct implements Product {

    private String name;

    public BeverageProduct(String name) {
        this.name = name;
    }


    @Override
    public String getProductDescription() {
        return "Beverage Product, " + name;
    }
}
