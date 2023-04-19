package patterns.decorator;

public class Main {
    public static void main(String[] args) {

        Beverage coffeeWhitMilk = new Coffee();
        System.out.println(coffeeWhitMilk.getDescription());


        coffeeWhitMilk = new Milk(coffeeWhitMilk);
        System.out.println(coffeeWhitMilk.getDescription());

    }
}
