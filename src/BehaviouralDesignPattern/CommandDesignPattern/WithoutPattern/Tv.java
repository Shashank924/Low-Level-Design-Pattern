package BehaviouralDesignPattern.CommandDesignPattern.WithoutPattern;

public class Tv {

    public void turnOn() {
        System.out.println("Tv turning on");
    }

    public void turnOff() {
        System.out.println("Tv turning off");
    }

    public void adjustVolume() {
        System.out.println("Adjusting volume");
    }

    public void switchChannel() {
        System.out.println("Changing Channel");
    }
}
