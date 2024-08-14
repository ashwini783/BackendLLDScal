package Decorator;

public class Milk extends AddOn{
    public Milk(Beverage b) {
        super(b);
    }

    @Override
    public int getCost() {
        return 0;
    }

    @Override
    public void getDesc() {

    }
}
