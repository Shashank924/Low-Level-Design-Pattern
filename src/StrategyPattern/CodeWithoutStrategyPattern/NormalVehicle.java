package StrategyPattern.CodeWithoutStrategyPattern;

public class NormalVehicle implements Vehicle{

    @Override
    public void drive() {
        System.out.println("Normal Drive");
    }
}
