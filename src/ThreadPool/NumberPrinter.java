package ThreadPool;

public class NumberPrinter implements Runnable {
    int num;
    public NumberPrinter(int num) {
        this.num=num;
    }
    public void run() {
        System.out.println(num+ " "+Thread.currentThread().getName());
    }
}
