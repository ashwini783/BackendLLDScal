package IntroToOOP;

public class Student1 {

    public String name;
    int age;
    double psp;
    String batch;
     Exam exam;
    public Student1(){
        name="Venkat";
        age=18;
        batch="xyz";
    }
    public Student1(String name, int age){
        this.name=name;
        this.age=age;
        this.exam=new Exam(1,90);
    }
    public Student1(String name){
        this.name=name;
    }

    public Student1(Student1 other){  // other=30k
        this.name=other.name;
        this.age=other.age;
        this.batch=other.batch;
        this.psp=other.psp;
        this.exam= new Exam(other.exam);
    }
    void setName(String name){
        this.name=name;
    }
    String getName(){
        return this.name;
    }
}
