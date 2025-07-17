package BehaviouralDesignPattern.StrategyPattern.WithPattern;

public class Upi implements PaymentStrategy {
    @Override
    public void processPayment() {
        System.out.println("Making Payment via Upi");
    }
}
