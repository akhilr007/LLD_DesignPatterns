package Behavioral.Template;

public abstract class OrderProcessingTemplate {

    public final void processOrder(){
        verifyOrder();
        assignDeliveryAgent();
        trackOrder();
    }

    abstract void verifyOrder();
    abstract void assignDeliveryAgent();
    abstract void trackOrder();
}
