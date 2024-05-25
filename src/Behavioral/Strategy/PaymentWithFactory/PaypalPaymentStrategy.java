package Behavioral.Strategy.PaymentWithFactory;

public class PaypalPaymentStrategy implements PaymentStrategy{

    @Override
    public void processPayment(Double amount) {
        System.out.println("Processing paypal payment of $" + amount);
    }
}
