package com.codeWithSrb.DesignPattern.abstractFactoryPattern;

public class OldStyleChair implements Chair {

    public OldStyleChair() {
        prepareChair();
    }

    @Override
    public void prepareChair() {
        System.out.println("preparing old style chair");
    }
}
