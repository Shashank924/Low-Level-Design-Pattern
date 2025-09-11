package BehaviouralDesignPattern.MediatorDesignPattern.WithPattern;

public interface Mediator {
    void registerBidder(Bidder bidder);
    void placeBid(int amount , Bidder bidder);
}
