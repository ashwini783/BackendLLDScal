package AdderSubtractorAtomic;

import java.util.concurrent.Callable;

public class Subtractor implements Callable<Void> {
     Value v;
    Subtractor(Value v){
        this.v = v;
    }

    public Void call() throws Exception{
        for(int i=0;i<=1000;i++){
            this.v.value.addAndGet(-i);
        }
        return null;
    }
}
