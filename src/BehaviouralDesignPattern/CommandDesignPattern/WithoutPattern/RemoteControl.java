package BehaviouralDesignPattern.CommandDesignPattern.WithoutPattern;

public class RemoteControl {
    private Tv tv;

    RemoteControl(Tv tv) {
        this.tv = tv;
    }

    public void pressOnButton() {
        tv.turnOn();
    }

    public void pressOffButton() {
        tv.turnOff();
    }

    public void pressVolumeButton() {
        tv.adjustVolume();
    }

    public void pressChannelButton() {
        tv.switchChannel();
    }

    public void pressOnButtonThenSwitchChannel() {
        tv.turnOn();
        tv.switchChannel();
    }

    // If any more feature is added then we have to modify the
    // Remote Control Class
}
