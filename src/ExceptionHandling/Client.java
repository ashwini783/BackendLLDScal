package ExceptionHandling;

import java.sql.SQLException;

public class Client {
//    public static void test(int a){
//        test(a*a);
//    }
//    public static void main(String[] args) throws ClassNotFoundException, SQLException, RandomException1 {
    public static void main(String[] args) { //if we use try catch then no need to throw exception

        //try catch is used to handle the exception, main parent is handling the exception
        try{
            Student.doSomething(4);
        }catch (ClassNotFoundException e){

        }catch (SQLException e){

        }catch (RandomException1 e){

        }catch (Exception e){ //it is parent exception class it handles all kind of exception
            System.out.println("Exception: " + e);
        }finally {
            System.out.println("Finally Executed");
        }
//        test(5);
    }
}
