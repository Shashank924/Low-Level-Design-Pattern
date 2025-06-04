package CreationalDesignPattern.FactoryDesignPattern.WithPattern;

public class Car implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Driving Car");
    }
}
