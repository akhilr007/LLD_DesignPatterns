package Behavioral.ChainOfResponsibility.SupportTicketSystem;

public class ManagementSupport extends SupportHandler{

    @Override
    public void handleRequest(SupportTicket ticket) {

        if(ticket.getLevel() == 3){
            System.out.println("Management support handle ticket: " + ticket.getIssue());
        }
        else if (nextHandler != null) {
            nextHandler.handleRequest(ticket);
        }
    }
}
