package com.divya.systemdesign.creational.abstractfactory_CrossPlatformUI;

public class WindowsButton implements Button{
    @Override
    public void render(){
        System.out.println("Rendering Windows Button");
    }
}
