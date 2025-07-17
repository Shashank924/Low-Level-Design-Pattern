package BehaviouralDesignPattern.ObserverPattern.WithPattern;

public class EmailSubscriber implements Subscriber{

    private String email;

    public EmailSubscriber(String email) {
        this.email = email;
    }

    @Override
    public void updateVideo() {
        System.out.println("Sending notification to Email " + email);
    }
}
