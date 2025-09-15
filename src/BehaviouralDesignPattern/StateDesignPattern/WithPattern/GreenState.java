package BehaviouralDesignPattern.StateDesignPattern.WithPattern;

public class GreenState implements TrafficLightState{

    @Override
    public void next(TrafficLightContext trafficLightContext) {
        trafficLightContext.setState(new RedState());
    }

    @Override
    public String getColor() {
        return "Green";
    }
}
