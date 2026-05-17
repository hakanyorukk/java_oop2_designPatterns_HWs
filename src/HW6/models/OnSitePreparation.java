package HW6.models;

import HW6.contracts.DrinkPreparation;

public class OnSitePreparation implements DrinkPreparation {

    @Override
    public String prepare() {
        return "prepared for on-site consumption";
    }
}
