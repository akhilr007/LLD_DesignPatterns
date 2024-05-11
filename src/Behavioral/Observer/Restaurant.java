package Behavioral.Observer;

public class Restaurant implements Observer{

    private String restaurantName;

    public Restaurant(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    @Override
    public void update(Order order) {
        System.out.println("Restaurant " + restaurantName + ": Order #" + order.getId() + " is now " + order.getStatus() + ".");
    }
}
