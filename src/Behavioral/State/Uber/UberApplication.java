package Behavioral.State.Uber;

public class UberApplication {

    public static void main(String[] args) {

        RideService receiver = new RideService();

        RideRequestInvoker invoker = new RideRequestInvoker();

        Command request1 = new RideRequestCommand(receiver, "delhi", "gurgaon", "ravi");
        Command request2 = new RideRequestCommand(receiver, "gurgaon", "delhi", "preeti");
        Command request3 = new RideCancelCommand(receiver, "preeti");

        invoker.processRequest(request1);
        invoker.processRequest(request2);
        invoker.processRequest(request3);
    }
}
