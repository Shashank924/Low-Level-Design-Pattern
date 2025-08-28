package BehaviouralDesignPattern.IteratorDesignPattern.WithPattern;

import java.util.ArrayList;
import java.util.Collections;

public class ShuffledPlayListIterator implements PlayListIterator{
    private PlayList playList;
    private ArrayList<String> shuffledSongs;
    private int index;

    ShuffledPlayListIterator(PlayList playList) {
        this.playList = playList;
        this.shuffledSongs = new ArrayList<>(playList.getSongs());
        Collections.shuffle(shuffledSongs);
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        if(index < shuffledSongs.size()) {
            return true;
        }
        return false;
    }

    @Override
    public String next() {
        return shuffledSongs.get(index++);
    }
}
