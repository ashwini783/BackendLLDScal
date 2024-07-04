package Interfaces;

public interface Runner {
      int x=4; // any data member in interface is only public static and final by default
    void run();

    default void walk(){ // will get overriden
        System.out.println(" Interface runner walk");
    }

    //static methods are added in interface for utility purpose only
    static void doSomething(){
        System.out.println(" Interface runner doSomething");
    }
}
