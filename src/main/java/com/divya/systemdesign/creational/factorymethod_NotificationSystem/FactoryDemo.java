package com.divya.systemdesign.creational.factorymethod_NotificationSystem;

/*
 * Demo Class
 * Client only specifies the
 * notification type.
 * Factory decides which object
 * should be created.
 */

public class FactoryDemo {
    public static void main(String[] args) {
        OrderService service=new OrderService();
        service.placeOrder(NotificationType.EMAIL);
        service.placeOrder(NotificationType.SMS);
        service.placeOrder(NotificationType.PUSH);

    }
}
