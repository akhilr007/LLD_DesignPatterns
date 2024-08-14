package Structural.Decorator;

// concrete component
public class Pizza implements FoodItem {

    @Override
    public String getDescription() {
        return "Pizza";
    }

    @Override
    public int getPrice() {
        return 200;
    }
}
