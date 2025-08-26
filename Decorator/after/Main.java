package Decorator.after;

public class Main {
    public static void main(String[] args) {
        Coffee coffee = new SimpleCoffee();
        coffee = new MilkDecorator(coffee);

        System.out.println(coffee.getDescription() + " $" + coffee.getCost());
    }
}
