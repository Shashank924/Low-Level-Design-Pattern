package BehaviouralDesignPattern.StrategyPattern.WithPattern;

public class CreditCard implements PaymentStrategy {
    @Override
    public void processPayment() {
        System.out.println("Making Payment via Credit Card");
    }
}
