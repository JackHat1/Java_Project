package backend.content;

public class Series {
    private int seasons;
    private String[][] episodesPerSeason; /*ο πρώτος δείκτης είναι ο αύξων αριθμός της season και ο δεύτερος ο αριθμός επεισοδίου. Το String[i][j] θα κρατάει τον τίτλο επεισοδίου j της season i*/
    
    public int getSeasons() {
        return seasons;
    }
    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }
    public String[][] getEpisodesPerSeason() {
        return episodesPerSeason;
    }
    // public void setEpisodesPerSeason(String[][] episodesPerSeason) {
    //     this.episodesPerSeason = episodesPerSeason;
    // }
    
}

