package Factory.FactoryMethod.Logger;

public class FactoryMethod {
    public static void main(String[] args) {
        ILoggerFactory loggerFactory = new ErrorLoggerFactory();
        ILogger logger = loggerFactory.createLogger();

        logger.log();
    }
}
