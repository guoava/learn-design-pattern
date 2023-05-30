package designpattern.structural.decorator.beverage;

/**
 * concrete component
 */
public class Tea implements IBeverage{
    @Override
    public int cost() {
        return 50;
    }
}
