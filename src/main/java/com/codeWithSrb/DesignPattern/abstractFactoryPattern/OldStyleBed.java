package com.codeWithSrb.DesignPattern.abstractFactoryPattern;

public class OldStyleBed implements Bed{

    public OldStyleBed() {
        prepareBed();
    }

    @Override
    public void prepareBed() {
        System.out.println("Preparing old style bed");
    }
}
