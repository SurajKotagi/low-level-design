package DecoratorPattern;

public class Cold extends CoffeeDecorator {

    public Cold(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + ", Cold";
    }

    @Override
    public double getCost() {
        return decoratedCoffee.getCost() + 2;
    }

}
