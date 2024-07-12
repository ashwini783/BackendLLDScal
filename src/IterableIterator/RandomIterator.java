package IterableIterator;

import java.util.Iterator;

public class RandomIterator implements Iterator<Integer> {
    int index;
    Numbers numbers;

    public RandomIterator(Numbers numbers) {
        this.numbers = numbers;
        index = 0;
    }

    //checks if there is any element to be traversed
    @Override
    public boolean hasNext() {
        while(index<numbers.list.size()){
           if(numbers.list.get(index)%5==0){
               return true;
           }
           index++;
        }
        return index!=numbers.list.size();
    }

    //return the next element
    @Override
    public Integer next() {
        return numbers.list.get(index++);
    }

}
