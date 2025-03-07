package backend.content;

public class Series extends Content{
    private int seasons;
    private String[][] episodesPerSeason; /*ο πρώτος δείκτης είναι ο αύξων αριθμός της season και ο δεύτερος ο αριθμός επεισοδίου. Το String[i][j] θα κρατάει τον τίτλο επεισοδίου j της season i*/

    public Series(String title, String genre, String director, int seasons, int maxEpisodesPerSeason){
        super(title, genre, director); 
        this.seasons = seasons;
        this.episodesPerSeason = new String[seasons][maxEpisodesPerSeason];
    }

    public int getSeasons() {
        return seasons;
    }
    private void setSeasons(int seasons) {
        this.seasons = seasons;
    }
    public String[][] getEpisodesPerSeason() {
        return episodesPerSeason;
    }
    // public void setEpisodesPerSeason(String[][] episodesPerSeason) {
    //     this.episodesPerSeason = episodesPerSeason;
    // }

    public void addEpisode(int season, int episodeIndex, String episodeTitle) {
        if (season > 0 && season <= seasons && episodeIndex >= 0 && episodeIndex < episodesPerSeason[season - 1].length) {
            episodesPerSeason[season - 1][episodeIndex] = episodeTitle;
        }
    }

    public void removeEpisode(int season, String episodeTitle) {
        if (season > 0 && season <= seasons) { 
            String[] episodes = episodesPerSeason[season - 1]; 
            
            for (int i = 0; i < episodes.length; i++) {
                if (episodes[i] != null && episodes[i] == episodeTitle) { 
                    episodes[i] = null; 
                    return; 
                }
            }
        }
    }
    
    public void updateEpisode(int season, int episodeIndex, String newTitle) {
        if (season > 0 && season <= seasons) { 
            int count = 0; 
            for (int i = 0; i < episodesPerSeason[season - 1].length; i++) {
                if (episodesPerSeason[season - 1][i] != null) {
                    count++; 
                }
            }
            if (episodeIndex >= 0 && episodeIndex < count) { 
                episodesPerSeason[season - 1][episodeIndex] = newTitle;     
            }
        }
    }

    public String[] getEpisodes(int season) {
        if (season > 0 && season <= seasons) { 
            int count = 0; 
            int i = 0;
    
            while (i < 100) { 
                if (episodesPerSeason[season - 1][i] != null) {
                    count++; 
                }
                i++;
            }
    
            // Create a new array to store found episodes
            String[] episodes = new String[count];
            int index = 0;
            i = 0;
            
            while (i < 100) { 
                if (episodesPerSeason[season - 1][i] != null) {
                    episodes[index] = episodesPerSeason[season - 1][i];
                    index++;
                }
                i++;
            }
    
            return episodes; 
        }
        
        return new String[0];
    }
    
    
       
    @Override
    public String printDetails() {
        String details = super.printDetails() + "\nSeasons: " + seasons;
        for (int i = 0; i < seasons; i++) {
            details += "\nSeason " + (i + 1) + ": ";
            String seasonEpisodes = "";
            for (String episode : episodesPerSeason[i]) {
                if (episode != null) {
                    if (!seasonEpisodes.isEmpty()) seasonEpisodes += ", ";
                    seasonEpisodes += episode;
                }
            }
            details += seasonEpisodes.isEmpty() ? "No episodes added" : seasonEpisodes;
        }
        return details;
    }

}

