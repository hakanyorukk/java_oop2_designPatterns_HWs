package HW6;

import HW6.decorators.ExtraDecorator;
import HW6.drinks.ColdDrink;
import HW6.drinks.Drink;
import HW6.drinks.HotDrink;
import HW6.enums.ExtraType;
import HW6.models.OnSitePreparation;
import HW6.models.TakeoutPreparation;

public class Application {

    public static void main(String[] args) {
        Drink coffee = new HotDrink("Coffee", 250, new OnSitePreparation());
        System.out.println(coffee.getDescription());

        coffee = new ExtraDecorator(coffee, ExtraType.MILK);
        coffee = new ExtraDecorator(coffee, ExtraType.SUGAR);
        coffee = new ExtraDecorator(coffee, ExtraType.HONEY);
        System.out.println(coffee.getDescription());

        Drink lemonade = new ColdDrink("Lemonade", 400, new TakeoutPreparation());
        lemonade = new ExtraDecorator(lemonade, ExtraType.ICE);
        lemonade = new ExtraDecorator(lemonade, ExtraType.SYRUP);
        System.out.println(lemonade.getDescription());
    }
}
