package DecoratorPattern;

public class Chocolate extends CoffeeDecorator {

    public Chocolate(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + ", Chocolate";
    }

    @Override
    public double getCost() {
        return decoratedCoffee.getCost() + 5;
    }

}
