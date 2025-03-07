package backend.content;
public class Movie extends Content{
    private int duration;

    public int getDuration() {
        return duration;
    }

    private void setDuration(int duration) {
        this.duration = duration;
    }
    
    public Movie(String title, String genre, String director, int duration){
        super(title,genre,director);
        this.duration=duration;
    }
    //Constructor with default director and genre set as “Unknown”
    public Movie(String title, int duration){
        this(title, "Unknown", "Unknown", duration); 
    }
}
