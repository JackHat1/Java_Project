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
    protected Subscriber[] getSubscribers() {
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


 
}
