package BehaviouralDesignPattern.StateDesignPattern.WithPattern;

public class YellowState implements TrafficLightState{

    @Override
    public void next(TrafficLightContext trafficLightContext) {
        trafficLightContext.setState(new GreenState());
    }

    @Override
    public String getColor() {
        return "Yellow";
    }
}
