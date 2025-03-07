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
        if (subscriber == null) { // ✅ Check if subscriber is null
            System.out.println("Error: Subscriber is null. Cannot generate recommendations.");
            return new Content[0]; // Return empty array
        }

        String[] favoriteGenres = subscriber.getFavoriteGenres();
        if (favoriteGenres == null) { // ✅ Check if favorite genres exist
            System.out.println("Warning: Subscriber has no favorite genres.");
            return new Content[0];
        }

        Content[] allContent = contentRepo.getAllContent();
        Content[] recommendations = new Content[maxResults];

        int count = 0;
        for (int i = 0; i < allContent.length && count < maxResults; i++) {
            if (allContent[i] != null) {
                for (int j = 0; j < favoriteGenres.length; j++) {
                    if (favoriteGenres[j] != null && allContent[i].getPrimaryGenre().equals(favoriteGenres[j])) {
                        recommendations[count] = allContent[i];
                        count++;
                        break;
                    }
                }
            }
        }
        return recommendations;
    }

    public void printRecommendations(Content[] movies, Subscriber subscriber) {
        if (subscriber == null) { 
            System.out.println("Error: Subscriber is null. Cannot print recommendations.");
            return;
        }
    
        System.out.println("Movies Recommended for Subscriber " + subscriber.getSubscriberEmail());
    
        int index = 0;
        while (index < movies.length && movies[index] != null) { 
            System.out.println("- " + movies[index].getTitle() + " (? " + movies[index].getAverageRating() + ")");
            index++;
        }
    }
       
}
