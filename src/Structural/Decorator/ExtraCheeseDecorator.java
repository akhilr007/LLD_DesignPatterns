package Structural.Decorator;

public class ExtraCheeseDecorator extends Decorator{

    private final int extraCheesePrice;

    public ExtraCheeseDecorator(FoodItem item, int price) {
        super(item);
        this.extraCheesePrice = price;
    }

    public String getDescription(){
        return foodItem.getDescription() + " with extra cheese";
    }

    public int getPrice(){
        return foodItem.getPrice() + this.extraCheesePrice;
    }
}
