package com.divya.systemdesign.creational.abstractfactory_CrossPlatformUI;

public class LinuxCheckbox implements Checkbox {
    @Override
    public void render() {
        System.out.println("Rendering Linux Checkbox");
    }

}
