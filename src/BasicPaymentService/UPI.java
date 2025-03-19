package BasicPaymentService;

public class UPI implements PaymentMethod {

    private String upiId;

    UPI(String upiId) {
        this.upiId = upiId;
    }

    public void pay() {
        System.out.println("Making payment via UPI");
    }

}
