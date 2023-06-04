package designpattern.creational.abstractfactory.pc.product.button;

public class PcNormalButton implements PcButtonProduct {
    @Override
    public void display() {
        System.out.println( " PcNormalButton is showing on screen.");
    }
}
