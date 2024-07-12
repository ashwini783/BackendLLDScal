package IterableIterator;

import java.util.*;
public class Numbers implements Iterable<Integer> {
    List<Integer>list;

    public Numbers(List<Integer>list) {
        this.list = list;
    }

    @Override
    public Iterator<Integer> iterator() {
//        Iterator<Integer>iterator=new Iterator<Integer>() {}:

    }
}
