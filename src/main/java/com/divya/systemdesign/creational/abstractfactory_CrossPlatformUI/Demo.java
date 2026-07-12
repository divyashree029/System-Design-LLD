package com.divya.systemdesign.creational.abstractfactory_CrossPlatformUI;

/*
 * Demo Class
 *
 * Purpose:
 * --------
 * Simulates application startup.
 *
 * Imagine the application detects
 * the operating system.
 *
 * Based on the OS,
 * the correct factory is selected.
 */

public class Demo {
    public static void main(String[] args) {
        GUIFactory factory;
        // Change ONLY this line
        factory = new WindowsFactory();
        // factory = new MacFactory();
        // factory = new LinuxFactory();
        Application application = new Application(factory);
        application.renderUI();

    }

}