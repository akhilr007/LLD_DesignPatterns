package Behavioral.Strategy.PaymentWithFactory;

public class PaymentStrategyFactory {

    public static PaymentStrategy createPaymentStrategy(String paymentMethod){

        if (paymentMethod.equalsIgnoreCase("credit card")){
            return new CreditCardPaymentStrategy();
        }
        else if(paymentMethod.equalsIgnoreCase("paypal")){
            return new PaypalPaymentStrategy();
        }
        else{
            // default payment
            return new CreditCardPaymentStrategy();
        }
    }
}
