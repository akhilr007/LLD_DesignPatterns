package Creational.Factory.FactoryMethod.Logger;

public class DebugLoggerFactory implements ILoggerFactory{
    @Override
    public ILogger createLogger() {
        return new DebugLogger();
    }
}
