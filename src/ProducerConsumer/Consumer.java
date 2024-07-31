package ProducerConsumer;

public class Consumer implements Runnable {
    private Store store;

    Consumer(Store store) {
        this.store = store;
    }
    public void run() {
        while (true) { //till the time consumer keep on consuming
            synchronized (store) {
            if(store.getItem().size()>0) {
                store.removeItem();
            }
            }
        }
    }
}
