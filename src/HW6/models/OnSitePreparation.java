package HW6.models;

import lab7.HW6.contracts.DrinkPreparation;

public class OnSitePreparation implements DrinkPreparation {

    @Override
    public String prepare() {
        return "prepared for on-site consumption";
    }
}
