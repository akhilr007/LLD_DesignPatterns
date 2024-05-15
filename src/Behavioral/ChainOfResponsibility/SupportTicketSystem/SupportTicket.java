package Behavioral.ChainOfResponsibility.SupportTicketSystem;

public class SupportTicket {

    private String issue;
    private int level;

    public SupportTicket(String issue, int level) {
        this.issue = issue;
        this.level = level;
    }

    public String getIssue() {
        return issue;
    }

    public int getLevel() {
        return level;
    }
}
