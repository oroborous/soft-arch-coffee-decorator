package edu.wctc.coffee;

/**
 * This is the abstract component class in the Decorator pattern.
 * All other classes are subclasses of Beverage at some level.
 */
public abstract class Beverage {

    public abstract String getDescription();

    public abstract double getCost();
}
