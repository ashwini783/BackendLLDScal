package Demo;
import java.util.*;
import java.util.concurrent.Callable;

public class PrintNumber implements Callable<Void> {
       int n;
       public PrintNumber(int n) {
           this.n=n;
       }
    @Override
    public Void call() throws Exception {
        System.out.println(Thread.currentThread().getName() +" "+n);
        return null;
    }
}
