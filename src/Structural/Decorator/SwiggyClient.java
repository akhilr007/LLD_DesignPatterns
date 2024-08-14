package Structural.Decorator;

public class SwiggyClient {
    public static void main(String[] args) {

        FoodItem pizzaOrder = new Pizza();
        FoodItem burgerOrder = new Burger();

        pizzaOrder = new ExtraCheeseDecorator(pizzaOrder, 20);
        pizzaOrder = new ExtraToppingsDecorator(pizzaOrder, 10);

        burgerOrder = new ExtraToppingsDecorator(burgerOrder, 10);

        System.out.println("Description of pizza order: " + pizzaOrder.getDescription());
        System.out.println("Price of pizza order: " + pizzaOrder.getPrice());

        System.out.println("Description of burger order: " + burgerOrder.getDescription());
        System.out.println("Price of burger order: " + burgerOrder.getPrice());
    }
}
