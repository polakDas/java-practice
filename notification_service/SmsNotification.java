package notification_service;

public class SmsNotification implements NotificationService {
    @Override
    public void sendNotification(String receiver, String message) {
        System.out.println("Sending Notification via SMS...");
    }
}
