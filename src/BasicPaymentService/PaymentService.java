package BasicPaymentService;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class PaymentService {
    private HashMap<String , PaymentMethod> paymentMethodHashMap;

    PaymentService() {
        paymentMethodHashMap = new LinkedHashMap<>();
    }

    public void addPaymentMethod(String name , PaymentMethod pm) {
        paymentMethodHashMap.put(name , pm);
    }

    public void makePayment(String name)
    {
        PaymentMethod pm = paymentMethodHashMap.get(name);
        pm.pay();
    }
}
