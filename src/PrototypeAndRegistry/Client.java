package PrototypeAndRegistry;

public class Client {

    static void doSomething(Student s){
        Student st2=s.Copy();
//        Student st2=new Student(s);

    }

    public static void fillRegistry(StudentRegistry studentRegistry){
        Student st=new Student();
        st.batch="Nov23 Advanced";
        studentRegistry.register("Student",st);

        IntellgentStudent st2=new IntellgentStudent();
        studentRegistry.register("IntellgentStudent",st2);
    }
    public static void main(String[] args) {
        Student st=new Student();
        Student st2=st.Copy();
        IntellgentStudent ist=new IntellgentStudent();
        doSomething(ist);

        StudentRegistry studentRegistry=new StudentRegistry();
        fillRegistry(studentRegistry);

        Student st33=studentRegistry.get("IntellgentStudent");
        Student st3=studentRegistry.get("Student"); // to get the prototype from registry
    }
}
