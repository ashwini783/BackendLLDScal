package IntroToOOP;

public class Student {
//     private String name;
     String name;
     int age;
     double psp;
     String batch;

     public Student(){
          name="Venkat";
          age=18;
          batch="xyz";
     }
     public Student(String name){
          this.name=name;
     }


     void print(){
         System.out.println("Name: " + name);
     }
     void setName(String name){
          this.name=name;
     }
     String getName(){  // to access the private variables
          return this.name;
     }
}
