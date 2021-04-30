package edu.wctc.coffee.beverages;

import edu.wctc.coffee.Beverage;

public class DarkRoast extends Beverage {

    @Override
    public String getDescription() {
        return "Dark Roast";
    }

    @Override
    public double getCost() {
        return 2.99;
    }

}
