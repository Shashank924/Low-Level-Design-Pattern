package BasicPaymentService;

public class DebitCard extends Card{

    public DebitCard(String userName, String cardNumber) {
        super(userName, cardNumber);
    }

    public void pay() {
        System.out.println("Making payment using DebitCard");
    }
}
