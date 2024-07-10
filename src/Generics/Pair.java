package Generics;

public class Pair<V,S> {
    V first;
    S second;
 public Pair(V first, S second) {
     this.first = first;
     this.second = second;
 }
 public  Pair(){

 }
    public V getFirst(){
        return first;
    }
    public S getSecond(){

     return second;
    }
    public void setFirst(V data){

     this.first = data;
    }

    //this generic method is independent of generic class , its limited to method only we can have any data type for this method
    public static <T> T  doSomething(T val){  //generic datatype for withing function only
     System.out.println(val);
     return val;
    }
//    public static  void  doSomething(V val1, S val2){   // V and S not available here as its generic method
//        System.out.println(val);
//    }

    public <Z> Z doAgain(Z val1, V val2){

     return val1;
    }


}
