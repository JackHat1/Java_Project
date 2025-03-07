package backend.content;

public abstract class Content {  
   private int contentId = 0;
   private String title;
   private String primaryGenre;
   private double avgRating;
   private float[] ratings;
   private String [] actorNames;
   private String director;
   private int ratingCount;
   private int MAX_RATINGS = 1000;
   private int MAX_ACTORS  = 100; 
   
   public Content(String title, String genre, String director) {
      this.title = title;
      this.primaryGenre = genre;
      this.director = director;
      this.ratings = new float[MAX_RATINGS];  
      this.ratingCount = 0;  
   }
  
   // Constructor with default director and genre set as “Unknown”
   public Content(String title){      
      this(title, "Unknown", "Unknown"); 
   }

   public int getContentId() {
      return contentId;
   }
   // private void setContentId(int contentId) {
   //    this.contentId = contentId;
   // }
   public String getTitle() {
      return title;
   }
   private void setTitle(String title) {
      this.title = title;
   }
   public String getPrimaryGenre() {
      return primaryGenre;
   }
   private void setPrimaryGenre(String primaryGenre) {
      this.primaryGenre = primaryGenre;
   }
   public double getAvgRating() {
      return avgRating;
   }
   // private void setAvgRating(double avgRating) {
   //    this.avgRating = avgRating;
   // }
   // protected float[] getRatings() {
   //    return ratings;
   // }
   // private void setRatings(float[] ratings) {
   //    this.ratings = ratings;
   // }
   // protected String[] getActorNames() {
   //    return actorNames;
   // }
   // private void setActorNames(String[] actorNames) {
   //    this.actorNames = actorNames;
   // }
   
   public String getDirector() {
      return director;
   }
   private void setDirector(String director) {
      this.director = director;
   }
   // private int getRatingCount() {
   //    return ratingCount;
   // }
   // private void setRatingCount(int ratingCount) {
   //    this.ratingCount = ratingCount;
   // }
   protected int getMAX_RATINGS() {
      return MAX_RATINGS;
   }
   // private void setMAX_RATINGS(int mAX_RATINGS) {
   //    MAX_RATINGS = mAX_RATINGS;
   // }
   protected int getMAX_ACTORS() {
      return MAX_ACTORS;
   }
   // private void setMAX_ACTORS(int mAX_ACTORS) {
   //    MAX_ACTORS = mAX_ACTORS;
   // }

   public void addRating(float newRating) {
      if (newRating >= 0 && newRating <= 5) {
          if (ratingCount < MAX_RATINGS) {
              ratings[ratingCount] = newRating;
              ratingCount++;
          }
      }
   }

   public double getAverageRating() {
      if (ratingCount == 0) {
         return 0;
      }
      
      double sum = 0;
      for (int i = 0; i < ratingCount; i++) {
         sum += ratings[i];
      }
      
      return sum / ratingCount;
   }

   public String getNonNullActors() {
      String result = "";
      int resultLength = 0;
  
      for (int i = 0; i < MAX_ACTORS; i++) {
          if (actorNames[i] != null) {
              if (resultLength == 0) {
                  result = actorNames[i];
              } else {
                  result = result + ", " + actorNames[i];
              }
              resultLength = resultLength + 1;
          }
      }
  
      return result;
   }

  public void addActor(String actorName) {
         int i = 0;
         while (actorNames[i] != null && i < MAX_ACTORS) {
            i++;
         }
         if (i < MAX_ACTORS) {
            actorNames[i] = actorName;
         }
   }

   public void removeActor(String actorName) {
      for (int i = 0; i < MAX_ACTORS; i++) {
          if (actorNames[i] == actorName) {
              actorNames[i] = null;
              return;
          }
      }
   }

   public String printDetails() {
      return 
            "Content ID: " + contentId + "\n" +
            "Title: " + title + "\n" +
            "Primary Genre: " + primaryGenre + "\n" +
            "Director: " + director + "\n" +
            "Average Rating: " + getAverageRating() + "\n" +
            "Number of Ratings: " + ratingCount + "\n" +
            "Actors: " + getNonNullActors();
   }

  
}
