
public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }
    
    public boolean equals(Object object) {
        if (object instanceof Song) {
            if (
                    (((Song) object).name.equals(this.name)) & 
                    (((Song) object).durationInSeconds == this.durationInSeconds) & 
                    (((Song) object).artist.equals(this.artist))
                    ) {
                return true;
            }
        }
        return false;
    }


}
