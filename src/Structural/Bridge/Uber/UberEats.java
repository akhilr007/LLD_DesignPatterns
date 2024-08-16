package Structural.Bridge.Uber;

// concrete abstraction - Uber Eats
public class UberEats implements NavigationSystem {

    private String restaurantName;
    private NavigationImpl navigationImpl;

    public UberEats(String restaurantName){
        this.restaurantName = restaurantName;
    }

    public void setNavigationImpl(NavigationImpl impl){
        this.navigationImpl = impl;
    }

    @Override
    public void navigate(String destination) {
        System.out.println("Uber Eats delivery from " + restaurantName + " to " + destination + " using ");
        navigationImpl.navigateTo(destination);
    }
}
