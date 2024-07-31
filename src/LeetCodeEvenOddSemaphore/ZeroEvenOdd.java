package LeetCodeEvenOddSemaphore;

import java.util.concurrent.Semaphore;
import java.util.function.IntConsumer;

public class ZeroEvenOdd {
    private int n;
    private Semaphore zero;
    private Semaphore even;
    private Semaphore odd;

    public ZeroEvenOdd(int n) {
        this.n = n;
        zero = new Semaphore(1);// permit is 1 because I want zero to execute
        even = new Semaphore(0);  //no permit to even and odd
        odd = new Semaphore(0);
    }
    public void zero(IntConsumer printNumber) throws InterruptedException {
        for (int i = 0; i <=n; i++) {
            zero.acquire();
            printNumber.accept(0); // to print number its function
            if(i%2==0){
                even.release();
            }
            else{
                odd.release();
            }
        }
    }
    public void even(IntConsumer printNumber) throws InterruptedException {
        for (int i = 2; i <=n; i=i+2) {
            even.acquire();
            printNumber.accept(i);
            zero.release();
        }
    }
    public void odd(IntConsumer printNumber) throws InterruptedException {
        for (int i = 1; i <=n; i=i+2) {
             odd.acquire();
             printNumber.accept(i);
             zero.release();
        }
    }
}
