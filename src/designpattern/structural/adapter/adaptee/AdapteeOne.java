package designpattern.structural.adapter.adaptee;

public class AdapteeOne implements IAdaptee{
    @Override
    public void specificRequest() {
        System.out.println("Hi i am AdapteeOne");
    }
}
