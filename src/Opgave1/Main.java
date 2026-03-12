package Opgave1;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Playable> playables = new ArrayList<>();

        playables.add(new Audiobook("Comfortably Numb", 5000, "Pink Floyd"));
        playables.add(new Song("Lex Fridman #400", 6000, "Lex Fridman"));
        playables.add(new Podcast("Dune", 1000, "Frank Herbert"));

        MediaPlayer mediaPlayer = new MediaPlayer();
        for (Playable p : playables) {
            mediaPlayer.add(p);
        }


        mediaPlayer.printPlaylist();
        mediaPlayer.playAll();
        mediaPlayer.printTotalDuration();




    }

}
