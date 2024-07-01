package com.codeWithSrb.DesignPattern.abstractFactoryPattern;

public class ClassicChair implements Chair{

    public ClassicChair() {
        prepareChair();
    }

    @Override
    public void prepareChair() {
        System.out.println("Preparing classic chair");
    }
}
