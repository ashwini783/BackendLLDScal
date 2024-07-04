package AdderSubtractorSyncLock;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Subtractor implements Callable<Void> {
     Value v;

    Subtractor(Value v){
        this.v = v;

    }

    public Void call() throws Exception{
        for(int i=0;i<=1000;i++){
            synchronized(v) {
                System.out.println("Subtractor " + i);
                this.v.value = this.v.value - i;  //not an atomic operation i.e its not happening in one step
            }
        }
        return null;
    }
}
