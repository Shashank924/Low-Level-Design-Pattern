package BehaviouralDesignPattern.ObserverPattern.WithPattern;

public interface YoutubeChannel {
    void addSubscriber(Subscriber subscriber);
    void removeSubscriber(Subscriber subscribe);
    void notifySubscriber();
}
