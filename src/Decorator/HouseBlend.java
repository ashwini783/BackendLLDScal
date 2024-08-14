package Decorator;

public class HouseBlend implements Beverage{
    @Override
    public int getCost() {
        return 150;
    }

    @Override
    public void getDesc() {
        System.out.println("HouseBlend "+getCost());
    }
}
