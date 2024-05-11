package Behavioral.Observer;

public class Customer implements Observer{

    private String name;

    public Customer(String name) {
        this.name = name;
    }

    @Override
    public void update(Order order) {
        System.out.println("Hello, " + this.name + "!, Order #" + order.getId() + " is now " + order.getStatus() + ".") ;
    }
}
