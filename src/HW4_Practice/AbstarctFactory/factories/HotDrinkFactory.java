package HW4_Practice.AbstarctFactory.factories;

import HW4_Practice.AbstarctFactory.contracts.HotDrink;
import HW4_Practice.AbstarctFactory.contracts.HotDrinkCreator;

public class HotDrinkFactory {
    public static HotDrink createHotDrink(HotDrinkCreator creator, double price) {
        return creator.createHotDrink(price);
    }
}
