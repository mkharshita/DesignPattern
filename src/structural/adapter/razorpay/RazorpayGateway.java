package structural.adapter.razorpay;

public class RazorpayGateway {

    public String payByCreditCard(String creditCard,
                           String cvv,
                           String expiry){
        System.out.println("Payement Done By Razorpay");
        return "123";
    }

    public boolean checkPaymentStatus(String id){
        return false;
    }
}
