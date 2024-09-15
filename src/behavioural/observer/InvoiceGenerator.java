package behavioural.observer;

public class InvoiceGenerator implements Subscriber{

    public InvoiceGenerator(){
        Flipkart flipkart = Flipkart.getInstance();
        flipkart.registerSubscribers(this);
    }

    @Override
    public void announce() {
        generateInvoice();
    }

    public void generateInvoice(){
        System.out.println("Generating Invoice");
    }
}
