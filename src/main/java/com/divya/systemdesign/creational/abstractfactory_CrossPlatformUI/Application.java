package com.divya.systemdesign.creational.abstractfactory_CrossPlatformUI;
/*
 * Client Class
 *
 * Purpose:
 * --------
 * This class represents our application.
 *
 * The application does NOT know whether it is
 * using Windows, Mac, or Linux components.
 *
 * It only communicates with:
 * - GUIFactory
 * - Button
 * - Checkbox
 * - TextField
 *
 * This keeps our application loosely coupled.
 */
public class Application {
    private final Button button;
    private final Checkbox checkbox;
    private final TextField textField;
    /*
     * Constructor Injection
     *
     * The factory creates the required family
     * of UI components.
     */
    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
        textField = factory.createTextField();
    }

    /*
     * Render the complete UI
     */
    public void renderUI() {
        System.out.println("Loading Application UI...\n");
        button.render();
        checkbox.render();
        textField.render();
    }
}
