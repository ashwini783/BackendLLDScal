package introToThread;

public class HelloWorldPrint2 extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName()+ " Hello World");
    }
}
