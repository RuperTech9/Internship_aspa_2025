package patterns.factorymethod.main;

import patterns.factorymethod.Vehicle;
import patterns.factorymethod.VehicleFactory;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle1 = VehicleFactory.createVehicle("car");
        vehicle1.run();

        Vehicle vehicle2 = VehicleFactory.createVehicle("motorcycle");
        vehicle2.run();
    }

}
