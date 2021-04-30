package edu.wctc.coffee.beverages;


import edu.wctc.coffee.Beverage;

public class Espresso extends Beverage {

    @Override
    public String getDescription() {
        return "Espresso";
    }

    @Override
    public double getCost() {
        return 3.99;
    }

}
