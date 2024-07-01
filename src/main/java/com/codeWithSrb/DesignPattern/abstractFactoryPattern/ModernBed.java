package com.codeWithSrb.DesignPattern.abstractFactoryPattern;

public class ModernBed implements Bed{

    public ModernBed() {
        prepareBed();
    }

    @Override
    public void prepareBed() {
        System.out.println("Preparing modern bed");
    }
}
