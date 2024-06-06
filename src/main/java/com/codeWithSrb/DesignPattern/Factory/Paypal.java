package com.codeWithSrb.DesignPattern.Factory;

public class Paypal implements PaymentType {
    @Override
    public void pay() {
        System.out.println("Paying through Paypal");
    }
}
