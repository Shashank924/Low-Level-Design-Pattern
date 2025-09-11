package BehaviouralDesignPattern.MediatorDesignPattern.WithPattern;

public class Main {
    public static void main(String[] args) {
        Mediator mediator = new AuctionHouseMediator();

        Bidder bidder1 = new Bidder("A" , mediator);
        Bidder bidder2 = new Bidder("B" , mediator);
        Bidder bidder3 = new Bidder("C" , mediator);

        mediator.registerBidder(bidder1);
        mediator.registerBidder(bidder2);
        mediator.registerBidder(bidder3);

        bidder1.placeBid(300);
        bidder2.placeBid(403);

    }
}
