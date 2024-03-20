package Factory.AbstractFactory.UI;

public class MacbookTextBox implements ITextBox{
    @Override
    public void setText() {
        System.out.println("Macbook text is set");
    }
}
