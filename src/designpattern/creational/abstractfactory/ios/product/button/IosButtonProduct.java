package designpattern.creational.abstractfactory.ios.product.button;

public abstract class IosButtonProduct {

    protected String name;

    public void display() {
        System.out.println(name + " is showing on screen.");
    }

}
