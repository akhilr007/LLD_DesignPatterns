package Structural.Bridge.Uber;

// concrete implementation
public class AppleMap implements NavigationImpl {

    @Override
    public void navigateTo(String destination) {
        System.out.println("Apple Map");
    }
}
