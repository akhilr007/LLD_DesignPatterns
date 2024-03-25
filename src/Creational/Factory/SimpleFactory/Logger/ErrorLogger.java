package Creational.Factory.SimpleFactory.Logger;

public class ErrorLogger implements ILogger {

    @Override
    public void log(){
        System.out.println("This is error logger");
    }
}
