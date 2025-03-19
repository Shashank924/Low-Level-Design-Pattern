package BasicPaymentService;

public class Client {
    public static void main(String[] args) {
        PaymentService ps = new PaymentService();
        ps.addPaymentMethod("ShashankDebitCard" , new DebitCard("Shashank" , "1234"));
        ps.addPaymentMethod("ShashankCreditCard" , new CreditCard("Shashank" , "5678"));
        ps.addPaymentMethod("ShashankUPI" , new UPI("UPI@123"));
        ps.addPaymentMethod("ShashankWallet" , new Wallet("Wallet@123"));
        ps.makePayment("ShashankCreditCard");
    }
}
