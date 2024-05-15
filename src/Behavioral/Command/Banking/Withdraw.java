package Behavioral.Command.Banking;

// concrete command
public class Withdraw implements Transaction{

    private Account account;
    private Double amount;

    public Withdraw(Account account, Double amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void execute() {
        account.withdraw(amount);
    }

    @Override
    public void undo() {
        account.deposit(amount);
    }
}
