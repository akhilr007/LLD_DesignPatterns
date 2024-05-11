package Behavioral.Observer;

public class CallCenter implements Observer{

    @Override
    public void update(Order order){
        System.out.println("Call center: Order #" + order.getId() + " is now " + order.getStatus() + ".");
    }
}
