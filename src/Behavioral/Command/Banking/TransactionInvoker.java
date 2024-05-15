package Behavioral.Command.Banking;

import java.util.Stack;

public class TransactionInvoker {

    private Stack<Transaction> transactionHistory = new Stack<>();

    public void executeTransaction(Transaction transaction){
        transaction.execute();
        transactionHistory.push(transaction);
    }

    public void undoLastTransaction(){
        if(!transactionHistory.empty()){
            Transaction transaction = transactionHistory.pop();
            transaction.undo();
        }
    }
}
