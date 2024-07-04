package MultiThreadMergeSort;
import java.util.*;
import java.util.concurrent.*;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
       List<Integer>list=Arrays.asList(8,1,2,9,6,3,7,5);
        ExecutorService es= Executors.newCachedThreadPool();  //it will start the task
        Sorter sorter=new Sorter(list,es);

        Future<List<Integer>> listFuture=es.submit(sorter);

        List<Integer> ans=listFuture.get();
        System.out.println(ans);

    }
}
