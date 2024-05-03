package Creational.Singleton.SimpleSingleton;

public class SimpleSingleton {

    private static SimpleSingleton instance;

    // private constructor so that no objects can be created
    private SimpleSingleton() {}

    public static SimpleSingleton getInstance(){
        if(instance == null){
            return instance = new SimpleSingleton();
        }

        return instance;
    }
}
