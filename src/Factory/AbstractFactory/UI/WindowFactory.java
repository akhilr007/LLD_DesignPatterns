package Factory.AbstractFactory.UI;

public class WindowFactory implements IFactory{
    @Override
    public IButton createButton() {
        return new WindowButton();
    }

    @Override
    public ITextBox createTextBox() {
        return new WindowTextBox();
    }
}
