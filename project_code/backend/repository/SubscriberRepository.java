package backend.repository;

import backend.subscription.Subscriber; 

public class SubscriberRepository {
    private int MAX_SUBSCRIBERS = 100;
    private Subscriber[] subscribers = new Subscriber[MAX_SUBSCRIBERS];
    private int count = 0;

    public int getMAX_SUBSCRIBERS() {
        return MAX_SUBSCRIBERS;
    }
    // private void setMAX_SUBSCRIBERS(int mAX_SUBSCRIBERS) {
    //     MAX_SUBSCRIBERS = mAX_SUBSCRIBERS;
    // }
    public Subscriber[] getSubscribers() {
        return subscribers;
    }
    // private void setSubscribers(Subscriber[] subscribers) {
    //     this.subscribers = subscribers;
    // }
    public int getCount() {
        return count;
    }
    // private void setCount(int count) {
    //     this.count = count;
    // }

    public boolean addSubscriber(Subscriber subscriber) {
        if (subscriber == null) return false;
    
        if (subscribers == null) { 
            subscribers = new Subscriber[MAX_SUBSCRIBERS];
        }
    
        for (int i = 0; i < subscribers.length; i++) { 
            if (subscribers[i] == null) {
                subscribers[i] = subscriber; 
                count++;
                return true;
            }
        }
        return false; 
    }
    
    
    public void deactivateSubscriber(Subscriber subscriber) {
        if (subscriber != null) {
            subscriber.setActive(false); // Set active status to false
        }
    }
    
    public void activateSubscriber(Subscriber subscriber) {
        if (subscriber != null) {
            subscriber.setActive(true); // Set active status to true
        }
    }
    
    public Subscriber findSubscriberByEmail(String subscriberEmail) {
        if (subscriberEmail == null) { 
            return null;
        }
        if (subscribers == null) { 
            return null;
        }
        for (int i = 0; i < count; i++) { 
            if (subscribers[i] != null && subscriberEmail.equals(subscribers[i].getSubscriberEmail())) { 
                return subscribers[i];
            }
        }
        return null; 
    }
    
    
 
}
