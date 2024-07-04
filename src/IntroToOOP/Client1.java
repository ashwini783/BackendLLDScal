package IntroToOOP;

public class Client1 {

    public static void main(String[] args) {
        Student1 x=new Student1();

        System.out.println(x.psp);  //0.0

//
//        Student1 y=new Student1(name:"Temp");
//
        Student1 y=new Student1("Pritam");
        y.setName("Ashu");
        System.out.println(y.name);  //ashu


        //copy constructor
        Student1 y1=x;   //y1=address of x eg address of x=30k
        x.name="Test";
        System.out.println(y1.name);  //test
        Student1 z=new Student1(x);  // here 30k got passed
        x.name="changed again";
        System.out.println(z.name);  //test

        Student1 s1=new Student1("Shubham",25);
        Student1 copy1=new Student1(s1);

    }
}
