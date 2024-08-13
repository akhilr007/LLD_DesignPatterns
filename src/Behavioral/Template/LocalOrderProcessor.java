package Behavioral.Template;

public class LocalOrderProcessor extends OrderProcessingTemplate {

    @Override
    protected void verifyOrder() {
        System.out.println("Verifying local order");
    }

    @Override
    protected void assignDeliveryAgent() {
        System.out.println("assigning a local delivery agent");
    }

    @Override
    protected void trackOrder() {
        System.out.println("tracking a local order");
    }
}
