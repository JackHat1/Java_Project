package backend.content;

public class Series extends Content{
    private final int seasons;
    private String[][] episodesPerSeason; /*ο πρώτος δείκτης είναι ο αύξων αριθμός της season και ο δεύτερος ο αριθμός επεισοδίου. Το String[i][j] θα κρατάει τον τίτλο επεισοδίου j της season i*/
   
    //CONSTRUCTOR // 
    public Series(String title, String genre, String director, int seasons, int maxEpisodesPerSeason){
        super(title, genre, director); 
        this.seasons = seasons;
        this.episodesPerSeason = new String[seasons][maxEpisodesPerSeason];
    }

    //GETTERS &SETTERS //
    public int getSeasons() {
        return seasons;
    }
    // private void setSeasons(int seasons) {
    //     this.seasons = seasons;
    // }
    public String[][] getEpisodesPerSeason() {
        return episodesPerSeason;
    }
    // public void setEpisodesPerSeason(String[][] episodesPerSeason) {
    //     this.episodesPerSeason = episodesPerSeason;
    // }

    // METHODS // 
    public void addEpisode(int season, int episodeIndex, String episodeTitle) {
        if (season > 0 && season <= seasons && episodeIndex >= 0 && episodeIndex < episodesPerSeason[season - 1].length) {
            if (episodesPerSeason[season - 1][episodeIndex] != null) {
                System.out.println("ERROR: Episode slot already occupied.");
                return;
            }
            episodesPerSeason[season - 1][episodeIndex] = episodeTitle;
        } else {
            System.out.println("ERROR: Invalid season or episode index.");
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
        if (season > 0 && season <= seasons && episodeIndex >= 0) {
            if (episodesPerSeason[season - 1][episodeIndex] != null) { // Ensure episode exists
                episodesPerSeason[season - 1][episodeIndex] = newTitle;
                System.out.println("? Episode modified successfully: " + newTitle);
            } else {
                System.out.println("? ERROR: No episode found at that position.");
            }
        } else {
            System.out.println("? ERROR: Invalid season or episode index.");
        }
    }
    

    public String[] getEpisodes(int season) {
        if (season > 0 && season <= seasons) {
            String[] allEpisodes = episodesPerSeason[season - 1];
    
            //calc the number of episodes  
            int count = 0;
            for (int i = 0; i < allEpisodes.length; i++) {
                if (allEpisodes[i] != null) {
                    count++;
                }
            }
    
            String[] episodes = new String[count];
            int index = 0;
            for (int i = 0; i < allEpisodes.length; i++) {
                if (allEpisodes[i] != null) {
                    episodes[index++] = allEpisodes[i];
                }
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
                    if (!seasonEpisodes.isEmpty()) {
                        seasonEpisodes += ", ";
                    }
                    seasonEpisodes += episode;
                }
            }
    
            if (seasonEpisodes.isEmpty()) {
                details += "No episodes added";
            } else {
                details += seasonEpisodes;
            }
        }
    
        return details;
    }    

}

