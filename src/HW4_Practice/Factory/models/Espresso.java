package HW4_Practice.Factory.models;

import HW4_Practice.Factory.contracts.HotDrink;

public class Espresso implements HotDrink {
    private double price;

    public Espresso(double price) {
        this.price = price;
    }

    @Override
    public String displayHotDrink() {
        return "Espresso, price: " + price;
    }

}
