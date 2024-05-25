package Behavioral.Strategy.Payment;

// concrete payment strategy
public class CreditCardPaymentStrategy implements PaymentStrategy{

    @Override
    public void processPayment(Double amount) {
        System.out.println("Processing credit card payment of $" + amount);
    }
}
