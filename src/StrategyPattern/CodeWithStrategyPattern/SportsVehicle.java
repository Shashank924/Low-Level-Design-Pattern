package StrategyPattern.CodeWithStrategyPattern;

import StrategyPattern.CodeWithStrategyPattern.Strategy.SportsDriveStrategy;

public class SportsVehicle extends Vehicle{
    SportsVehicle() {
        super(new SportsDriveStrategy());
    }
}
