package Opgave1;

public class Audiobook extends MediaItem implements Playable {


    private String author;

    public Audiobook(String title, int durationSeconds, String author) {
        super(title, durationSeconds);
        this.author = author;
    }

    @Override
    public void play() {
        System.out.println("\uD83D\uDCD6 Afspiller lydbog : " + getTitle() + " (" + getDurationSeconds() + " seconder)");
    }



}



