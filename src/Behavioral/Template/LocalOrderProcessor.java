package Behavioral.Template;

public class LocalOrderProcessor extends OrderProcessingTemplate {

    @Override
    void verifyOrder() {
        System.out.println("Verifying local order");
    }

    @Override
    void assignDeliveryAgent() {
        System.out.println("assigning a local delivery agent");
    }

    @Override
    void trackOrder() {
        System.out.println("tracking a local order");
    }
}
