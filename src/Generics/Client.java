package Generics;


import java.util.*;

public class Client {
    public static void main(String[] args) {
        Pair<Integer,Integer>p1=new Pair<>(5,5);
        p1.setFirst(5);
        System.out.println(p1.getFirst());
        Pair<String,Integer>p2=new Pair<>("Hello",5);
        p2.setFirst("hello");
        System.out.println(p2.getFirst());

        List<Pair<Integer,Integer>> list=new ArrayList<>();

        //raw types , it's before JAVA5, generic cam in JAVA5
        //i.e without specifying type parameter (raw type) this is allowed due to backward compatability
        //here p has no data type mentioned explicitely they make it Object type internally
        Pair p=new Pair();
//        HashMap map=new HashMap<>();--> HashMap<Object,Object>=new HashMap()?
        //map.put(1,2)
        //map.put("ashu",2)   but its not good practice
        // when you are not passing anything its replaced by Object

        Pair.doSomething(5);


        //
         List<Dog>dogs=new ArrayList<>();
         dogs.add(new Dog("tommy"));
        List<Animal>animals=new ArrayList<>();
        animals.add(new Dog("Tom"));
        animals.add(new Dog("Tom2"));

        AnimalUtility.printAnimalNames(animals);
        AnimalUtility.printAnimalNames(dogs);
    }
}
