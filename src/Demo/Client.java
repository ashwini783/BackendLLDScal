package Demo;

import com.sun.xml.internal.ws.api.message.Header;

import java.util.Scanner;
import java.util.concurrent.*;

public class Client {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService es= Executors.newCachedThreadPool();
          for(int i=1;i<=100;i++){
              Runnable r=new PrintNum(i);
                  es.execute(r);
//              PrintHelloWorld c=new PrintHelloWorld(i);
//              Future<Void> f=es.submit(c);
//              f.get();

          }


    }
}
