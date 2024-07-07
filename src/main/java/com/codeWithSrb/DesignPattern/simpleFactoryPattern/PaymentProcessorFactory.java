package com.codeWithSrb.DesignPattern.simpleFactoryPattern;

public class PaymentProcessorFactory {

    public static PaymentProcessor createPaymentProcessor(String paymentMethod) {

        if("Creditcard".equalsIgnoreCase(paymentMethod)) {
            return new CardPaymentProcessor();
        } else if ("Paypal".equalsIgnoreCase(paymentMethod)) {
            return new WalletPaymentProcessor();
        } else {
            throw new IllegalArgumentException("Payment method is not valid : "+ paymentMethod);
        }
    }
}