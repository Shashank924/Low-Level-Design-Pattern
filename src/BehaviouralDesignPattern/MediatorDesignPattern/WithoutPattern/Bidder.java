package BehaviouralDesignPattern.MediatorDesignPattern.WithoutPattern;

public class Bidder {

    private String name;
    private int bid;

    public Bidder(String name) {
        this.name = name;
    }

    public void placeBid(int amount, Bidder[] bidders) {
        this.bid = amount;

        for(Bidder bidder : bidders) {
            if(bidder != this) {
                bidder.receiveBid(amount , this);
            }
        }
    }

    // Too much work is done by the bidder itself
    // It is responsible for notifying all the bidders about the bid

    public void receiveBid(int amount , Bidder bidder) {
        System.out.println("Bidder : " + bidder.name + " Placed bid of " + amount);
    }
}
