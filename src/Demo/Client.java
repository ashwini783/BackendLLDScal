package Demo;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
   public static void main(String[] args) throws ExecutionException, InterruptedException {
       ExecutorService es= Executors.newFixedThreadPool(20);
       for(int i=1;i<=100;i++){
           PrintNumber num=new PrintNumber(i);


           Future<Void> fs=es.submit(num);
           fs.get();
       }
   }
}
