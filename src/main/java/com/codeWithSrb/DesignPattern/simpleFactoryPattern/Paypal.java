package com.codeWithSrb.DesignPattern.simpleFactoryPattern;

public class Paypal implements PaymentType {
    @Override
    public void pay() {
        System.out.println("Paying through Paypal");
    }
}
