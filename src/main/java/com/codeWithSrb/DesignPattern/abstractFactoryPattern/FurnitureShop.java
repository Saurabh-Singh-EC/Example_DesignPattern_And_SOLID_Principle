package com.codeWithSrb.DesignPattern.abstractFactoryPattern;

public class FurnitureShop {

    public void buyFurniture(String furnitureType) {

        BaseFurnitureFactory baseFurnitureFactory;
        OrderFurniture orderFurniture;

        switch (furnitureType) {

            case "Modern":
                baseFurnitureFactory = new ModernFurnitureFactory();
                orderFurniture = new OrderFurniture(baseFurnitureFactory);
                orderFurniture.createOrder();
                orderFurniture.saveOrderAndSubmit();
                break;
            case "Classic":
                baseFurnitureFactory = new ClassicFurnitureFactory();
                orderFurniture = new OrderFurniture(baseFurnitureFactory);
                orderFurniture.createOrder();
                orderFurniture.saveOrderAndSubmit();
                break;
            case "OldStyle":
                baseFurnitureFactory = new OlyStyleFurnitureFactory();
                orderFurniture = new OrderFurniture(baseFurnitureFactory);
                orderFurniture.createOrder();
                orderFurniture.saveOrderAndSubmit();
                break;
            default: throw new IllegalArgumentException("Given furniture type is not supported");
        }
    }
}