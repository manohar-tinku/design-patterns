package com.pov.design.patterns.behavioral.strategy;

public class StrategyExample {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        PaymentStrategy creditCardPayment = new CreditCardPayment("1234567890123456", "John Doe");
        cart.setPaymentStrategy(creditCardPayment);
        cart.checkout(100);

        PaymentStrategy payPalPayment = new PayPalPayment("john@example.com");
        cart.setPaymentStrategy(payPalPayment);
        cart.checkout(50);
    }
}
