package Collections;
import java.util.*;
public class Client {
    public static void main(String[] args) {

        //List, Set and Queue

        //1. List--> duplicates allowed, order maintained, dynamic array and TC is O(1)
        List<String>list1=new ArrayList<>(); // ArrayList implements List Interface

       //2.Linked List--> TC is O(n) ,used in discontinuos memory, not thread safe
       List<Integer>list2=new LinkedList<>();

       //3. Vector-->Synchronised that's why its synchronised
        List<Double>list3=new Vector<>();

        //Comparable and Comparator


        List<Student>stList=new ArrayList<>();
        stList.add(new Student(25,65.0,"Mohit",10.0));
        stList.add(new Student(22,75.0,"Nishant",100.0));
        stList.add(new Student(27,85.0,"Rohan",90.0));

//        Collections.sort(stList); //for comparable
        Collections.sort(stList, new StudentPSPComparator()); //for comparator

    }
}
