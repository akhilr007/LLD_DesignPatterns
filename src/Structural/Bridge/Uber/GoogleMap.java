package Structural.Bridge.Uber;

// concrete implementation
public class GoogleMap implements NavigationImpl {

    @Override
    public void navigateTo(String destination) {
        System.out.println("Google Map");
    }
}
