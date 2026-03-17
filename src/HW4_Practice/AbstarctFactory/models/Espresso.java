package HW4_Practice.AbstarctFactory.models;

import HW4_Practice.AbstarctFactory.contracts.HotDrink;

public class Espresso implements HotDrink {

    private double price;

    public Espresso(double price) {
        this.price = price;
    }

    @Override
    public String displayDrinks() {
        return "This is Espresso, price: " + price;
    }
}
