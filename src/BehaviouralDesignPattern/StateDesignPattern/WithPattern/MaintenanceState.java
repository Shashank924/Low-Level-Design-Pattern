package BehaviouralDesignPattern.StateDesignPattern.WithPattern;

public class MaintenanceState implements TrafficLightState{

    @Override
    public void next(TrafficLightContext trafficLightContext) {
        trafficLightContext.setState(new RedState());
    }

    @Override
    public String getColor() {
        return "Blinking";
    }
}
