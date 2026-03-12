package Opgave1;

public class Podcast extends MediaItem implements Playable {

    private String host;

    public Podcast(String title, int durationSeconds, String host) {
        super(title, durationSeconds);
        this.host = host;
    }

    @Override
    public void play() {
        System.out.println("\uD83C\uDF99 Afspiller podcast : " + getTitle() + " (" + getDurationSeconds() + " seconder)");
    }



}
