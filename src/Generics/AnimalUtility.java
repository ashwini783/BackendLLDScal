package Generics;

import java.util.List;

public class AnimalUtility {

//    public static void printAnimalNames(List<Dog> animals){
//        for(Animal animal:animals){
//            System.out.println(animal.name);
//        }
//    }

    //Generic method with UpperBound on Animal class
//    public static <T extends Animal> List<T> printAnimalNames(List<T> animals) {
//        for (Animal animal : animals) {
//            System.out.println(animal.name);
//        }
//    return animals;
//    }

    //above method and this method  is same only syntax is different
    public static void printAnimalNames(List<? extends Animal> animals) {  //wildcards
        for (Animal animal : animals) {
            System.out.println(animal.name);
        }
    }
}
