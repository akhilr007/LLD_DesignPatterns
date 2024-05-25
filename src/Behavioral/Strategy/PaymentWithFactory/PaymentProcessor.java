package Behavioral.Strategy.PaymentWithFactory;

// context
public class PaymentProcessor {

    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(String paymentMethod) {
        this.paymentStrategy = PaymentStrategyFactory.createPaymentStrategy(paymentMethod);
    }

    public void processPayment(Double amount){
        if(paymentStrategy != null){
            paymentStrategy.processPayment(amount);
        }
        else{
            System.out.println("Payment strategy not set");
        }
    }
}
