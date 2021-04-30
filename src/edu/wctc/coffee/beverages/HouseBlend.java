package edu.wctc.coffee.beverages;


import edu.wctc.coffee.Beverage;

public class HouseBlend extends Beverage {

    @Override
    public String getDescription() {
        return "House Blend";
    }

    @Override
    public double getCost() {
        return 2.99;
    }

}
