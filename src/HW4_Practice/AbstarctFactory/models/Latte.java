package HW4_Practice.AbstarctFactory.models;

import HW4_Practice.AbstarctFactory.contracts.HotDrink;

public class Latte implements HotDrink {
    private double price;

    public Latte(double price) {
        this.price = price;
    }

    @Override
    public String displayDrinks() {
        return "Latte, price: " + price;
    }
}
