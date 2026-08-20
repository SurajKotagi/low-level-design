package DecoratorPattern;

public class BasicCoffee implements Coffee {

    @Override
    public String getDescription() {
        return "Plain";
    }

    @Override
    public double getCost() {
        return 20;
    }

}
