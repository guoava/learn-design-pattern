package designpattern.structural.decorator.beverage;

/**
 * concrete component
 */
public class Coffee implements IBeverage {
    @Override
    public int cost() {
        return 10;
    }
}
