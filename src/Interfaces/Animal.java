package Interfaces;

public abstract class  Animal {
    private int id;
    int noOfLegs;
    String Type;

    void eat(){
        System.out.println(" Animal eating");
    }
    abstract void walk1();
}
