package BehaviouralDesignPattern.StateDesignPattern.WithPattern;

public class RedState implements TrafficLightState{

    @Override
    public void next(TrafficLightContext trafficLightContext) {
        trafficLightContext.setState(new YellowState());
    }

    @Override
    public String getColor() {
        return "Red";
    }
}
