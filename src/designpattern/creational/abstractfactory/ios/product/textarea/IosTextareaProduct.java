package designpattern.creational.abstractfactory.ios.product.textarea;

public abstract class IosTextareaProduct {

    protected String name;

    public void display(){
        System.out.println(name + " is showing on screen.");
    }

}
