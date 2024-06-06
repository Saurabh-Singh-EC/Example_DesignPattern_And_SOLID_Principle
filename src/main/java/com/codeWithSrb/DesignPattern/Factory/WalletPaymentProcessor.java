package com.codeWithSrb.DesignPattern.Factory;

import org.springframework.stereotype.Component;

@Component
public class WalletPaymentProcessor implements PaymentProcessor {

    @Override
    public PaymentType createPaymentType() {
        return new Paypal();
    }
}