package StrategyPattern.CodeWithStrategyPattern;

import StrategyPattern.CodeWithStrategyPattern.Strategy.SportsDriveStrategy;

public class OffRoadVehicle extends Vehicle{
    OffRoadVehicle() {
        super(new SportsDriveStrategy());
    }
}
