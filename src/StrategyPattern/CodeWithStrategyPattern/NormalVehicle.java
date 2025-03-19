package StrategyPattern.CodeWithStrategyPattern;

import StrategyPattern.CodeWithStrategyPattern.Strategy.NormalDriveStrategy;

public class NormalVehicle extends Vehicle{
    NormalVehicle() {
        super(new NormalDriveStrategy());
    }
}
