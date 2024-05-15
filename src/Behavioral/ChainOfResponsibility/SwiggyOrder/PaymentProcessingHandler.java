package Behavioral.ChainOfResponsibility.SwiggyOrder;

public class PaymentProcessingHandler extends OrderHandler{


    public PaymentProcessingHandler(OrderHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void processOrder(String order) {

        System.out.println("Processing payment for order: " + order);

        // if payment is successful, pass it to next handler
        if(nextHandler != null){
            nextHandler.processOrder(order);
        }
    }
}
