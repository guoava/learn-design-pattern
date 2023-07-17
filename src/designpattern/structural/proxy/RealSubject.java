package designpattern.structural.proxy;

public class RealSubject implements ISubject {
    @Override
    public int cost() {
        return 15;
    }
}
