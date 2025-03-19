package ObserverPattern;

public class Main {
    public static void main(String[] args) {
        NotificationService notificationService = new NotificationService();

        notificationService.addUser(new Users(1));
        notificationService.addUser(new Users(2));
        notificationService.addUser(new Users(3));
        notificationService.addUser(new Users(4));

        notificationService.increaseStock(10);
        notificationService.decreaseStock(10);

        notificationService.removeUser(2);
        
        notificationService.increaseStock(5);

    }
}
