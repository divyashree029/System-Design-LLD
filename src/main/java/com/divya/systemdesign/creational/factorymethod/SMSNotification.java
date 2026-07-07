package com.divya.systemdesign.creational.factorymethod;

public class SMSNotification implements Notification{
    @Override
    public void send(){
        System.out.println("SMS notification sent");
    }
}
