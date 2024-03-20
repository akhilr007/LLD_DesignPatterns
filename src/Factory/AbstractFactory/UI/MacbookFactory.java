package Factory.AbstractFactory.UI;

public class MacbookFactory implements IFactory{

    @Override
    public IButton createButton() {
        return new MacBookButton();
    }

    @Override
    public ITextBox createTextBox() {
        return new MacbookTextBox();
    }
}
