package Creational.Factory.SimpleFactory.Logger;

/**
 * Here the LoggerFactory violates the Open - Closed Principle
 * If new types of objects need to be added, as it requires modifying the factory class itself.
 * like DEV_LEVEL
*/

public interface LoggerFactory {
    public static ILogger createLogger(LogLevel logLevel){
        switch(logLevel){
            case INFO -> {
                return new InfoLogger();
            }
            case ERROR -> {
                return new ErrorLogger();
            }
            case DEBUG -> {
                return new DebugLogger();
            }
            default -> {
                throw new IllegalArgumentException(logLevel + " is not supported ");
            }
        }
    }
}
