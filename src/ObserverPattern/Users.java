package ObserverPattern;

public class Users {
    private int userId;

    public Users(int userId) {
        this.userId = userId;
    }

    public void notify(String msg) {
        System.out.println("User " + userId + " recieved message " + msg);
    }
}
