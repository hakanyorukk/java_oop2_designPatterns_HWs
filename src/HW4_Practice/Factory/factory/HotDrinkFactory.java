package HW4_Practice.Factory.factory;

import HW4_Practice.Factory.contracts.HotDrink;
import HW4_Practice.Factory.enums.HotDrinkType;
import HW4_Practice.Factory.models.Espresso;
import HW4_Practice.Factory.models.Latte;
import HW4_Practice.Factory.models.TurkishCoffee;

public class HotDrinkFactory {
    public static HotDrink createHotDrink(HotDrinkType type, double price) {
        switch(type) {
            case LATTE : return new Latte(price);
            case TURKISH_COFFEE: return new TurkishCoffee(price);
            case ESPRESSO: return new Espresso(price);
            default: return null;
        }
    }
}
