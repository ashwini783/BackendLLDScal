package ThreadPool;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Client {

    public static void main(String[] args) {
//        ExecutorService es= Executors.newFixedThreadPool(10); // created 10 threads

        ExecutorService es=Executors.newCachedThreadPool();
        for(int i=0;i<=1000000;i++){
            NumberPrinter x1=new NumberPrinter(i);
            es.execute(x1);
        }
    }
}
