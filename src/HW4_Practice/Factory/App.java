package HW4_Practice.Factory;

import HW4_Practice.Factory.contracts.HotDrink;
import HW4_Practice.Factory.enums.HotDrinkType;
import HW4_Practice.Factory.factory.HotDrinkFactory;

public class App {
    public static void main(String[] args) {
        HotDrink drink1 = HotDrinkFactory.createHotDrink(HotDrinkType.ESPRESSO, 1);
        HotDrink drink2 = HotDrinkFactory.createHotDrink(HotDrinkType.TURKISH_COFFEE, 10.2);

        System.out.println(drink1.displayHotDrink());
        System.out.println(drink2.displayHotDrink());
    }
}
