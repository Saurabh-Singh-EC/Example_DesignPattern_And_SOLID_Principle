package com.codeWithSrb.DesignPattern.abstractFactoryPattern;

public class ClassicSofa implements Sofa{

    public ClassicSofa() {
        prepareSofa();
    }

    @Override
    public void prepareSofa() {
        System.out.println("Preparing classic sofa");
    }
}
