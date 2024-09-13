package SOLID.BirdV5;

public class Client {
    public static void main(String[] args) {

        FlyingBehaviour fh=new FlyHigh();
        Eagle e=new Eagle(fh);
        e.fly();

        FlyingBehaviour fh1 =new FlyLow();
        Pigeon p=new Pigeon(fh1);
        p.fly();
    }
}
