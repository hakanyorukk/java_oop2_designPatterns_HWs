package HW6.decorators;

import HW6.drinks.Drink;

public abstract class DrinkDecorator extends Drink {

    private Drink drink;  // aggregation

    public DrinkDecorator(Drink drink) {
        super(drink.getName(), drink.getVolume(), drink.getDrinkPreparation());
        this.drink = drink;
    }

    @Override
    public String getDescription() {
        return drink.getDescription();
    }
}
