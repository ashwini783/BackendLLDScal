package AdderSubtractorSyncLock;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client {

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        Value v=new Value();
        Adder a=new Adder(v);
        Subtractor s=new Subtractor(v);

        ExecutorService es= Executors.newCachedThreadPool();
       Future<Void> futureAdder= es.submit(a);   //returns future
       Future<Void>futureSub= es.submit(s);
        futureAdder.get();
        futureSub.get();
        System.out.println(v.value);  // we get different value every time
                                       //because Add and Sub operation is not an atomic

    }
}
