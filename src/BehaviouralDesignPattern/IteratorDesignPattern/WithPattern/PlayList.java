package BehaviouralDesignPattern.IteratorDesignPattern.WithPattern;

import java.util.ArrayList;

public class PlayList {
    private ArrayList<String> songs;

    PlayList() {
        songs = new ArrayList<>();
    }

    public void addSong(String song) {
        songs.add(song);
    }

    public PlayListIterator iterator(String iteratorType) {
        if(iteratorType.equals("simple")) {
            return new SimplePlayListIterator(this);
        }
        else if(iteratorType.equals("shuffled")) {
            return new ShuffledPlayListIterator(this);
        }
        else if(iteratorType.equals("favorite")) {
            return new FavoritePlayListIterator(this);
        }
        else {
            return null;
        }
    }

    public ArrayList<String> getSongs() {
        return songs;
    }
}
