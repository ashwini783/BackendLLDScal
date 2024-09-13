package SOLID.BirdV5;

public class Eagle extends BirdV5 implements Flyable{
    private FlyingBehaviour fh;
     Eagle(FlyingBehaviour fh) {
        this.fh = fh;
    }
    @Override
    void makeSound() {
          System.out.println("eagle sounding");
    }

    @Override
    public void fly() {
        System.out.println("Hiii");
        fh.makeFly();
    }
}
