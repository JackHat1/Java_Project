package backend.content;

public class Series extends Content{
    private int seasons;

    private String[][] episodesPerSeason; /*ο πρώτος δείκτης είναι ο αύξων αριθμός της season και ο δεύτερος ο αριθμός επεισοδίου. Το String[i][j] θα κρατάει τον τίτλο επεισοδίου j της season i*/
    
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

    public Series(String title, String genre, String director, int seasons, int maxEpisodesPerSeason){
        super(title, genre, director); 
        this.seasons = seasons;
        this.episodesPerSeason = new String[seasons][maxEpisodesPerSeason];
    }

        public void addEpisode(int season, int episodeIndex, String episodeTitle) {
            if (season > 0 && season <= seasons && episodeIndex >= 0 && episodeIndex < episodesPerSeason[season - 1].length) {
                episodesPerSeason[season - 1][episodeIndex] = episodeTitle;
            }
        }


    @Override
    public String printDetails() {
        return super.printDetails() + "\n" + // Reuse Content's printDetails()
            "Seasons: " + seasons;
    }

}

