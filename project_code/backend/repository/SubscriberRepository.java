package backend.repository;

import backend.subscription.Subscriber; 

public class SubscriberRepository {
    private int MAX_SUBSCRIBERS;
    private Subscriber[] subscribers;
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
        if (count < MAX_SUBSCRIBERS) { 
            subscribers[count] = subscriber; 
            count++; 
            return true; 
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
        for (int i = 0; i < count; i++) { // Loop through the subscribers
            if (subscribers[i] != null && subscribers[i].getSubscriberEmail().equals(subscriberEmail)) {
                return subscribers[i]; // Return the matching subscriber
            }
        }
        return null; // Return null if not found
    }
    
 
}
