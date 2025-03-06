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


   private String getSubscriberEmail() {
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
   private SubscriptionPlan getPlan() {
      return plan;
   }
   private void setPlan(SubscriptionPlan plan) {
      this.plan = plan;
   }
   private Content[] getWatchHistory() {
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
   private int getWatchCount() {
      return watchCount;
   }
   // private void setWatchCount(int watchCount) {
   //    this.watchCount = watchCount;
   // }
   private String[] getFavoriteGenres() {
      return favoriteGenres;
   }
   private void setFavoriteGenres(String[] favoriteGenres) {
      this.favoriteGenres = favoriteGenres;
   }
   private int getFavoriteCount() {
      return favoriteCount;
   }
   // private void setFavoriteCount(int favoriteCount) {
   //    this.favoriteCount = favoriteCount;
   // }
   public Subscriber(String email, String password, SubscriptionPlan plan){
      
   }
}
