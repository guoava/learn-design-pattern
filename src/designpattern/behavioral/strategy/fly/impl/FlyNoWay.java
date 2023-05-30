package designpattern.behavioral.strategy.fly.impl;


import designpattern.behavioral.strategy.fly.IFlyBehavior;

public class FlyNoWay implements IFlyBehavior {
    @Override
    public void fly() {
        System.out.println("no wings cant fly");
    }
}
