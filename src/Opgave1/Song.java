package Opgave1;

public class Song extends MediaItem implements Playable {

    private String artist;

    public Song(String title, int durationSeconds, String artist) {
        super(title, durationSeconds);
        this.artist = artist;
    }

    @Override
    public void play() {
        System.out.println("♪ Afspiller : " + getTitle() + " (" + getDurationSeconds() + " seconder)");
    }





}
