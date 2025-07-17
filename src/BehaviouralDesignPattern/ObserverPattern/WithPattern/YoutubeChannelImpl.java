package BehaviouralDesignPattern.ObserverPattern.WithPattern;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannelImpl implements YoutubeChannel{
    private List<Subscriber> subscribers;
    private List<String> videos;

    public YoutubeChannelImpl() {
        subscribers = new ArrayList<>();
        videos = new ArrayList<>();
    }

    @Override
    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void uploadVideo(String video) {
        videos.add(video);
        notifySubscriber();
    }

    @Override
    public void notifySubscriber() {
        for(Subscriber subscriber : subscribers) {
            subscriber.updateVideo();
        }
    }
}
