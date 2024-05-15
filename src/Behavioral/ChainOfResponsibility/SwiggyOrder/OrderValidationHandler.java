package Behavioral.ChainOfResponsibility.SwiggyOrder;

public class OrderValidationHandler extends OrderHandler{

    public OrderValidationHandler(OrderHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void processOrder(String order) {

        System.out.println("Validating order..." + order);

        // if order is valid, pass it to next handler
        if(nextHandler != null){
            nextHandler.processOrder(order);
        }
    }
}
