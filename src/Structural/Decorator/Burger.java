package Structural.Decorator;

public class Burger implements FoodItem{

    @Override
    public int getPrice() {
        return 100;
    }

    @Override
    public String getDescription() {
        return "Burger";
    }
}
