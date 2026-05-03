package HW6.drinks;

import lab7.HW6.contracts.DrinkPreparation;

public class ColdDrink extends Drink {

    public ColdDrink(String name, int volume, DrinkPreparation drinkPreparation) {
        super(name, volume, drinkPreparation);
    }

    @Override
    public String getDescription() {
        return "Cold drink: " + getName() + ", " + getVolume() + "ml, " + getDrinkPreparation().prepare();
    }
}
