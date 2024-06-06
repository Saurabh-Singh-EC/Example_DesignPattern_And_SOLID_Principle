package com.codeWithSrb.DesignPattern.Factory;

public class CreditCard implements PaymentType {
    @Override
    public void pay() {
        System.out.println("Paying through credit card");
    }
}
