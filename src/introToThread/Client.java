package introToThread;

public class Client {
    public static void main(String[] args) {
        HelloWorldPrint h=new HelloWorldPrint();
        for(int i=0;i<100;i++){
            Thread t=new Thread(h);
            h.run();
            t.start();
        }

        for(int i=1;i<=1000;i++){
            NumberPrinter numberPrinter = new NumberPrinter(i);
            Thread thread = new Thread(numberPrinter);
            thread.start();
        }

        Thread t=new HelloWorldPrint2();
         t.start();
    }
}
