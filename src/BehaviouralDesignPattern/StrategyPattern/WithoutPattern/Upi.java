package BehaviouralDesignPattern.StrategyPattern.WithoutPattern;

public class Upi implements PaymentMethod{
    @Override
    public void processPayment() {
        System.out.println("Making Payment via Upi");
    }
}
