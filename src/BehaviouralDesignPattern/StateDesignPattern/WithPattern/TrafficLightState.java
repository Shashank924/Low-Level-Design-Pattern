package BehaviouralDesignPattern.StateDesignPattern.WithPattern;

public interface TrafficLightState {
    void next(TrafficLightContext trafficLightContext);
    String getColor();
}
