package Factory.AbstractFactory.UI;

public interface IFactory {
    IButton createButton();
    ITextBox createTextBox();
}
