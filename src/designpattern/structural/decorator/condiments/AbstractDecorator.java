package designpattern.structural.decorator.condiments;


import designpattern.structural.decorator.beverage.IBeverage;

/**
 * decorator
 */
public abstract class AbstractDecorator  implements IBeverage {

    @Override
    public int cost() {
        return 0;
    }
}
