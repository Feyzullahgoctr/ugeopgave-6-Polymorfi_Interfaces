package Opgave1;

import java.util.ArrayList;

public class MediaPlayer {

    private ArrayList<Playable> playables = new ArrayList<>();

    public void add(Playable item) {
        playables.add(item);
    }

    public void playAll() {
        System.out.println(" ===== Alle liste ===== ");
        for (Playable p : playables) {
            p.play();
        }
    }

    public int getTotalDuration() {
        int totalSecond = 0;
        for (Playable p : playables) {
            totalSecond += p.getDurationSeconds();
        }
        return totalSecond;
    }

    public int getTotalTime() {
        return getTotalDuration() / 3600;
    }

    public int getTotalMinute() {
        return (getTotalDuration() % 3600) / 60;
    }

    public int getTotalSecond() {
        return (getTotalDuration() % 3600) % 60;
    }

    public void printPlaylist() {
        System.out.println(" ===== Playlist (" + playables.size() + " elementer) ===== ");
        for (int i = 0; i < playables.size(); i++) {

            String titel = playables.get(i).getTitle();
            int time = playables.get(i).getTime();
            int minut = playables.get(i).getMinute();

            System.out.println((i + 1) + "." + titel + " - (" + time + ":" + minut + ":" + getTotalSecond() + ")");
        }
    }

    public void printTotalDuration() {
        System.out.println("====================================");
        System.out.println("Samlet spilletid : " + getTotalDuration() + " seconder, (" + getTotalTime()+ ":"+ getTotalMinute() + ":" + getTotalSecond() + ")");
    }




}
