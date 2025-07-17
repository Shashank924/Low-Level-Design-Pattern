package BehaviouralDesignPattern.StrategyPattern.WithoutPattern;

public class DebitCard implements PaymentMethod{
    @Override
    public void processPayment() {
        System.out.println("Making Payment via Debit Card");
    }
}
