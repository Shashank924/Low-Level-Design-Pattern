package BehaviouralDesignPattern.ObserverPattern.WithoutPattern;

import java.util.List;

public class YoutubeChannel {
    private String name;
    private List<String> subscribers;
    private List<String> videos;

    public YoutubeChannel(String name) {
        this.name = name;
    }

    public void addSubscriber(String subscriberName) {
        subscribers.add(subscriberName);
    }

    public void uploadVideo(String video) {
        videos.add(video);
        notifySubscribers();
    }

    public void notifySubscribers() {

        for(String subscriber : subscribers) {
            System.out.println("Notification of new video");
        }
    }
}
