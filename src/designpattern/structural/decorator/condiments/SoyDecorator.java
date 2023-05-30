package designpattern.structural.decorator.condiments;


import designpattern.structural.decorator.beverage.IBeverage;

public class SoyDecorator extends AbstractDecorator {

    private IBeverage iBeverage;

    public SoyDecorator(IBeverage iBeverage) {
        this.iBeverage = iBeverage;
    }

    @Override
    public int cost() {
        return iBeverage.cost() + 10 ;
    }
}
