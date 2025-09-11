package BehaviouralDesignPattern.MediatorDesignPattern.WithPattern;

public class Bidder {

    private String name;
    private int bid;
    private Mediator mediator;

    public Bidder(String name , Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void placeBid(int amount) {
        this.bid = amount;
        mediator.placeBid(amount , this);
    }

    public void receiveBid(int amount , Bidder bidder) {
        System.out.println("Bidder : " + bidder.name + " Placed bid of " + amount);
    }
}
