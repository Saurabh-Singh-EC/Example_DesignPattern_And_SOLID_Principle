package com.codeWithSrb.DesignPattern.strategy;

public class PaypalPaymentStrategy implements PaymentStrategy {

    private String email;
    private String password;

    public PaypalPaymentStrategy(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public void pay(int amount) {
        System.out.println(String.format("%s pas been received through paypal payment method", amount));
    }
}