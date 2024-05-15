package Behavioral.ChainOfResponsibility.SupportTicketSystem;

public abstract class SupportHandler {

    protected SupportHandler nextHandler;

    public void setNextHandler(SupportHandler nextHandler){
        this.nextHandler = nextHandler;
    }

    public abstract void handleRequest(SupportTicket ticket);
}

