package Decorator.after;

public class MilkDecorator implements Coffee {
    private Coffee decoratedCoffee;

    public MilkDecorator(Coffee coffee) {
        this.decoratedCoffee = coffee;
    }

    public String getDescription() {
        return decoratedCoffee.getDescription() + ", milk";
    }

    public double getCost() {
        return decoratedCoffee.getCost() + 1.5;
    }
}
