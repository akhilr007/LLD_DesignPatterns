package Creational.Prototype.Router;

public interface  NetworkDevice {
    NetworkDevice clone();
    void display();
    void update(String name);
}
