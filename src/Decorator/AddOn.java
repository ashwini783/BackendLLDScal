package Decorator;

public abstract class AddOn implements Beverage {

    Beverage b;
    public AddOn(Beverage b) {
        this.b = b;
    }
}
