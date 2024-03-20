package Factory.AbstractFactory.UI;

import java.util.Scanner;

public class AbstractFactoryMain {
    public static void main(String[] args) {
        System.out.println("Please Enter the type of OS: ");
        Scanner scanner = new Scanner(System.in);
        String osType = scanner.nextLine();
        scanner.close();

        IFactory factory = GUIAbstractFactory.createFactory(osType);
        factory.createButton().setButton();
        factory.createTextBox().setText();
    }
}
