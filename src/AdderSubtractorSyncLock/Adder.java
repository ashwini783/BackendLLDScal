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
            synchronized (v) {  // value is the shared object that's why we apply lock on it. its bit faster because no need to create object
                System.out.println("Adder " + i);
                this.v.value+=i;
            }
        }
        return null;
    }
}
