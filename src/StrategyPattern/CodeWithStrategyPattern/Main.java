package StrategyPattern.CodeWithStrategyPattern;

public class Main {
    public static void main(String[] args) {
        Vehicle veh = new OffRoadVehicle();
        veh.driveStrategy.drive();
    }
}
