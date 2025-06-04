package CreationalDesignPattern.FactoryDesignPattern.WithoutPattern;

public class Truck implements Vehicle{
    @Override
    public void drive() {
        System.out.println("Driving Truck");
    }
}
