package Behavioral.ChainOfResponsibility.SwiggyOrder;

public class OrderPreparationHandler extends OrderHandler{

    public OrderPreparationHandler(OrderHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void processOrder(String order) {

        System.out.println("Preparing order: " + order);

        // if preparation is complete pass it to next handler
        if(nextHandler != null){
            nextHandler.processOrder(order);
        }
    }
}
