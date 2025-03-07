package backend.service;

import backend.content.Content;
import backend.repository.ContentRepository;
import backend.subscription.Subscriber;

public class NetflixService {
    private ContentRepository contentRepo;

    public ContentRepository getContentRepo() {
        return contentRepo;
    }

    // public void setContentRepo(ContentRepository contentRepo) {
    //     this.contentRepo = contentRepo;
    // }

    public NetflixService(ContentRepository contentRepo){
        this.contentRepo = contentRepo;
    }

    public Content[] getRecommendedMoviesByFavoriteGenres(Subscriber subscriber, int maxResults) {
        Content[] allContent = contentRepo.getAllContent(); // Get all content
        String[] favoriteGenres = subscriber.getFavoriteGenres(); // Get subscriber's favorite genres
        Content[] recommendations = new Content[maxResults]; // Store recommendations

        int count = 0;
        for (int i = 0; i < allContent.length && count < maxResults; i++) {
            if (allContent[i] != null) {
                for (int j = 0; j < favoriteGenres.length; j++) {
                    if (allContent[i].getPrimaryGenre() == favoriteGenres[j]) {
                        recommendations[count] = allContent[i];
                        count++;
                        break; // Move to the next movie
                    }
                }
            }
        }
        return recommendations;
    }

    public void printRecommendations(Content[] movies, Subscriber subscriber) {
        System.out.println("Movies Recommended for Subscriber " + subscriber.getSubscriberEmail());
    
        int index = 0;
        while (movies[index] != null) {
            System.out.println("- " + movies[index].getTitle() + " (? " + movies[index].getAverageRating() + ")");
            index++;
        }
    }
    
}
