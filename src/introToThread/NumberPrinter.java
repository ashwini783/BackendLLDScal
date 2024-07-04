package introToThread;

public class NumberPrinter implements Runnable {
     int number;

     NumberPrinter(int number) {
         this.number = number;
     }
    public void run() {
        try {
            Thread.sleep(20000);
        }
        catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(number+ " "+Thread.currentThread().getName());
    }
}
