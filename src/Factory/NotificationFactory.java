package Factory;
import NotificationStrategy.Email;
import NotificationStrategy.Notification;
import Enum.NotificationType;
import NotificationStrategy.Push;
import NotificationStrategy.SMS;

public class NotificationFactory {
    public static Notification create(NotificationType notifType) {
        return switch (notifType) {
            case EMAIL -> new Email();
            case SMS -> new SMS();
            case PUSH -> new Push();
        };
    }
}
