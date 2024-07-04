package Interfaces;
import java.util.ArrayList;
import java.util.*;
public class Client {
    public static void main(String[] args) {
//        Runner r1=new Dog();
//        Runner r2=new RoboticDog();
//        r1.run();
//        r2.run();

        List<Runner> runners=new ArrayList<>();

        runners.add(new Dog());
        runners.add(new Dog());
        runners.add(new RoboticDog());

        for (Runner r : runners) {
//            r.run();
            r.walk();
        }

        Animal a=new Dog();
        a.walk1();
    }
}
