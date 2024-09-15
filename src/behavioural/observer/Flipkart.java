package behavioural.observer;

import java.util.ArrayList;
import java.util.List;

public class Flipkart {

    private static Flipkart instance;

    private List<Subscriber> subscribers = new ArrayList<>();

    public static Flipkart getInstance(){
        if (instance == null){
            instance = new Flipkart();
        }
        return instance;
    }

    public void registerSubscribers(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void unregisterSubscribers(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void orderPlaced(){
        // an.notify;
        // ig.genrateInvoice();
        // es.send();
        for (Subscriber subscriber:subscribers){
            subscriber.announce();
        }
    }
}
