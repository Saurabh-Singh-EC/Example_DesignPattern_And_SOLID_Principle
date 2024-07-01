package com.codeWithSrb.DesignPattern.abstractFactoryPattern;

public class ClassicFurnitureFactory implements BaseFurnitureFactory{

    @Override
    public Chair createChair() {
        return new ClassicChair();
    }

    @Override
    public Bed createBed() {
        return new ClassicBed();
    }

    @Override
    public Sofa createSofa() {
        return new ClassicSofa();
    }
}
