package Behavioral.Strategy.Payment;

// context
public class PaymentProcessor {

    private PaymentStrategy paymentStrategy;

    public PaymentProcessor(){
        this.paymentStrategy = null;
    }

    public void setPaymentStrategy(PaymentStrategy strategy) {

        if(this.paymentStrategy != null){
            this.paymentStrategy = null;
        }
        this.paymentStrategy = strategy;
    }

    public void processPayment(Double amount){

        if(this.paymentStrategy != null){
            this.paymentStrategy.processPayment(amount);
        }
        else{
            System.out.println("Payment strategy is not set");
        }
    }
}
