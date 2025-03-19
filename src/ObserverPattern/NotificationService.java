package ObserverPattern;
import java.util.ArrayList;
import java.util.List;

public class NotificationService implements PublisherInterface{
    private int stock;
    private List<Users> userList;
    NotificationService() {
        stock = 0;
        userList = new ArrayList<>();
    }
    @Override
    public void addUser(Users userId) {
        userList.add(userId);
    }

    @Override
    public void removeUser(int userId) {
        userList.remove(userId);
    }

    @Override
    public void notify(String msg) {
        for(Users user : userList) {
            user.notify(msg);
        }
    }

    public void increaseStock(int num) {
        if(stock == 0) {
            notify("Item in stock");
        }
        stock += num;
    }

    public void decreaseStock(int num) {
        stock -= num;
    }
}
