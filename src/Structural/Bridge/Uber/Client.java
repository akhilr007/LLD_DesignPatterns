package Structural.Bridge.Uber;

public class Client {

    public static void main(String[] args) {

        // create an uber ride with driver
        UberRide uber = new UberRide("Yash");

        // create different navigation implementations
        GoogleMap googleMap = new GoogleMap();
        AppleMap appleMap = new AppleMap();

        uber.setNavigationImpl(googleMap);
        uber.navigate("Railway station");

        UberEats uberEats = new UberEats("Aggarwal sweets");

        uberEats.setNavigationImpl(appleMap);
        uberEats.navigate("Connaught Place");
    }
}
