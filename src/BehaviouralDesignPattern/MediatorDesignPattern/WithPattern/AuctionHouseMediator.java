package BehaviouralDesignPattern.MediatorDesignPattern.WithPattern;

import java.util.ArrayList;
import java.util.List;

public class AuctionHouseMediator implements Mediator{
    private List<Bidder> bidders = new ArrayList<>();

    @Override
    public void registerBidder(Bidder bidder) {
        bidders.add(bidder);
    }

    @Override
    public void placeBid(int amount , Bidder currBidder) {
        for(Bidder bidder : bidders) {
            if(bidder != currBidder) {
                bidder.receiveBid(amount , currBidder);
            }
        }
    }
}
