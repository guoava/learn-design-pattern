package designpattern.behavioral.strategy.test;


import designpattern.behavioral.strategy.Duck;
import designpattern.behavioral.strategy.fly.impl.JetFly;
import designpattern.behavioral.strategy.quack.impl.SimpleQuack;

public class RedHeadDuck extends Duck {
    @Override
    public void display() {
        System.out.println("Hi, i am RedHeadDuck");
    }

    public static void main(String[] args) {
       try {
           RedHeadDuck redHeadDuck = new RedHeadDuck();
           redHeadDuck.setiFlyBehavior(new JetFly());
           redHeadDuck.setiQuackBehavior(new SimpleQuack());
           redHeadDuck.display();
           redHeadDuck.fly();
           redHeadDuck.quack();
       }catch (Exception e){
           e.printStackTrace();
       }
    }
}

