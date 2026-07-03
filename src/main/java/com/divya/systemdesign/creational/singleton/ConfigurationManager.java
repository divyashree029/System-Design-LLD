package com.divya.systemdesign.creational.singleton;

/*
 * Version 2
 * Goal:
 * Prevent other classes from creating objects directly.
 * Solution:
 * Make the constructor private.
 */

public class ConfigurationManager {


    /*
     * Static variable
     * Why static?
     * Because this object belongs to the CLASS,
     * not to individual objects.

     * Since we want only ONE ConfigurationManager,
     * we store it as a static variable.
     */
    private static ConfigurationManager instance = new ConfigurationManager();

    private String applicationName;
    private String databaseUrl;
    private String databaseUsername;
    private String theme;

    /*
     * Private Constructor
     * Only this class can call this constructor.

     * Any attempt to create an object from another class
     * using 'new ConfigurationManager()'
     * will result in a compilation error.
     */
    private ConfigurationManager() {

        System.out.println("Loading configuration...");

        applicationName = "Shopping Platform";
        databaseUrl = "localhost:3306";
        databaseUsername = "root";
        theme = "Dark";

    }
    /*
     * Public method to access the single object.
     * Nobody creates the object.
     * Everyone receives the same object.
     */
    public static ConfigurationManager getInstance() {
        return instance;

    }

    public void displayConfiguration() {
        System.out.println("Application Name : " + applicationName);
        System.out.println("Database URL     : " + databaseUrl);
        System.out.println("Database User    : " + databaseUsername);
        System.out.println("Theme            : " + theme);

    }

    /*
     * Observation:
     * Making the constructor private successfully prevents
     * other classes from creating multiple objects.
     * However, another problem arises.

     * Since no class can create an object anymore,
     * how will the application access ConfigurationManager?

     * We now need a controlled way to provide
     * the single object to everyone.

     * This leads us to the next step:
     * getInstance()
     */

}
