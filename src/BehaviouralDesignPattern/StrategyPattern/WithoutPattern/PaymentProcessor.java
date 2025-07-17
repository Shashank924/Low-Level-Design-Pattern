package BehaviouralDesignPattern.StrategyPattern.WithoutPattern;

public class PaymentProcessor {

    String methodType;

    public PaymentProcessor(String methodType) {
        this.methodType = methodType;
    }

    public void makePayment() {
        if(methodType.equals("Credit")) {
            CreditCard creditCard = new CreditCard();
            creditCard.processPayment();
        }
        else if(methodType.equals("Debit")) {
            DebitCard debitCard = new DebitCard();
            debitCard.processPayment();
        }
        else if(methodType.equals("Upi")) {
            Upi upi = new Upi();
            upi.processPayment();
        }
        else {
            System.out.println("Select a valid payment method");
        }
    }
}
