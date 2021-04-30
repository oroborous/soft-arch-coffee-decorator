package edu.wctc.coffee.addons;


import edu.wctc.coffee.Beverage;
import edu.wctc.coffee.Addon;

public class WhippedCream extends Addon {

    public WhippedCream(Beverage beverage) {
        // Call the constructor in the superclass (Addon)
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whipped Cream";
    }

    @Override
    public double getCost() {
        return beverage.getCost() + .50;
    }

}
