package Behavioral.Command.Banking;

public class BankClient {

    public static void main(String[] args) {

        // creating receiver
        Account account1 = new Account("12345", 1000.00);
        Account account2 = new Account("98765", 2000.00);

        // creating invoker
        TransactionInvoker invoker = new TransactionInvoker();

        // creating command
        Transaction deposit = new Deposit(account1, 500.00);
        Transaction withdraw = new Withdraw(account2, 100.00);
        Transaction transfer = new Transfer(account1, account2, 700.00);

        // execute transaction
        invoker.executeTransaction(deposit);
        invoker.executeTransaction(withdraw);
        invoker.executeTransaction(transfer);

        System.out.println("Account 1 balance : " + account1.getBalance());
        System.out.println("Account 2 balance : " + account2.getBalance());

        invoker.undoLastTransaction();

        System.out.println("Account 1 balance : " + account1.getBalance());
        System.out.println("Account 2 balance : " + account2.getBalance());
    }
}
