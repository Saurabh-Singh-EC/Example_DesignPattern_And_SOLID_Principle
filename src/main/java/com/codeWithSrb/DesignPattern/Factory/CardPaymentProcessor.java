package com.codeWithSrb.DesignPattern.Factory;

import org.springframework.stereotype.Component;

@Component
public class CardPaymentProcessor implements PaymentProcessor{

    @Override
    public PaymentType createPaymentType() {
        return new CreditCard();
    }
}
