package BehaviouralDesignPattern.StateDesignPattern.WithPattern;

public class Main {
    public static void main(String[] args) {
        TrafficLightContext trafficLightContext = new TrafficLightContext();

        trafficLightContext.getState();
        trafficLightContext.next();
        trafficLightContext.getState();
        trafficLightContext.setState(new MaintenanceState());
        trafficLightContext.getState();
        trafficLightContext.next();
        trafficLightContext.getState();
    }
}
