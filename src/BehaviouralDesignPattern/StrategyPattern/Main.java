package BehaviouralDesignPattern.StrategyPattern;

import BehaviouralDesignPattern.StrategyPattern.WithPattern.CreditCard;
import BehaviouralDesignPattern.StrategyPattern.WithPattern.PaymentProcessor;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor(new CreditCard());

        processor.processPayment();
    }
}
