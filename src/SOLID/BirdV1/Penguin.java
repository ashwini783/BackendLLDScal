package SOLID.BirdV1;

public class Penguin extends Bird{
    @Override
    void fly(){
        //either leave it empty or through error
        //Liskov's : you should not have even this method beacuse penguin doesnt fly
    }

    @Override
    void makeSound() {

    }
}
