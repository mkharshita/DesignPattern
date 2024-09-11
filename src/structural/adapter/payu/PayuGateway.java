package structural.adapter.payu;

public class PayuGateway {
    public String payByCreditCard(Long creditCard,
                                  Long cvv,
                                  Long expiry){
        System.out.println("Payement Done By PayU");
        return "123";
    }

    public PayuPaymentStatus checkPaymentStatus(String id){
        return PayuPaymentStatus.FAILURE;
    }
}
