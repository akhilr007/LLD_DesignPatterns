package Behavioral.Command.Banking;

// command
public interface Transaction {

    void execute();
    void undo();
}
