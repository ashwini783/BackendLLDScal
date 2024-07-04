package AdderSubtractorDeadLock;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Subtractor implements Callable<Void> {
     Value v;
     private Lock lock;
     private Lock lock2;
    Subtractor(Value v, Lock lock, Lock lock2){
        this.v = v;
        this.lock = lock;
        this.lock2 = lock2;
    }

    public Void call() throws Exception{
        for(int i=0;i<=1000;i++){

            lock.lock();
            lock2.lock();
            System.out.println("Subtractor "+i);
            this.v.value=this.v.value-i;
            lock2.unlock();
             lock.unlock();
        }
        return null;
    }
}
