package LambdaAndStream;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
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
        List<Integer>l1= Arrays.asList(1,10,3,4,8,9);
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


        List<Student>list1=new ArrayList<>();
        list1.add(new Student(22,40.0,"ash",44.0));
        list1.add(new Student(32,33.3,"abc",88.0));
        list1.add(new Student(33,45.8,"sima",65.9));
        list1.stream().filter(elem-> {
            return elem.psp>20;
        }).forEach(elem->System.out.println(elem.name+" "+elem.psp));

        //Collect : Terminal method
       List<Student>l3= list1.stream().filter(elem->{
            return elem.psp>20;
        }).collect(Collectors.toList());  //collect is just to collect the data
       System.out.println(l3);

       //map: Intermediate method, map operation is changing every element
        List<Integer>l4=l1.stream().filter(elem->{
            return elem%2==0;
        }).map(elem->{
            return elem*elem;
        }).collect(Collectors.toList());
        System.out.println(l4);

        //distinct: Intermediate

       List<Integer>l5= l1.stream().
                distinct().filter(elem->{
                   return elem%2==0;
                }).map(elem->{
                    return elem*elem;
                }).sorted((o1,o2)->{ return o2-o1;}).collect(Collectors.toList());
             System.out.println(l5);

             //findFirst->Terminal operation
        //optional menas -->since we are working many operations it might happen we have nothing left
          Optional<Integer>op1= l1.stream().distinct().filter(elem-> {return elem%2==0; }).
           map(elem->{return elem*elem;}).findFirst();
          if(op1.isPresent()){
              System.out.println(op1.get());
          }

          //reduce-->terminal function:: it tries to convert your whole stream into single element based
        //on some logic
        List<Integer>l6=Arrays.asList(3,2,1);
        Integer x=  l6.stream().reduce(0,(cur_sum,elem)->{ //identity is default value or initial value
              return cur_sum+=elem;
          });
        System.out.println(x);

        //flatmap-->to convert 2dlist into single list, flatmap returns stream
        //flat map combine all the stream to one

        List<List<Integer>>list2d=Arrays.asList(
                Arrays.asList(1,2,3),
                Arrays.asList(4,5),
                Arrays.asList(6,7,8,9)
        );
        List<Integer>ans1=list2d.stream().flatMap(elem->{
            return elem.stream();
        }).collect(Collectors.toList());

        List<Integer>ans2=list2d.stream().flatMap(elem->{
            return elem.stream().map(elem1->elem1*elem1);
        }).collect(Collectors.toList());

    }
}
