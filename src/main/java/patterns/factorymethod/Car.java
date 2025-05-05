package patterns.factorymethod;

public class Car implements Vehicle {
    @Override
    public void run(){
        System.out.println("Creating car");
    }
}
