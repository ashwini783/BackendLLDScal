package Interfaces;

public class Dog extends Animal implements Runner, RunnerPlus {

    @Override  // its safety check, its checking your function is overriden or not
    public void run() {
//        System.out.println(x);
        System.out.println("Dog is running");
    }
    public void walk(){
        System.out.println("Dog is walking");
    }

    public void walk1(){
        System.out.println("Dog is walking 1");
    }
}
