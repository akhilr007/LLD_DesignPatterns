package Behavioral.Strategy.Payment;

public class PaymentApp {

    public static void main(String[] args) {

        PaymentProcessor paymentProcessor = new PaymentProcessor();

        paymentProcessor.setPaymentStrategy(new CreditCardPaymentStrategy());
        paymentProcessor.processPayment(5000.00);

        paymentProcessor.setPaymentStrategy(new CryptoPaymentStrategy());
        paymentProcessor.processPayment(8999.98);
    }
}
