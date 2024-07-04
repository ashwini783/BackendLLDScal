package AdderSubtractorSyncLock;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Adder implements Callable<Void> {
     Value v;

    public Adder(Value v) {
        this.v = v;

    }

    public Void call() throws Exception {
        for (int i = 0; i <=1000; i++) {
            synchronized (v) {
                System.out.println("Adder " + i);
                this.v.value+=i;
            }
        }
        return null;
    }
}
