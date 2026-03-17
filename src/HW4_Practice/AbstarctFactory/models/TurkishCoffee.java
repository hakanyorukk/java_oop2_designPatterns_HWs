package HW4_Practice.AbstarctFactory.models;

import HW4_Practice.AbstarctFactory.contracts.HotDrink;

public class TurkishCoffee implements HotDrink {
    private double price;

    public TurkishCoffee(double price) {
        this.price = price;
    }
    @Override
    public String displayDrinks() {
        return "Turkish Coffee, price: " + price;
    }
}
