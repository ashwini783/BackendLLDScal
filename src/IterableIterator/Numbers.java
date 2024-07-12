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
//              way one
//            Iterator<Integer>rr=new RandomIterator(constructorData);
//            return rr

            //second way
            Iterator<Integer>rr=new Iterator<Integer>() { //iterator has two function
                int index=0;
                @Override
                public boolean hasNext() {
                    return index<list.size();
//                    return false;
                }

                @Override
                public Integer next() {
                    return list.get(index++);
//                    return 0;
                }
            };
            return rr;
    }
}
