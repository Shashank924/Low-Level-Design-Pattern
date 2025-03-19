package BasicPaymentService;

abstract public class Card implements PaymentMethod{
    private String userName;
    private String cardNumber;

    public Card(String userName , String cardNumber) {
        this.cardNumber = cardNumber;
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }
    public String getCardNumber() {
        return cardNumber;
    }
}
