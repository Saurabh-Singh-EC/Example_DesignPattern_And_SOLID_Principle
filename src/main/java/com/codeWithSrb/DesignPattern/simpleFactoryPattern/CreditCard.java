package com.codeWithSrb.DesignPattern.simpleFactoryPattern;

public class CreditCard implements PaymentType {
    @Override
    public void pay() {
        System.out.println("Paying through credit card");
    }
}
