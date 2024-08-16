package Decorator;

public class Milk extends AddOn{

    public Milk(Beverage b) {
        super(b);  //used to initailize the member of parent as its parent is abstract
    }

    @Override
    public int getCost() {
        return this.beverage.getCost();
//        return 2
    }

    @Override
    public void getDesc() {
        this.beverage.getDesc();
        System.out.println("Milk");
    }
}
