package BehaviouralDesignPattern.MediatorDesignPattern.WithoutPattern;

public class Main {
    public static void main(String[] args) {
        Bidder[] bidders = new Bidder[4];
        bidders[0] = new Bidder("A");
        bidders[1] = new Bidder("B");
        bidders[2] = new Bidder("C");
        bidders[3] = new Bidder("D");

        bidders[1].placeBid(200 , bidders);
        bidders[2].placeBid(300 , bidders);
    }
}
