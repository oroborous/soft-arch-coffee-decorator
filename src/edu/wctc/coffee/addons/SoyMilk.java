package edu.wctc.coffee.addons;


import edu.wctc.coffee.Beverage;
import edu.wctc.coffee.Addon;

public class SoyMilk extends Addon {

    public SoyMilk(Beverage beverage) {
        // Call the constructor in the superclass (Addon)
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double getCost() {
        return beverage.getCost() + 1.15;
    }
}
