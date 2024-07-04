package AdderSubtractorDeadLock;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Adder implements Callable<Void> {
     Value v;
    private Lock lock;
    private Lock lock2;
    public Adder(Value v, Lock lock, Lock lock2) {
        this.v = v;
        this.lock = lock;
        this.lock2 = lock2;
    }

    public Void call() throws Exception {
        for (int i = 0; i <=1000; i++) {
            lock2.lock();
            lock.lock();
            System.out.println("Adder "+i);
            this.v.value+=i;
            lock2.unlock();
            lock.unlock();

        }
        return null;
    }
}
