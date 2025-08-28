package BehaviouralDesignPattern.IteratorDesignPattern.WithPattern;

public class Main {
    public static void main(String[] args) {

        PlayList playList = new PlayList();
        playList.addSong("Song 1 fav");
        playList.addSong("Song 2");
        playList.addSong("Song 3");
        playList.addSong("Song 4 fav");
        playList.addSong("Song 5 fav");
        playList.addSong("Song 6");

        System.out.println("PlayList Iterator Example");

        PlayListIterator iterator = playList.iterator("favorite");

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
