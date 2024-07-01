package com.codeWithSrb.DesignPattern.abstractFactoryPattern;

public class ModernFurnitureFactory implements BaseFurnitureFactory{

    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Bed createBed() {
        return new ModernBed();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }
}
