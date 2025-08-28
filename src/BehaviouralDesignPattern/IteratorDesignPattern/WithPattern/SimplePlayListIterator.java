package BehaviouralDesignPattern.IteratorDesignPattern.WithPattern;

public class SimplePlayListIterator implements PlayListIterator{

    private PlayList playList;
    private int index;

    SimplePlayListIterator(PlayList playList) {
        this.playList = playList;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        if(index < playList.getSongs().size()) {
            return true;
        }
        return false;
    }

    @Override
    public String next() {
        return playList.getSongs().get(index++);
    }
}
