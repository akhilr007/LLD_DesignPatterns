package Behavioral.Template;

public class InternationalOrderProcessor extends OrderProcessingTemplate{
    @Override
    void verifyOrder() {
        System.out.println("verifying international order");
    }

    @Override
    void assignDeliveryAgent() {
        System.out.println("assigning a international delivery agent");
    }

    @Override
    void trackOrder() {
        System.out.println("tracking international order");
    }
}
