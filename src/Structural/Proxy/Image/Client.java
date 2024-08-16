package Structural.Proxy.Image;

public class Client {

    public static void main(String[] args) {

        Image image = new ProxyImage("test_image.jpg");

        // Image will be loaded from disk and displayed.
        image.display();

        // Image will not be loaded from disk again, as it's already created.
        image.display();
    }
}
