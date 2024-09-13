package SOLID.V4;

public abstract class Pigeon extends BirdV4 implements Flyable {

    FlyLow fh=new FlyLow();
    @Override
   public void fly() {
       fh.flyLow();
    }

    @Override
    void makeSound() {

    }
}
