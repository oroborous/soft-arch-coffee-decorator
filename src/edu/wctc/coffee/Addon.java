package edu.wctc.coffee;

/**
 * This is the abstract component decorator class in the Decorator pattern.
 * All concrete add-on classes (like Mocha and SoyMilk) are subclasses of
 * Addon. They are also sub-sub-classes of Beverage because Addon extends
 * Beverage.
 */
public abstract class Addon extends Beverage {
    /**
     * This class contains the Beverage object it's decorating.
     * This object may be an instance of Beverage, or of another Addon.
     */
    protected Beverage beverage;

    public Addon(Beverage beverage) {
        this.beverage = beverage;
    }
}
