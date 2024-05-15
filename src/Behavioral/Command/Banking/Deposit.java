package Behavioral.Command.Banking;

// concrete command
public class Deposit implements Transaction{

    private Account account;
    private Double amount;

    public Deposit(Account account, Double amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void execute() {
        account.deposit(amount);
    }

    @Override
    public void undo() {
        account.withdraw(amount);
    }
}
