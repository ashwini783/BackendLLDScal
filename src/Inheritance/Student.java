package Inheritance;

public class Student extends User{
    private String batch;
    double psp;
    int age;

    Student(){
//        batch="Free batch";
//        psp=1;
//        this("free batch", 1);
        //when I use this keyword ,and I pass some arguments if there is any constructor matching the that syntax , that
        // constructor is called, i.e it will call below  Student(String batch, double psp) constructor
        // this() calls the another constructor in same class, and this() has to be first line
        // this is called telescoping of constructor
    }
    Student(String batch){
        this();
        this.batch=batch;
//        psp=1;
    }

    Student(String batch, double psp){
          this(batch);
        this.psp = psp;
    }
    Student(String batch, double psp, int age){
        this(batch,psp);
        this.age=age;
    }
    void attendClass(){
        this.name="Ashwini";
        System.out.println("Attending Class");
    }
}
