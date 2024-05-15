package Behavioral.ChainOfResponsibility.SupportTicketSystem;

public class FrontLineSupport extends SupportHandler{

    @Override
    public void handleRequest(SupportTicket ticket) {

        if(ticket.getLevel() == 1){
            System.out.println("Front-line support handled ticket: " + ticket.getIssue());
        }
        else if(nextHandler != null){
            nextHandler.handleRequest(ticket);
        }
    }
}
