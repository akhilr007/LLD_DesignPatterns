package Factory.AbstractFactory.UI;

public class WindowButton implements IButton{
    @Override
    public void setButton() {
        System.out.println("Window button is pressed");
    }
}
