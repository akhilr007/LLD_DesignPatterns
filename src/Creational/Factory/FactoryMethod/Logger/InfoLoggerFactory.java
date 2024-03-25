package Creational.Factory.FactoryMethod.Logger;

public class InfoLoggerFactory implements ILoggerFactory{
    @Override
    public ILogger createLogger() {
        return new InfoLogger();
    }
}
