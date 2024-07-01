package com.codeWithSrb.DesignPattern.abstractFactoryPattern;

public interface BaseFurnitureFactory {
    Chair createChair();
    Bed createBed();
    Sofa createSofa();
}
