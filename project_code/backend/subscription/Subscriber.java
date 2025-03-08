package backend.subscription;

import backend.content.Content; 

   public class Subscriber {
   private String subscriberEmail;
   private String subscriberPassword;
   private SubscriptionPlan plan;
   private Content[] watchHistory;
   private int MAX_HISTORY = 100 ; 
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
   public void setActive(boolean active) {
      this.active = active;
   }
   public int getWatchCount() {
      return watchCount;
   }
   // private void setWatchCount(int watchCount) {
   //    this.watchCount = watchCount;
   // }
   public String[] getFavoriteGenres() {
      return favoriteGenres;
   }
   public void setFavoriteGenres(String[] favoriteGenres) {
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
      this.watchHistory = new Content[MAX_HISTORY]; 
      this.watchCount = 0;

   }

   public void setSubscriberEmail(String email) {
      if (email != null) { // Check if email is not null
         boolean isValid = email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$"); 
         
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

public void printSubscriberDetails() {
    System.out.println("\n---------------------------------");
    System.out.println("? Email: " + subscriberEmail);
    System.out.println("? Subscription Plan: " + plan.getPlanName());
    System.out.println("? Price: $" + plan.getPlanPrice() + " per month");
    System.out.println("? Max Screens: " + plan.getPlanMaxScreens());
    System.out.println("? Active Status: " + (active ? "Active" : "Deactivated"));

    // ✅ Print Favorite Genres
    System.out.print("? Favorite Genres: ");
    if (favoriteCount == 0 || favoriteGenres == null) {
        System.out.println("None");
    } else {
        for (int i = 0; i < favoriteCount; i++) {
            System.out.print(favoriteGenres[i]);
            if (i < favoriteCount - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(); // Move to next line after printing genres
    }

    System.out.println("? Watch History:");
    if (watchCount == 0 || watchHistory == null) {
        System.out.println("- None");
    } else {
        for (int i = 0; i < watchCount; i++) {
            if (watchHistory[i] != null) {
                System.out.println("- " + watchHistory[i].getTitle());
            }
        }
    }

    System.out.println("\n---------------------------------");
}


}
