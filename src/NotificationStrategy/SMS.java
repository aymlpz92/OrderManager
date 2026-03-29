package NotificationStrategy;

public class SMS implements Notification {
    @Override
    public void sendMessage() {
        System.out.println("Sending SMS to customer...");
    }
}
