package BehaviouralDesignPattern.StateDesignPattern.WithoutPattern;

public class TrafficLight {

    private String color;

    public TrafficLight() {
        color = "RED";
    }

    public void next() {
        if(color.equals("RED")) {
            color = "YELLOW";
        } else if(color.equals("YELLOW")) {
            color = "GREEN";
        } else if(color.equals("GREEN")) {
            color = "RED";
        }
    }

    // If further new states are added then the code will
    // be difficult to maintain.

    public String getColor() {
        return this.color;
    }


}
