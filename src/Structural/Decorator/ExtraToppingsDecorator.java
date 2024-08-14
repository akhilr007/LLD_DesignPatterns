package Structural.Decorator;

public class ExtraToppingsDecorator extends Decorator{

    private final int extraToppingsPrice;

    public ExtraToppingsDecorator(FoodItem item, int price) {
        super(item);
        this.extraToppingsPrice = price;
    }

    public String getDescription(){
        return foodItem.getDescription() + " with extra toppings";
    }

    public int getPrice(){
        return foodItem.getPrice() + this.extraToppingsPrice;
    }
}
