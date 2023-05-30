package designpattern.behavioral.strategy;


import designpattern.behavioral.strategy.fly.IFlyBehavior;
import designpattern.behavioral.strategy.quack.IQuackBehavior;

/**
 * Strategy Pattern
 * 1. Identify the aspects of your application that vary and separate them from what stays the same.
 * Take the parts that vary and encapsulate them, so that later you can alter or extends the parts
 * that vary without affecting those that don`t.
 * 2. Program to an interface,not an implementation.
 * 3. Favor composition over inheritance. (Using composition gives you a lot more flexibility)
 */
public abstract class Duck {

    protected IFlyBehavior iFlyBehavior;
    protected IQuackBehavior iQuackBehavior;

    public void quack() {
        iQuackBehavior.quack();
    }

    public void fly() {
        iFlyBehavior.fly();
    }

    public abstract void display();

    public void setiFlyBehavior(IFlyBehavior iFlyBehavior) {
        this.iFlyBehavior = iFlyBehavior;
    }

    public void setiQuackBehavior(IQuackBehavior iQuackBehavior) {
        this.iQuackBehavior = iQuackBehavior;
    }
}
