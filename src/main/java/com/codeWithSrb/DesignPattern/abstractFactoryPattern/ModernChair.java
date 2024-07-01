package com.codeWithSrb.DesignPattern.abstractFactoryPattern;

public class ModernChair implements Chair {

    public ModernChair() {
        prepareChair();
    }

    @Override
    public void prepareChair() {
        System.out.println("Preparing modern chair");
    }
}
