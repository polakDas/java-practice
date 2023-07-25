package notification_service;

public class SendNotification {
    private final NotificationService notificationService;

    public SendNotification(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void runService(String receiver, String message) {
        notificationService.sendNotification(receiver, message);
    }
}
