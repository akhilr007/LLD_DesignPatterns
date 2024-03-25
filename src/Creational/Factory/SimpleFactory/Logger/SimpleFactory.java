package Creational.Factory.SimpleFactory.Logger;

import Creational.Factory.SimpleFactory.Logger.ILogger;
import Creational.Factory.SimpleFactory.Logger.LogLevel;
import Creational.Factory.SimpleFactory.Logger.LoggerFactory;

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
