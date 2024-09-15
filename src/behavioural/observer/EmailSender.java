package behavioural.observer;

public class EmailSender implements Subscriber{

    public EmailSender(){
        Flipkart flipkart = Flipkart.getInstance();
        flipkart.registerSubscribers(this);
    }

    @Override
    public void announce() {
        sendEmail();
    }

    public void sendEmail(){
        System.out.println("Sending Email");
    }
}
