package Behavioral.Command.Uber;

// receiver
public class RideService {

    void requestRide(String passenger, String source, String destination){
        System.out.println("Requesting a ride for passenger: " + passenger + " from " + source + " to " + destination);
    }

    void cancelRide(String passenger){
        System.out.println("Cancelling a ride for passenger " + passenger);
    }
}
