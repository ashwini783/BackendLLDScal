package IterableIterator;

import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        for(int i:list){
            System.out.println(i);
        }

        try {
            Numbers numbers = new Numbers(list);
        }
        finally {
             System.out.println("finally");
        }

//        for(int i=0;i<list.size();i++){
//            if(numbers.iterator().hasNext()){
//                System.out.println(numbers.iterator().next());
//            }
//        }
//        for(int i:numbers){
//            System.out.println(i);
//        }
    }
}
