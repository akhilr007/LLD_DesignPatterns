package Behavioral.State.Uber;

public class RideRequestCommand implements Command{

    private RideService receiver;
    private String source;
    private String destination;
    private String passenger;

    public RideRequestCommand(RideService receiver, String source, String destination, String passenger) {
        this.receiver = receiver;
        this.source = source;
        this.destination = destination;
        this.passenger = passenger;
    }

    @Override
    public void execute() {
        this.receiver.requestRide(passenger, source, destination);
    }
}
