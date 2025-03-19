package ObserverPattern;

public interface PublisherInterface {
    void addUser(Users user) ;
    void removeUser(int user) ;
    void notify(String msg);
}
