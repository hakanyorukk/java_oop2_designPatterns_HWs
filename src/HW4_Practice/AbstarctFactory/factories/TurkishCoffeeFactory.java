package HW4_Practice.AbstarctFactory.factories;


import HW4_Practice.AbstarctFactory.contracts.HotDrink;
import HW4_Practice.AbstarctFactory.contracts.HotDrinkCreator;
import HW4_Practice.AbstarctFactory.models.TurkishCoffee;

public class TurkishCoffeeFactory implements HotDrinkCreator {

    @Override
    public HotDrink createHotDrink(double price) {
        return new TurkishCoffee(price);
    }

}
