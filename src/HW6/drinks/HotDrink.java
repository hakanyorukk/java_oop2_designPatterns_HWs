package HW6.drinks;

import HW6.contracts.DrinkPreparation;

public class HotDrink extends Drink {

    public HotDrink(String name, int volume, DrinkPreparation drinkPreparation) {
        super(name, volume, drinkPreparation);
    }

    @Override
    public String getDescription() {
        return "Hot drink: " + getName() + ", " + getVolume() + "ml, " + getDrinkPreparation().prepare();
    }
}
