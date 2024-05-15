package Behavioral.ChainOfResponsibility.SwiggyOrder;

public class SwiggyOrderApp {

    public static void main(String[] args) {

        OrderHandler orderProcessingChain = new OrderValidationHandler
                (new PaymentProcessingHandler(
                        new OrderPreparationHandler(
                                new DeliveryAssignmentHandler(
                                        new OrderTrackingHandler(null)))));

        String order = "Pizza";
        orderProcessingChain.processOrder(order);
    }
}
