package Behavioral.Observer;

public class DeliveryDriver implements Observer{

    private String driverName;

    public DeliveryDriver(String driverName) {
        this.driverName = driverName;
    }

    @Override
    public void update(Order order) {
        System.out.println("Driver " + driverName + ": Order #" + order.getId() + " is now " + order.getStatus() + ".");
    }
}
