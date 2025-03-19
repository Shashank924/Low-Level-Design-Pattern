package StrategyPattern.CodeWithoutStrategyPattern;

public class GoodsVehicle implements Vehicle {

    @Override
    public void drive() {
        System.out.println("Normal drive");
    }
}
