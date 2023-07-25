package notification_service;

import java.util.Scanner;

public class ClientSide {
    public static void main(String[] args) {
        // load services
        NotificationService emailNotification = new EmailNotification();
        SendNotification email = new SendNotification(emailNotification);

        NotificationService smsNotification = new SmsNotification();
        SendNotification sms = new SendNotification(smsNotification);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter receivers phone or email");
        String receiver = scanner.nextLine();

        System.out.println("Enter the notification text");
        String message = scanner.nextLine();

        if (receiver.matches("^\\+8801.*$") || receiver.matches("^01.*$") || receiver.matches("1.*$")) {
            sms.runService(receiver, message);
        } else if (receiver.matches("^[\\w.]+@[\\w.]+\\.[\\w.]+$")) {
            email.runService(receiver, message);
        } else {
            System.out.println("Enter a valid email or phone number.");
        }

    }
}
