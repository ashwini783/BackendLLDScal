package PrototypeAndRegistry;

public class Student implements Prototype<Student> {
    int id;
    String name;
    String batch;

    Student(){

    }
    public Student(Student  st) {
        this.id = st.id;
        this.name = st.name;
        this.batch = st.batch;
    }


    @Override
    public Student Copy() { //if I cann copy method it should return copy of same Student Object
        Student st=new Student(this);   //I should get the copy of same Student Object
        return st;
    }
}
