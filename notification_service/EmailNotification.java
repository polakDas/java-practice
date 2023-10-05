package notification_service;

public class EmailNotification implements NotificationService {
    @Override
    public void sendNotification(String receiver, String message) {
        System.out.println("Notification sending via Email...");
    }
}
