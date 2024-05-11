package Behavioral.Observer;

public class OrderStatus {

    public static void main(String[] args) {


        Order order1 = new Order(123);

        Customer customer = new Customer("Raj");
        Restaurant restaurant = new Restaurant("Hotel Jolly");
        DeliveryDriver deliveryDriver = new DeliveryDriver("Ajit");
        CallCenter callCenter = new CallCenter();

        order1.attach(customer);
        order1.attach(restaurant);
        order1.attach(deliveryDriver);
        order1.attach(callCenter);

        order1.setStatus("Out for Delivery");

        order1.detach(callCenter);

        order1.setStatus("Delivered");

        order1.detach(deliveryDriver);
    }
}
