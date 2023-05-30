package designpattern.structural.decorator.condiments;


import designpattern.structural.decorator.beverage.IBeverage;

public class MilkDecorator extends AbstractDecorator {

    private IBeverage iBeverage;

    public MilkDecorator(IBeverage iBeverage) {
        this.iBeverage = iBeverage;
    }

    @Override
    public int cost() {
        return iBeverage.cost() + 1;
    }
}
