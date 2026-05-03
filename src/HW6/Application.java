package HW6;

import lab7.HW6.decorators.ExtraDecorator;
import lab7.HW6.drinks.ColdDrink;
import lab7.HW6.drinks.Drink;
import lab7.HW6.drinks.HotDrink;
import lab7.HW6.enums.ExtraType;
import lab7.HW6.models.OnSitePreparation;
import lab7.HW6.models.TakeoutPreparation;

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
