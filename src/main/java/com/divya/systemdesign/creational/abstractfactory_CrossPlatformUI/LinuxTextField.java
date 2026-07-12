package com.divya.systemdesign.creational.abstractfactory_CrossPlatformUI;

public class LinuxTextField implements TextField {
    @Override
    public void render() {
        System.out.println("Rendering Linux TextField");
    }
}