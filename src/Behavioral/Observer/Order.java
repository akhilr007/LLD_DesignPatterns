package Behavioral.Observer;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private Integer id;
    private String status;
    private List<Observer> observers;

    public Order(Integer id) {
        this.id = id;
        this.status = "Order Placed";
        this.observers = new ArrayList<>();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
        notifyObservers();
    }

    public void attach(Observer observer){
        this.observers.add(observer);
    }

    public void detach(Observer observer){
        this.observers.remove(observer);
    }

    public void notifyObservers(){
        for(Observer observer: this.observers){
            observer.update(this);
        }
    }
}
