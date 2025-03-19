package BasicPaymentService;

public class Wallet implements PaymentMethod{

    private String walletId;

    Wallet(String walletId) {
        this.walletId = walletId;
    }

    public void pay() {
        System.out.println("Making payment via Wallet");
    }
}
