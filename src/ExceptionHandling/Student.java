package ExceptionHandling;

import java.sql.SQLException;

public class Student {
//    static int doSomething(int x) throws ClassNotFoundException, SQLException, RandomException1 {
     static int doSomething(int x) throws Exception {

//        return 1/x;

        if(x==0){
            throw new ArithmeticException();  //runtime exception hence no need to mention in code
        }
        else if(x==1){
            throw new ClassNotFoundException(); //coming out of Exception class , so need to mention in method
        }
        else if(x==2){
            throw new SQLException();  //coming out of Exception class , so need to mention in method
        }
        else if(x==3){
            throw new NullPointerException();  // runtime exception
        }
        else if(x==4){
            throw new RandomException();
        }
        else if(x==5){
            throw new RandomException1();
        }
        return 1;
    }
}
