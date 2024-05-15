package Behavioral.ChainOfResponsibility.SwiggyOrder;

public class DeliveryAssignmentHandler extends OrderHandler{

    public DeliveryAssignmentHandler(OrderHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void processOrder(String order) {

        System.out.println("Assigned delivery for order: " + order);

        // if delivery is assigned, pass it to next handler
        if(nextHandler != null){
            nextHandler.processOrder(order);
        }
    }
}
