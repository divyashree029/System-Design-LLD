package com.divya.systemdesign.creational.abstractfactory_CrossPlatformUI;

public class MacButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering Mac Button");
    }
}
