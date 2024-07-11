package LambdaAndStream;

import java.util.*;

public class Client {
    public static void main(String[] args) {

        //we are able to implement the interface without creating separate class
        Runnable r=new Runnable() { //anonymous class
            @Override
            public void run() {
                System.out.println("Hello World");
            }
            public void Test(){
                System.out.println("Hello Test");
            }
        };

        Thread t1=new Thread(r);

        Thread t2=new Thread(){
            @Override
            public void run() {
                System.out.println("Hello Thread");
            }
        };
        Comparator<Integer>comp=new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return 0;
            }
        };

        SampleInterface s1=new SampleInterface() {
            @Override
            public void fun() {

            }

            @Override
            public void bun() {

            }
        };


        //Lambda Expressions : valid only in functional interfaces
        Runnable r1=()-> { // no need to override run() method
            System.out.println("Hello Runnable Lambda");
        };
        Thread t3=new Thread(r1);

        Comparator<Integer>c1=(o1,o2)->{  //no need to specify datatype of o1 and o2
            return o1-o2;
        };

    }
}
