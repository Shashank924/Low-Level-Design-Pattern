package CreationalDesignPattern.FactoryDesignPattern.WithoutPattern;

public class Car implements Vehicle{
    @Override
    public void drive() {
        System.out.println("Driving Car");
    }
}
