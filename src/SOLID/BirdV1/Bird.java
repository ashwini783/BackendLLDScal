package SOLID.BirdV1;

public abstract class Bird {

    void eat(){
        System.out.println("eating");
    }
    abstract void fly();
    abstract void makeSound();
}
