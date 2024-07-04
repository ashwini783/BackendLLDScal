package introToThread;

public class HelloWorldPrint implements Runnable {

    public void run() { //whatever I write inside run function that will be executed by multiple threads
//        @Override
        System.out.println(Thread.currentThread().getName()+ " Hello World");
    }
}
