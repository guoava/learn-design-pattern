package designpattern.creational.abstractfactory.pc.product.textarea;

public class PcNormalTextarea implements PcTextareaProduct {
    @Override
    public void display() {
        System.out.println( " PcNormalTextarea is showing on screen.");
    }
}
