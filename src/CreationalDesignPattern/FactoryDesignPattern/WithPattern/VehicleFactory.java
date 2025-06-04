package CreationalDesignPattern.FactoryDesignPattern.WithPattern;

public class VehicleFactory {

    public static Vehicle createVehicle(String vehicleType) {
        if(vehicleType.equals("Car")) {
            return new Car();
        }
        else if(vehicleType.equals("Truck")) {
            return new Truck();
        }
        else {
            return new Bike();
        }
    }

}
