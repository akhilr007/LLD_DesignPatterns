package Creational.Factory.AbstractFactory.UI;

public class WindowTextBox implements ITextBox{
    @Override
    public void setText() {
        System.out.println("Window TextBox is set");
    }
}
