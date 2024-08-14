package Builder;

public class Client {
    public static void main(String[] args) {
//        Student st=new Student()

//        StudentBuilder sb = new StudentBuilder();
//        sb.setAge(25);
//        sb.setBatch("Apr 23");
//        sb.setGradYear(2025);
//
//        Student st=new Student(sb);


//        StudentBuilder sb=Student.getBuilder();
//        sb.setAge(25);
//        sb.setBatch("Apr 23");
//        sb.setGradYear(2025);
//
//        Student st=new Student(sb);

        Student s=Student.getBuilder()
                .setAge(25)
                .setBatch("Nov Advanced")
                .setGradYear(2025)
                .build(); //build method create and return new Student object


    }
}
