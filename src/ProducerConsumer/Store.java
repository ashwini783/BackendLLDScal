package ProducerConsumer;
import java.util.*;
public class Store {
    private int maxSize;
    private List<Object> items;

    Store(int maxSize) {
        this.maxSize = maxSize;
        this.items = new ArrayList<>();
    }

    public int getMaxSize() {
        return maxSize;
    }
    public List<Object> getItem() {
        return items;
    }
    public void addItem() {
        System.out.println("Producer production item, current size is: " + this.items.size());
        this.items.add(new Object());
    }
    public void removeItem() {
        System.out.println("Consumer consuming item, current size is: " + this.items.size());
        this.items.remove(this.items.size() - 1);
    }
}
