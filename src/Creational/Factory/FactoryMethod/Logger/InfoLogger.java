package Creational.Factory.FactoryMethod.Logger;

public class InfoLogger implements ILogger{

    @Override
    public void log() {
        System.out.println("This is info logger");
    }
}
