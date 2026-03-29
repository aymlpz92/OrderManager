package NotificationStrategy;

public class Push implements Notification {
    @Override
    public void sendMessage() {
        System.out.println("Sending push to customer...");
    }
}
