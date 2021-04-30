package edu.wctc.coffee.addons;


import edu.wctc.coffee.Beverage;
import edu.wctc.coffee.Addon;

public class Mocha extends Addon {

    public Mocha(Beverage beverage) {
        // Call the constructor in the superclass (Addon)
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double getCost() {
        return beverage.getCost() + .25;
    }

}
