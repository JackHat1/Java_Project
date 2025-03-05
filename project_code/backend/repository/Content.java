package backend.repository;

public class Content {
    
   private int contentId = 0;
   private String title;
   private String primaryGenre;
   private double avgRating;
   private float[] ratings;
   private String [] actorNames;
   private String director;
   private int ratingCount;
   private int MAX_RATINGS;
   private int MAX_ACTORS;

   private int getContentId() {
      return contentId;
   }
   // private void setContentId(int contentId) {
   //    this.contentId = contentId;
   // }
   private String getTitle() {
      return title;
   }
   private void setTitle(String title) {
      this.title = title;
   }
   private String getPrimaryGenre() {
      return primaryGenre;
   }
   private void setPrimaryGenre(String primaryGenre) {
      this.primaryGenre = primaryGenre;
   }
   private double getAvgRating() {
      return avgRating;
   }
   // private void setAvgRating(double avgRating) {
   //    this.avgRating = avgRating;
   // }
   // private float[] getRatings() {
   //    return ratings;
   // }
   // private void setRatings(float[] ratings) {
   //    this.ratings = ratings;
   // }
   // private String[] getActorNames() {
   //    return actorNames;
   // }
   // private void setActorNames(String[] actorNames) {
   //    this.actorNames = actorNames;
   // }
   private String getDirector() {
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
   private int getMAX_RATINGS() {
      return MAX_RATINGS;
   }
   // private void setMAX_RATINGS(int mAX_RATINGS) {
   //    MAX_RATINGS = mAX_RATINGS;
   // }
   private int getMAX_ACTORS() {
      return MAX_ACTORS;
   }
   // private void setMAX_ACTORS(int mAX_ACTORS) {
   //    MAX_ACTORS = mAX_ACTORS;
   // }

   


}
