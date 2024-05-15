package Behavioral.ChainOfResponsibility.SupportTicketSystem;

public class TechnicalSupport extends SupportHandler{

    @Override
    public void handleRequest(SupportTicket ticket) {

        if(ticket.getLevel() == 2){
            System.out.println("Technical support handled ticket: " + ticket.getIssue());
        }
        else if(nextHandler != null){
            nextHandler.handleRequest(ticket);
        }
    }
}
