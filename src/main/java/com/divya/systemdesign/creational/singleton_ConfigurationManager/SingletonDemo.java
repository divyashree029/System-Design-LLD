package com.divya.systemdesign.creational.singleton_ConfigurationManager;

/*
 * Demo Class
 * Purpose:
 * --------
 * Simulate multiple services creating ConfigurationManager objects.
 * In a real application:
 * UserService
 * OrderService
 * PaymentService
 * all might create their own ConfigurationManager.
 * We want to observe why this is a bad design.
 */

public class SingletonDemo {
    public static void main(String[] args) {

        //here this implementation is called as Eager Singleton.
        //because the obj is created immediately

        ConfigurationManager config1 = ConfigurationManager.getInstance();
        ConfigurationManager config2 = ConfigurationManager.getInstance();
        ConfigurationManager config3 = ConfigurationManager.getInstance();

        System.out.println(config1);
        System.out.println(config2);
        System.out.println(config3);

    }
}