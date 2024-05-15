package Behavioral.Command.Uber;

public class RideCancelCommand implements Command{

    private RideService receiver;
    private String passenger;

    public RideCancelCommand(RideService receiver, String passenger) {
        this.receiver = receiver;
        this.passenger = passenger;
    }

    @Override
    public void execute() {
        this.receiver.cancelRide(passenger);
    }
}
