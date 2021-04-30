package edu.wctc.coffee.beverages;

import edu.wctc.coffee.Beverage;

public class Decaf extends Beverage {

    @Override
    public String getDescription() {
        return "Decaf";
    }

    @Override
    public double getCost() {
        return 2.99;
    }

}
