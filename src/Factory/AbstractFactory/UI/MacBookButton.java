package Factory.AbstractFactory.UI;

public class MacBookButton implements IButton{
    @Override
    public void setButton() {
        System.out.println("MacBook button is pressed");
    }
}
