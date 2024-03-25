package Creational.Factory.SimpleFactory.Logger;

import Creational.Factory.SimpleFactory.Logger.ILogger;

public class InfoLogger implements ILogger {

    @Override
    public void log(){
        System.out.println("This is info logger");
    }
}
