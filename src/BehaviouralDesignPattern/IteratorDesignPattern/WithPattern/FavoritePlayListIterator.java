package BehaviouralDesignPattern.IteratorDesignPattern.WithPattern;

public class FavoritePlayListIterator implements PlayListIterator{
    private PlayList playList;
    private int index;

    FavoritePlayListIterator(PlayList playList) {
        this.playList = playList;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {

        while(index < playList.getSongs().size() && !playList.getSongs().get(index).contains("fav")) {
            index++;
        }

        if(index < playList.getSongs().size()) return true;

        return false;
    }

    @Override
    public String next() {
        return playList.getSongs().get(index++);
    }
}
