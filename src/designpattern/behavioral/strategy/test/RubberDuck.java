package designpattern.behavioral.strategy.test;


import designpattern.behavioral.strategy.Duck;
import designpattern.behavioral.strategy.fly.IFlyBehavior;
import designpattern.behavioral.strategy.fly.impl.FlyNoWay;
import designpattern.behavioral.strategy.quack.IQuackBehavior;
import designpattern.behavioral.strategy.quack.impl.SimpleQuack;

public class RubberDuck extends Duck {

    public RubberDuck(IFlyBehavior iFlyBehavior, IQuackBehavior iQuackBehavior) {
        super.iFlyBehavior = iFlyBehavior;
        super.iQuackBehavior = iQuackBehavior;
    }

    @Override
    public void display() {
        System.out.println("Hi,I am RubberDuck");
    }

    public static void main(String[] args) {
        FlyNoWay flyNoWay = new FlyNoWay();
        SimpleQuack simpleQuack = new SimpleQuack();
        RubberDuck rubberDuck = new RubberDuck(flyNoWay, simpleQuack);
        rubberDuck.display();
        rubberDuck.fly();
        rubberDuck.quack();
    }
}

