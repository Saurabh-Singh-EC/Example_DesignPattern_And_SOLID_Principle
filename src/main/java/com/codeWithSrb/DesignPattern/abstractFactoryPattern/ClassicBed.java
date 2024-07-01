package com.codeWithSrb.DesignPattern.abstractFactoryPattern;

public class ClassicBed implements Bed{

    public ClassicBed() {
        prepareBed();
    }

    @Override
    public void prepareBed() {
        System.out.println("Preparing classic bed");
    }
}
