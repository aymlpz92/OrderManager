package NotificationStrategy;

public class Email implements Notification{
    @Override
    public void sendMessage() {
        System.out.println("Sending email to customer...");
    }
}
