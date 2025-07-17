package BehaviouralDesignPattern.ObserverPattern.WithPattern;

public class PushNotificationSubscriber implements Subscriber{

    private String device;

    public PushNotificationSubscriber(String device) {
        this.device = device;
    }

    @Override
    public void updateVideo() {
        System.out.println("Sending notification to device " + device);
    }
}
