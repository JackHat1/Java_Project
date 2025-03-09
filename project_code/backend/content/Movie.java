package backend.content;

public class Movie extends Content{
    private final int duration;

    //CONSTRUCTOR // 
    public Movie(String title, String genre, String director, int duration){
        super(title, genre, director);
        if (duration <= 0) {
            System.out.println("ERROR: Movie duration must be greater than 0 minutes.");
            this.duration = 90; // Default duration
        } else {
            this.duration = duration;
        }
    }
    
    //Constructor with default director and genre set as “Unknown”
    public Movie(String title, int duration){
        this(title, "Unknown", "Unknown", duration); 
    }
    public int getDuration() {
        return duration;
    }

    //GETTERS &SETTERS 
    // private void setDuration(int duration) {
    //     this.duration = duration;
    // }


    // METHODS // 
    @Override
    public String printDetails() {
        return super.printDetails() + "\n" + // Reuse Content's printDetails()
            "Duration: " + duration + " minutes";
    }

}
