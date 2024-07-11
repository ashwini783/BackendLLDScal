package Collections;

public class Student implements Comparable<Student> {
    int age;
    double psp;
    String name;
    double attendence;

    Student(int age, double psp, String name, double attendence) {
        this.age = age;
        this.psp = psp;
        this.name = name;
        this.attendence = attendence;
    }

    @Override
    public int compareTo(Student o) {
        //if this object to come first return -1, other object to come first else return 0
        if(this.age > o.age){
            return -1;
        }
        else if(this.age < o.age){
            return 1;
        }
        return 0;
    }

    //smarter way of writing compareTo
//    public int compareTo(Student o){
//        return o.age - this.age;
//    }
}
