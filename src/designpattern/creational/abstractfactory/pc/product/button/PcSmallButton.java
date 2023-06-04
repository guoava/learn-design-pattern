package designpattern.creational.abstractfactory.pc.product.button;

public class PcSmallButton implements PcButtonProduct {
    @Override
    public void display() {
        System.out.println( " PcSmallButton is showing on screen.");
    }
}
