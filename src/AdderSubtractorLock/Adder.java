package AdderSubtractorLock;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Adder implements Callable<Void> {
     Value v;
    private Lock lock;
    public Adder(Value v, Lock lock) {
        this.v = v;
        this.lock = lock;

    }

    public Void call() throws Exception {
//        lock.lock();
        for (int i = 0; i <=1000; i++) {
            lock.lock();
            System.out.println("Adder "+i);
            this.v.value+=i;
            lock.unlock();
        }
        lock.unlock();
        return null;
    }
}
