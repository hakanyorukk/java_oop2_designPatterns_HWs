package HW4_Practice.Factory.models;

import HW4_Practice.Factory.contracts.HotDrink;

public class Latte implements HotDrink {

    private double price;

    public Latte(double price) {
        this.price = price;
    }

    @Override
    public String displayHotDrink() {
        return "Latte, price: " + price;
    }
}
