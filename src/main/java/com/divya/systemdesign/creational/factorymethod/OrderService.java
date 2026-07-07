package com.divya.systemdesign.creational.factorymethod;


public class OrderService{
    public void placeOrder(NotificationType type) {
        System.out.println("Order Placed Successfully.");
        Notification notification = NotificationFactory.createNotification(type);
        notification.send();

    }
}
/*
 * Naive Implementation
 * Problem:
 * OrderService is responsible for
 * creating notification objects.

 * This violates:
 * Open Closed Principle

 */
/*
public class OrderService {
    public void placeOrder(String notificationType) {
        System.out.println("Order Placed Successfully.");

        if(notificationType.equalsIgnoreCase("EMAIL")){
            EmailNotification email = new EmailNotification();
            email.send();
        }

        else if(notificationType.equalsIgnoreCase("SMS")){
            SMSNotification sms = new SMSNotification();
            sms.send();
        }

        else if(notificationType.equalsIgnoreCase("PUSH")){
            PushNotification push = new PushNotification();
            push.send();
        }

        else{
            System.out.println("Invalid Notification Type");
        }

    }



}
*/

