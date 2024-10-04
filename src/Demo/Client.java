package Demo;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
interface Vehicle{
   String describe();
}
class Car implements Vehicle{

   @Override
   public String describe() {
      return "Car";
   }
}
class LuxuryCar implements Vehicle{
   private Vehicle vehicle;
   public LuxuryCar(Vehicle vehicle) {
      this.vehicle = vehicle;
   }
   @Override
   public String describe() {
      return "Luxry"+ describe();
   }
}
public class Client {
   public static void main(String[] args) throws ExecutionException, InterruptedException {

   }
}
