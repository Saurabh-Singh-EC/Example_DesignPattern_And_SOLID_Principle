package com.codeWithSrb.DesignPattern.abstractFactoryPattern;

public class OlyStyleFurnitureFactory implements BaseFurnitureFactory{

    @Override
    public Chair createChair() {
        return new OldStyleChair();
    }

    @Override
    public Bed createBed() {
        return new OldStyleBed();
    }

    @Override
    public Sofa createSofa() {
        return new OldStyleSofa();
    }
}
