package BehaviouralDesignPattern.StrategyPattern.WithPattern;

public class DebitCard implements PaymentStrategy {
    @Override
    public void processPayment() {
        System.out.println("Making Payment via Debit Card");
    }
}
