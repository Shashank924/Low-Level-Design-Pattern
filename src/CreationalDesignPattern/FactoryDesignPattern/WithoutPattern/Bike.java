package CreationalDesignPattern.FactoryDesignPattern.WithoutPattern;

public class Bike implements Vehicle{

    @Override
    public void drive() {
        System.out.println("Driving Bike");
    }
}
