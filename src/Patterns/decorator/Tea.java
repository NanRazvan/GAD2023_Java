package Patterns.decorator;

public class Tea implements Beverage{


    @Override
    public String getDescription() {
        return "Tea";
    }

    @Override
    public Integer getPrice() {
        return 10;
    }
}
