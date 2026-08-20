package DecoratorPattern;

public class main {
    public static void main(String[] args) {
        Coffee coffee = new BasicCoffee();
        coffee = new Chocolate(coffee);
        coffee = new Cold(coffee);

        System.out.println(coffee.getDescription());
        System.out.println(coffee.getCost());
    }
}
