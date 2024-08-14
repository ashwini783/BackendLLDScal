package Demo;

import java.util.concurrent.Callable;

public class PrintHelloWorld implements Callable<Void> {
    int n;
    PrintHelloWorld(int n) {
        this.n = n;
    }
    public Void call() throws Exception {
        System.out.println(n+" "+" Hello World "+Thread.currentThread().getName());
        return null;
    }


}
