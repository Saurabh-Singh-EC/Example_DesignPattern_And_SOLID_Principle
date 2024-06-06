package com.codeWithSrb.DesignPattern.strategy;

public class CreditCardPaymentStrategy implements PaymentStrategy {

    private String cardHolderName;
    private Long cardNumber;
    private int cvv;
    private String dateOfExpiry;

    public CreditCardPaymentStrategy(String cardHolderName, Long cardNumber, int cvv, String dateOfExpiry) {
        this.cardHolderName = cardHolderName;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.dateOfExpiry = dateOfExpiry;
    }

    @Override
    public void pay(int amount) {
        System.out.println(String.format("%s has been received through credit card payment method", amount));
    }
}