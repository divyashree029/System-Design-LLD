package com.divya.systemdesign.creational.factorymethod;

/*
 * Factory Class
 * Responsibility:
 * Create the appropriate Notification object based on the notification type.
 * Client classes should never use the 'new' keyword directly.
 */

public class NotificationFactory {
    /*
     * Factory Method- Returns the required notification object.
     */
    public static Notification createNotification(NotificationType type) {
        switch (type) {
            case EMAIL:
                return new EmailNotification();
            case SMS:
                return new SMSNotification();
            case PUSH:
                return new PushNotification();
            default:
                throw new IllegalArgumentException("Invalid Notification Type");

        }
    }

}
