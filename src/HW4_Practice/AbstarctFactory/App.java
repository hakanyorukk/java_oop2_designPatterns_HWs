package HW4_Practice.AbstarctFactory;

import HW4_Practice.AbstarctFactory.contracts.HotDrink;
import HW4_Practice.AbstarctFactory.factories.HotDrinkFactory;
import HW4_Practice.AbstarctFactory.factories.TurkishCoffeeFactory;

public class App {
    public static void main(String[] args) {
        // contracts -> HotDrink   HotDrinkCreator
        // models -> Latte  TurkishCoffee, Espresso
        // factories -> LatteFactory  , TurkishFactory,  EspressoFactory

        HotDrink drink1 = HotDrinkFactory.createHotDrink(new TurkishCoffeeFactory(), 12.0);
        System.out.println(drink1.displayDrinks());

    }
}
