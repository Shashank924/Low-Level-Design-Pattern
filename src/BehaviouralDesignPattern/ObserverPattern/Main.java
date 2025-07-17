package BehaviouralDesignPattern.ObserverPattern;

import BehaviouralDesignPattern.ObserverPattern.WithPattern.EmailSubscriber;
import BehaviouralDesignPattern.ObserverPattern.WithPattern.PushNotificationSubscriber;
import BehaviouralDesignPattern.ObserverPattern.WithPattern.YoutubeChannelImpl;

public class Main {
    public static void main(String[] args) {
        YoutubeChannelImpl channel = new YoutubeChannelImpl();

        channel.addSubscriber(new EmailSubscriber("123@gmail.com"));
        channel.addSubscriber(new PushNotificationSubscriber("Motorola"));

        channel.uploadVideo("Hello World");
    }
}
