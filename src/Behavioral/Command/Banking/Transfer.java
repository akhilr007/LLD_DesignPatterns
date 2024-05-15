package Behavioral.Command.Banking;

// concrete command
public class Transfer implements Transaction{

    private Account fromAccount;
    private Account toAccount;
    private Double amount;

    public Transfer(Account fromAccount, Account toAccount, Double amount) {
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
        this.amount = amount;
    }

    @Override
    public void execute() {
        fromAccount.withdraw(amount);
        toAccount.deposit(amount);
    }

    @Override
    public void undo() {
        fromAccount.deposit(amount);
        toAccount.withdraw(amount);
    }
}
