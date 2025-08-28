package BehaviouralDesignPattern.IteratorDesignPattern.WithoutPattern;

import java.util.ArrayList;

public class PlayList {
    private ArrayList<String> songs;

    PlayList() {
        songs = new ArrayList<>();
    }

    public void addSong(String song) {
        songs.add(song);
    }

    public void playPlayList() {
        for(int ind = 0 ; ind < songs.size() ; ind++) {
            System.out.println(songs.get(ind));
        }
    }
}
