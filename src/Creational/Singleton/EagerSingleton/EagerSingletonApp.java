package Creational.Singleton.EagerSingleton;

public class EagerSingletonApp {

    public static void main(String[] args) {

        EagerSingleton instance = EagerSingleton.getInstance();
        System.out.println(instance);
    }
}
