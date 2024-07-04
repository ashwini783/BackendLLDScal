package AdderSubtractorSyncMethod;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Subtractor implements Callable<Void> {
     Value v;

    Subtractor(Value v){
        this.v = v;

    }

    public Void call() throws Exception{
        for(int i=0;i<=1000;i++){
           this.v.decrementBy(i);
        }
        return null;
    }
}
