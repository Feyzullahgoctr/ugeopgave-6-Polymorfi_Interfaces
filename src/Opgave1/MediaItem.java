package Opgave1;

// en fælles baseklasse for andre klasser
// man ikke vil oprette objekter direkte fra MediaItem.
// de deler nogle fælles egenskaber eller metoder.
public abstract class MediaItem {

    protected String title;
    protected int durationSeconds;

    public MediaItem(String title, int durationSeconds) {
        this.title = title;
        this.durationSeconds = durationSeconds;
    }

    public String getTitle() {
        return title;
    }

    public int getDurationSeconds() {
        return durationSeconds;
    }


    public int getTime() {
        return durationSeconds / 3600 ;
    }
    public int getMinute() {
        return (durationSeconds % 3600 ) / 60;
    }
    public int getSecond() {
        return (durationSeconds % 3600 ) % 60;
    }

    @Override
    public String toString() {
        return "MediaItem{" +
                "title='" + title + '\'' +
                ", durationSeconds=" + durationSeconds +
                '}';
    }

}
