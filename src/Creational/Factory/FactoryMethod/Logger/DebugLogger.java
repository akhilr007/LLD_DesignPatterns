package Creational.Factory.FactoryMethod.Logger;

public class DebugLogger implements ILogger{
    @Override
    public void log() {
        System.out.println("This is debug logger");
    }
}
