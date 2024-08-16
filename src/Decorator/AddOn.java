package Decorator;

public abstract class AddOn implements Beverage {
//I dont want to instantiate AddOn so it is abstract
    Beverage beverage;
    public AddOn(Beverage b) {
        this.beverage = b;
    }
}
