package com.codeWithSrb.DesignPattern.abstractFactoryPattern;

public class OrderFurniture {

    private final BaseFurnitureFactory baseFurnitureFactory;


    public OrderFurniture(BaseFurnitureFactory baseFurnitureFactory) {
        this.baseFurnitureFactory = baseFurnitureFactory;
    }

    public void createOrder() {
        System.out.println("Creating order for furniture");
        baseFurnitureFactory.createBed();
        baseFurnitureFactory.createChair();
        baseFurnitureFactory.createSofa();
        System.out.println("Order for furniture created");
    }

    public void saveOrderAndSubmit() {
        System.out.println("created order is saved and submitted successfully");
    }
}
