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

   public Subscriber(String email, String password, SubscriptionPlan plan) {
      this.subscriberEmail = email;
      this.subscriberPassword = password;
      this.plan = plan;
      this.watchHistory = new Content[MAX_HISTORY]; 
      this.watchCount = 0;
      this.favoriteGenres = new String[3]; 
      this.active = false;  // all subscribers by default start as Deactivated

   }

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
   public void setFavoriteGenres(String[] genres) {
      if (genres != null) {
          if (genres.length > 3) { 
              System.out.println("ERROR: You can't save more than 3 favorite genres.");
              return; // Stop execution if more than 3 genres are given
          }
          
          // Copy only the first 3 genres
          for (int i = 0; i < genres.length; i++) {
              favoriteGenres[i] = genres[i]; // Assign each genre
          }
          favoriteCount = genres.length; // Update the count
      } else {
          favoriteGenres = new String[5]; // Reset to empty array of size 3
          favoriteCount = 0;
      }
  }
  
   public int getFavoriteCount() {
      return favoriteCount;
   }
   // private void setFavoriteCount(int favoriteCount) {
   //    this.favoriteCount = favoriteCount;
   // }
   

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
      for (int i = 0; i < 100; i++) { 
          if (watchHistory[i] == null) {
              watchHistory[i] = content; 
              watchCount++;
              System.out.println(subscriberEmail + " watched " + content.getTitle());
              return; 
          }
      }
  }
  

   public void printHistory() {
      for (int i = 0; i < watchCount; i++) {  
         if (watchHistory[i] != null) {  
            System.out.println(subscriberEmail + " watched " + watchHistory[i].getTitle());
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
   }


}
