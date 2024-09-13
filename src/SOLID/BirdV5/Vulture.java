package SOLID.BirdV5;

public class Vulture extends BirdV5 implements Flyable{
     FlyingBehaviour fh;
     public Vulture(FlyingBehaviour fh) {
         this.fh = fh;
     }
    @Override
    void makeSound() {

    }

    @Override
    public void fly() {
       fh.makeFly();
    }
}
