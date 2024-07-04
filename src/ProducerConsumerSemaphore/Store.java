package ProducerConsumerSemaphore;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Store {
    private int maxSize;
//    private List<Object> items;
    private ConcurrentLinkedQueue<Object> items;  //concurrent data structure means they will not allow threads to play with them
        //means even multiple threads are playing with them thing wont go wrong
    Store(int maxSize) {
        this.maxSize = maxSize;
        this.items = new ConcurrentLinkedQueue<>();
    }

    public int getMaxSize() {
        return maxSize;
    }
    public ConcurrentLinkedQueue<Object> getItem() {
        return items;
    }
    public void addItem() {
        System.out.println("Producer production item, current size is: " + this.items.size());
        this.items.add(new Object());
    }
    public void removeItem() {
        System.out.println("Consumer consuming item, current size is: " + this.items.size());
        this.items.remove();
    }
}
