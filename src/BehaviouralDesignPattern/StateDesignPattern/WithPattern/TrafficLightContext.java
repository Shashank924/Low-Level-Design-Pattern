package BehaviouralDesignPattern.StateDesignPattern.WithPattern;

public class TrafficLightContext {
    private TrafficLightState trafficLightState;

    public TrafficLightContext() {
        this.trafficLightState = new RedState();
    }

    public void getState() {
        System.out.println("Current state is : " + trafficLightState.getColor());
    }

    public void next() {
        trafficLightState.next(this);
    }

    public void setState(TrafficLightState trafficLightState) {
        this.trafficLightState = trafficLightState;
    }
}
