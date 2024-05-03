package Creational.Singleton.SimpleSingleton;

public class SimpleSingletonApplication {

    public static void main(String[] args) {

        SimpleSingleton instance = SimpleSingleton.getInstance();
        System.out.println(instance);
    }
}
