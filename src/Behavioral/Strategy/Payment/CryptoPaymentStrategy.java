package Behavioral.Strategy.Payment;

// concrete payment strategy
public class CryptoPaymentStrategy implements PaymentStrategy{

    @Override
    public void processPayment(Double amount) {
        System.out.println("Processing Crypto payment of $" + amount);
    }
}
