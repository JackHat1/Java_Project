package backend.subscription;

public class SubscriptionPlan {
    private String planName;
    private double planPrice;
    private int planMaxScreens;

    public String getPlanName() {
        return planName;
    }
    // private void setPlanName(String planName) {
    //     this.planName = planName;
    // }
    public double getPlanPrice() {
        return planPrice;
    }
    // private void setPlanPrice(double planPrice) {
    //     this.planPrice = planPrice;
    // }
    public int getPlanMaxScreens() {
        return planMaxScreens;
    }
    // private void setPlanMaxScreens(int planMaxScreens) {
    //     this.planMaxScreens = planMaxScreens;
    // }

    public SubscriptionPlan(String name, double price, int maxScreens) {
        this.planName = name;
        this.planPrice = price;
        this.planMaxScreens = maxScreens;
    }
    
    
}
