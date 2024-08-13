package Behavioral.Template;

public abstract class OrderProcessingTemplate {

    public final void processOrder(){
        verifyOrder();
        assignDeliveryAgent();
        trackOrder();
    }

    protected abstract void verifyOrder();
    protected abstract void assignDeliveryAgent();
    protected abstract void trackOrder();
}
