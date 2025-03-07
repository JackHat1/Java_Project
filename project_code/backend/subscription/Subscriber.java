package backend.subscription;

import backend.content.Content; 

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
   // private String getSubscriberPassword() {
   //    return subscriberPassword;
   // }

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

   public void setSubscriberEmail(String email) {
      if (email != null) { // Check if email is not null
         boolean isValid = email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$"); // Validate format
         
         if (isValid) { 
            this.subscriberEmail = email;
         }
      }
   }

   public void setSubscriberPassword(String password) {
         if (password != null && password.matches("^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@#$%^&+=!]).{8,}$")) {
            subscriberPassword = password; 
         }
   }

   public void watchContent(Content content) {
      int count = 0;
      while (count < 100) { 
         if (watchHistory[count] == null) {
            watchHistory[count] = content; 
            watchCount++; 
            break; 
         }
         count++;
      }
   }

   public void printHistory() {
      for (int i = 0; i < watchCount; i++) {  
          if (watchHistory[i] != null) {  
              System.out.println(watchHistory[i].getTitle());  
          }
      }
  }
  

  

  
}
