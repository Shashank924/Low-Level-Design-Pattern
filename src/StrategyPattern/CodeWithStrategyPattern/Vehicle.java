package StrategyPattern.CodeWithStrategyPattern;
import StrategyPattern.CodeWithStrategyPattern.Strategy.DriveStrategy;

public class Vehicle {
    public DriveStrategy driveStrategy;
    Vehicle(DriveStrategy obj)
    {
        this.driveStrategy = obj;
    }
}
