package com.divya.systemdesign.creational.abstractfactory_CrossPlatformUI;

public class WindowsTextField implements TextField {
    @Override
    public void render() {
        System.out.println("Rendering Windows TextField");
    }
}
