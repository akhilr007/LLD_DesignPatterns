package Creational.Prototype.Router;

public class RouterPrototypeApplication {
    public static void main(String[] args) {

        NetworkDevice routerPrototype = new Router("Router A", "192.168.1.1", "Firewall Enabled");
        NetworkDevice switchPrototype = new Switch("Switch X", "ethernet");

        NetworkDevice routerClone = routerPrototype.clone();
        NetworkDevice switchClone = routerPrototype.clone();

        System.out.println("Router Clone");
        routerClone.display();

        System.out.println("Switch Clone");
        switchClone.display();

        routerClone.update("Router B");
        switchClone.update("Switch Y");

        System.out.println("Updated Router clone");
        routerClone.display();

        System.out.println("Updated Switch clone");
        switchClone.display();
    }
}
