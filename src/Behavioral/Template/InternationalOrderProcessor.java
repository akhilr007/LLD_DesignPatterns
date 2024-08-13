package Behavioral.Template;

public class InternationalOrderProcessor extends OrderProcessingTemplate{
    @Override
    protected void verifyOrder() {
        System.out.println("verifying international order");
    }

    @Override
    protected void assignDeliveryAgent() {
        System.out.println("assigning a international delivery agent");
    }

    @Override
    protected void trackOrder() {
        System.out.println("tracking international order");
    }
}
