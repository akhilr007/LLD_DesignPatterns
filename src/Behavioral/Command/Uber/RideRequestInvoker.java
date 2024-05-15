package Behavioral.Command.Uber;

public class RideRequestInvoker {

    public void processRequest(Command command){
        command.execute();
    }
}
