package designpattern.behavioral.strategy.quack.impl;


import designpattern.behavioral.strategy.quack.IQuackBehavior;

public class MuteQuack implements IQuackBehavior {
    @Override
    public void quack() {
        System.out.println("...");
    }
}
