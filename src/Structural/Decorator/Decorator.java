package Structural.Decorator;

// decorator interface
public abstract class Decorator implements FoodItem {

    protected FoodItem foodItem;

    public Decorator(FoodItem item) {
        this.foodItem = item;
    }
}
