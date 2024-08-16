package Structural.Bridge;

public class AppleMap implements NavigationImpl{

    @Override
    public void navigateTo(String destination) {
        System.out.println("Apple Map");
    }
}
