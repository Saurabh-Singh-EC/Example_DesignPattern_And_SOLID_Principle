package com.codeWithSrb.DesignPattern.abstractFactoryPattern;

public class OldStyleSofa implements Sofa{

    public OldStyleSofa() {
        prepareSofa();
    }

    @Override
    public void prepareSofa() {
        System.out.println("Preparing old style sofa");
    }
}
