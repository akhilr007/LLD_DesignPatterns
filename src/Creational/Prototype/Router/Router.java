package Creational.Prototype.Router;

public class Router implements NetworkDevice{

    private String name;
    private String ip;
    private String securityPolicy;

    public Router(String name, String ip, String securityPolicy) {
        this.name = name;
        this.ip = ip;
        this.securityPolicy = securityPolicy;
    }

    @Override
    public NetworkDevice clone() {
        return new Router(name, ip, securityPolicy);
    }

    @Override
    public void display() {
        System.out.println("Router - Name: " + name + ", IP: " + ip + ", Security Policy: " + securityPolicy);
    }

    @Override
    public void update(String name) {
        this.name = name;
    }
}
