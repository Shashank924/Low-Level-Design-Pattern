package BasicPaymentService;

public class CreditCard extends Card{

    public CreditCard(String userName , String cardNumber) {
        super(userName, cardNumber);
    }

    public void pay() {
        System.out.println("Making Payment using CreditCard");
    }
}
