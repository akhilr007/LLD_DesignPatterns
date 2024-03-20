package Factory.SimpleFactory.Logger;

import Factory.SimpleFactory.Logger.ILogger;
import Factory.SimpleFactory.Logger.LogLevel;
import Factory.SimpleFactory.Logger.LoggerFactory;

public class SimpleFactory {
    public static void main(String[] args) {
        ILogger debugLogger = LoggerFactory.createLogger(LogLevel.DEBUG);
        ILogger errorLogger = LoggerFactory.createLogger(LogLevel.ERROR);
        ILogger infoLogger  = LoggerFactory.createLogger(LogLevel.INFO);

        debugLogger.log();
        errorLogger.log();
        infoLogger.log();
    }
}
