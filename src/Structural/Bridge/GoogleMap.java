package Structural.Bridge;

public class GoogleMap implements NavigationImpl{

    @Override
    public void navigateTo(String destination) {
        System.out.println("Google Map");
    }
}
