package HW4_Practice.Factory.models;

import HW4_Practice.Factory.contracts.HotDrink;

public class TurkishCoffee implements HotDrink {

    private double price;

    public TurkishCoffee(double price) {
        this.price = price;
    }

    @Override
    public String displayHotDrink() {
        return "Turkish coffee, price: " + price;
    }

}
