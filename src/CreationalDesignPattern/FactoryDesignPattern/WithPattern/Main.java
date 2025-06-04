package CreationalDesignPattern.FactoryDesignPattern.WithPattern;

public class Main {

    public static void main(String[] args) {
        Vehicle car = VehicleFactory.createVehicle("Car");
        car.drive();
        Vehicle bike = VehicleFactory.createVehicle("Bike");
        bike.drive();
        Vehicle truck = VehicleFactory.createVehicle("Truck");
        truck.drive();

        // Now even if the logic of creating the object will change in future we only have to make
        // changes in vehicleFactory class
    }
}
