package Decorator.before;

public class Main {
    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        System.out.println(coffee.getDescription() + " $" + coffee.getCost());
    }
}