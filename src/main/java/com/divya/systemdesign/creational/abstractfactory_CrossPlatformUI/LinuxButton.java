package com.divya.systemdesign.creational.abstractfactory_CrossPlatformUI;

public class LinuxButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering Linux Button");
    }

}
