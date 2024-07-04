package MultiThreadMergeSort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Sorter implements Callable<List<Integer>> {
    List<Integer> arrayToSort;
    ExecutorService executor;
    Sorter(List<Integer> arrayToSort, ExecutorService executor) {
        this.arrayToSort = arrayToSort;
        this.executor = executor;
    }


    public List<Integer> call() throws Exception {


        if(arrayToSort.size() == 1) {
            return arrayToSort;
        }
        int mid=arrayToSort.size()/2;
        List<Integer>leftArray=new ArrayList<>();
        List<Integer>rightArray=new ArrayList<>();

        for(int i=0;i<mid;i++){
            leftArray.add(arrayToSort.get(i));
        }
        for(int i=mid;i<arrayToSort.size();i++){
            rightArray.add(arrayToSort.get(i));
        }

        Sorter leftArraySorter=new Sorter(leftArray,executor);
        Sorter rightArraySorter=new Sorter(rightArray,executor);

//        ExecutorService es= Executors.newFixedThreadPool(2); //fixed thread pool of size 2
       Future<List<Integer>>leftFuture=  executor.submit(leftArraySorter);  //task is scheduled
       Future<List<Integer>>rightFuture = executor.submit(rightArraySorter);

      List<Integer>soretedLeftArray= leftFuture.get();
      List<Integer>sortedRightArray= rightFuture.get();  //left half and right half are getting sorted parallely, not recursively

      int i=0;
      int j=0;
      List<Integer>sortedArray=new ArrayList<>();
      while(i<soretedLeftArray.size() && j<sortedRightArray.size()){
          if(soretedLeftArray.get(i)<sortedRightArray.get(j)){
              sortedArray.add(soretedLeftArray.get(i));
              i++;
          }
          else{
              sortedArray.add(sortedRightArray.get(j));
              j++;
          }
      }
           while(i<soretedLeftArray.size()){
               sortedArray.add(soretedLeftArray.get(i));
               i++;
           }
           while(j<sortedRightArray.size()){
               sortedArray.add(sortedRightArray.get(j));
               j++;
           }
        return sortedArray;
    }
}
