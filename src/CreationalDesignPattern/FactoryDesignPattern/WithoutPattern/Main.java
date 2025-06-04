package CreationalDesignPattern.FactoryDesignPattern.WithoutPattern;

public class Main {

    public static void main(String[] args) {
        Vehicle car = new Car(); // hardcoded object creation
        car.drive();             // not good and maintainable code as if in future the logic of creating
        Vehicle bike = new Bike();// object changes then we have to make changes at all occurrence where the
        bike.drive();             // object is getting created.
        Vehicle truck = new Truck();
        truck.drive();
    }
}
