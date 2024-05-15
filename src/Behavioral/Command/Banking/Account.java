package Behavioral.Command.Banking;

// receiver
public class Account {

    private String accountNumber;
    private Double balance;

    public Account(String accountNumber, Double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(Double amount){
        balance += amount;
        System.out.println("Deposited " + amount + " to account " + accountNumber);
    }

    public void withdraw(Double amount){
        if(balance >= amount){
            balance -= amount;
            System.out.println("Withdrew " + amount + " from account " + accountNumber);
        }
        else{
            System.out.println("Insufficient balance");
        }
    }

    public Double getBalance(){
        return balance;
    }
}
