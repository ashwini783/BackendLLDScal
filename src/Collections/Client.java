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

    }
}
