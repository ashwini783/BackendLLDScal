package IterableIterator;

import java.util.*;
public class Numbers implements Iterable<Integer> {
    List<Integer>list;

    public Numbers(List<Integer>list) {
        this.list = list;
    }

    @Override
    public Iterator<Integer> iterator() {
//
//              way one to write iterator
//            Iterator<Integer>rr=new RandomIterator(constructorData);
//            return rr

            //second way, anomous class as it has two abstract method we cant use lambda function
            Iterator<Integer>rr=new Iterator<Integer>() { //iterator has two function
                int index=0;
                @Override
                public boolean hasNext() {  // hasNext is to tell whether the next data memeber is available or not
                    return index<list.size();
//                    return false;
                }

                @Override
                public Integer next() {  //just return the element
                    return list.get(index++);
//                    return 0;
                }
            };
            return rr;
    }
}
