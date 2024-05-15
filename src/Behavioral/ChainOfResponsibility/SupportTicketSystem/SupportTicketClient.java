package Behavioral.ChainOfResponsibility.SupportTicketSystem;

public class SupportTicketClient {

    public static void main(String[] args) {

        SupportHandler frontLine = new FrontLineSupport();
        SupportHandler technical = new TechnicalSupport();
        SupportHandler management = new ManagementSupport();

        frontLine.setNextHandler(technical);
        technical.setNextHandler(management);

        SupportTicket ticket1 = new SupportTicket("Password reset", 1);
        SupportTicket ticket2 = new SupportTicket("Software installation", 2);
        SupportTicket ticket3 = new SupportTicket("Budget Approval", 3);

        frontLine.handleRequest(ticket1);
        frontLine.handleRequest(ticket2);
        frontLine.handleRequest(ticket3);
    }
}
