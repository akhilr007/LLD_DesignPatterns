package Creational.Singleton.LazySingleton;

public class LazySingletonApp {

    public static void main(String[] args) {

        LazySingleton instance = LazySingleton.getInstance();
        System.out.println(instance);
    }
}
