package Behavioral.Strategy.PaymentWithFactory;

public class PaymentApplication {

    public static void main(String[] args) {

        PaymentProcessor paymentProcessor = new PaymentProcessor();

        paymentProcessor.setPaymentStrategy("credit card");
        paymentProcessor.processPayment(899.99);

        paymentProcessor.setPaymentStrategy("paypal");
        paymentProcessor.processPayment(9000.9);
    }
}
