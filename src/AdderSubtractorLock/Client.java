package AdderSubtractorLock;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import java.util.*;
import java.util.concurrent.locks.ReentrantLock;

public class Client {

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        Lock lock=new ReentrantLock();

        Value v=new Value();
        Adder a=new Adder(v,lock);
        Subtractor s=new Subtractor(v,lock);

        ExecutorService es= Executors.newCachedThreadPool();
       Future<Void> futureAdder= es.submit(a);   //returns future
       Future<Void>futureSub= es.submit(s);
        futureAdder.get();
        futureSub.get();
        System.out.println(v.value);

    }
}
