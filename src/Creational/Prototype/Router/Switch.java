package Creational.Prototype.Router;

public class Switch implements NetworkDevice{

    private String name;
    private String protocol;

    public Switch(String name, String protocol) {
        this.name = name;
        this.protocol = protocol;
    }

    @Override
    public NetworkDevice clone() {
        return new Switch(name, protocol);
    }

    @Override
    public void display() {
        System.out.println("Switch - Name: " + name + ", Protocol: " + protocol);
    }

    @Override
    public void update(String name) {
        this.name = name;
    }
}
