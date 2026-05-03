package HW6.drinks;

import lab7.HW6.contracts.DrinkPreparation;

public abstract class Drink {

    private String name;
    private int volume;
    private DrinkPreparation drinkPreparation;  // bridge

    public Drink(String name, int volume, DrinkPreparation drinkPreparation) {
        this.name = name;
        this.volume = volume;
        this.drinkPreparation = drinkPreparation;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public DrinkPreparation getDrinkPreparation() {
        return drinkPreparation;
    }

    public abstract String getDescription();
}
