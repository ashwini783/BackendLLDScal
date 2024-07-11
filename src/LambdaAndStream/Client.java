package LambdaAndStream;

import java.util.*;
import java.util.stream.Stream;

import static java.util.List.*;

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

        Thread t4=new Thread(()->{
            System.out.println("Hey");
        });
//        or

        Thread t5=new Thread(()->System.out.println("Hello"));

        //Streams
        List<Integer>l1= Arrays.asList(1,2,3,4,8,9);
        Stream<Integer> st=l1.stream();
        // for each is terminal operation
        st.forEach((elem)->System.out.println(elem)); //once this is done st.stream is lost i.e we cant use that stream any more
//        st.forEach((elem)->{
//            System.out.println(elem);
//        });
//        st.limit(4);  will give error hence again created sream because we cant use limit() after forEach()

        //there is no change in original collection because of what we are doing in stream
        l1.stream().limit(3).forEach((elem)->System.out.println(elem));
        //limit is intermediate operation, and it doesnt kill the operation


        Stream<Integer>st1=l1.stream().limit(4);
        st1.forEach((elem)->System.out.println(elem));


    }
}
