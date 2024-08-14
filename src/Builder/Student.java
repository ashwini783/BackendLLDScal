package Builder;

public class Student {
   final int age;
    final String name;
   final String batch;
    final int gradYear;
    String course;
    private Student(StudentBuilder builder) {
//        if(builder.age<10){
//            throw new IllegalArgumentException("Age must be at least 10");
//        }
//        if(builder.gradYear>2024){
//            throw new IllegalArgumentException("Grad Year must be smaller than 2024");
//        }
        if(builder.course!=null){  //if someone adds the course
            this.course = builder.course;
        }
        else{
            this.course = "Academy";
        }
        this.age=builder.age;
        this.gradYear=builder.gradYear;
        this.name=builder.name;
        this.batch=builder.batch;
    }

    // we will have many builders for differant classes , I will ask Student you give me builder that I need to create u
        static StudentBuilder getBuilder(){
        return new StudentBuilder();
     }

    public static class StudentBuilder {
        int age;
        String name;
        String batch;
        int gradYear;
        String course;
        public StudentBuilder setAge(int age){
            this.age = age;
            return this;
        }
        public StudentBuilder setName(String name){
            this.name = name;
            return this;
        }
        public StudentBuilder setBatch(String batch){
            this.batch = batch;
            return this;
        }
        public StudentBuilder setGradYear(int gradYear){
            this.gradYear = gradYear;
            return this;
        }
        public StudentBuilder setCourse(String course){
            this.course = course;
            return this;
        }

        public Student build(){  // we can do validation in build method
            if(this.age<10){
                throw new IllegalArgumentException("Age must be at least 10");
            }
            if(this.gradYear>2024){
                throw new IllegalArgumentException("Grad Year must be smaller than 2024");
            }
            return new Student(this);
        }
    }

}
