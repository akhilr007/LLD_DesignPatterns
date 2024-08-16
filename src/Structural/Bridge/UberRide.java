package Structural.Bridge;

// concrete abstraction layer : UberRide
public class UberRide implements NavigationSystem{

    private String driverName;
    private NavigationImpl navigationImpl;

    public UberRide(String driverName){
        this.driverName = driverName;
    }

    public void setNavigationImpl(NavigationImpl impl){
        this.navigationImpl = impl;
    }

    @Override
    public void navigate(String destination) {
        System.out.println("Uber ride with " + driverName + " to " + destination + " using ");
        navigationImpl.navigateTo(destination);
    }
}
