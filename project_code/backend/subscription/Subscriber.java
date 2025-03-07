package backend.subscription;
   public class Subscriber {
   private String subscriberEmail;
   private String subscriberPassword;
   private SubscriptionPlan plan;
   private Content[] watchHistory;
   private boolean active;
   private int watchCount;
   private String[] favoriteGenres;
   private int favoriteCount;


   public String getSubscriberEmail() {
      return subscriberEmail;
   }
   private void setSubscriberEmail(String subscriberEmail) {
      this.subscriberEmail = subscriberEmail;
   }
   // private String getSubscriberPassword() {
   //    return subscriberPassword;
   // }
   private void setSubscriberPassword(String subscriberPassword) {
      this.subscriberPassword = subscriberPassword;
   }
   public SubscriptionPlan getPlan() {
      return plan;
   }
   private void setPlan(SubscriptionPlan plan) {
      this.plan = plan;
   }
   protected Content[] getWatchHistory() {
      return watchHistory;
   }
   // private void setWatchHistory(Content[] watchHistory) {
   //    this.watchHistory = watchHistory;
   // }
   private boolean isActive() {
      return active;
   }
   private void setActive(boolean active) {
      this.active = active;
   }
   public int getWatchCount() {
      return watchCount;
   }
   // private void setWatchCount(int watchCount) {
   //    this.watchCount = watchCount;
   // }
   protected String[] getFavoriteGenres() {
      return favoriteGenres;
   }
   private void setFavoriteGenres(String[] favoriteGenres) {
      this.favoriteGenres = favoriteGenres;
   }
   public int getFavoriteCount() {
      return favoriteCount;
   }
   // private void setFavoriteCount(int favoriteCount) {
   //    this.favoriteCount = favoriteCount;
   // }
   public Subscriber(String email, String password, SubscriptionPlan plan) {
      this.subscriberEmail = email;
      this.subscriberPassword = password;
      this.plan = plan;
  }
  
}
