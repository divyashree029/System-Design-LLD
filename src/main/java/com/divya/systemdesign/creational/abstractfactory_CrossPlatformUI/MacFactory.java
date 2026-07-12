package com.divya.systemdesign.creational.abstractfactory_CrossPlatformUI;

public class MacFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }
    @Override
    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
    @Override
    public TextField createTextField() {
        return new MacTextField();
    }

}
