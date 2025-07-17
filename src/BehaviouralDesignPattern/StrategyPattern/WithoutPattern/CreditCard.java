package BehaviouralDesignPattern.StrategyPattern.WithoutPattern;

public class CreditCard implements PaymentMethod{
    @Override
    public void processPayment() {
        System.out.println("Making Payment via Credit Card");
    }
}
