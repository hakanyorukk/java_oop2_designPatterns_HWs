package HW6.decorators;

import lab7.HW6.drinks.Drink;
import lab7.HW6.enums.ExtraType;

public class ExtraDecorator extends DrinkDecorator {

    private ExtraType extraType;

    public ExtraDecorator(Drink drink, ExtraType extraType) {
        super(drink);
        this.extraType = extraType;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", " + extraType + " added";
    }
}
