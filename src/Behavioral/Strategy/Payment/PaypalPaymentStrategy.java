package Behavioral.Strategy.Payment;

// concrete payment strategy
public class PaypalPaymentStrategy implements PaymentStrategy{

    @Override
    public void processPayment(Double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
    }
}
