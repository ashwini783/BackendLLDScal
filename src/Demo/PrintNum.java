package Demo;

public class PrintNum implements Runnable{
    int n;
    public PrintNum(int n){
        this.n = n;
    }
    @Override
    public void run() {
//        for(int i=1;i<=10;i++){
            System.out.println(n+" "+Thread.currentThread().getName());
//        }
    }
}
