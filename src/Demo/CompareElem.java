package Demo;

import java.util.Arrays;
import java.util.Comparator;

public class CompareElem {
    public static void main(String[] args) {
        int arr[]={9,2,4,1,3,7,5,8};
        Integer Arr[]=new Integer[arr.length];
        for(int i=0;i<arr.length;i++){
            Arr[i]=arr[i];
        }
        Comparator<Integer> c=(x,y)->{
            return x-y;
        };
        Arrays.sort(Arr,c);
        System.out.println(Arrays.toString(Arr));
    }
}
