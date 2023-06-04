package designpattern.creational.abstractfactory.pc.product.textarea;

public class PcSmallTextarea implements PcTextareaProduct {
    @Override
    public void display() {
        System.out.println( " PcSmallTextarea is showing on screen.");
    }
}
