package com.codeWithSrb.DesignPattern.abstractFactoryPattern;

public class ModernSofa implements Sofa{

    public ModernSofa() {
        prepareSofa();
    }

    @Override
    public void prepareSofa() {
        System.out.println("Preparing modern sofa");
    }
}
