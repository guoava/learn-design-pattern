package designpattern.behavioral.strategy.fly.impl;


import designpattern.behavioral.strategy.fly.IFlyBehavior;

public class JetFly implements IFlyBehavior {
    @Override
    public void fly() {
        System.out.println("Jet flying .....");
    }
}
