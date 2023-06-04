package designpattern.creational.abstractfactory.pc.factory;

import designpattern.creational.abstractfactory.pc.product.button.PcButtonProduct;
import designpattern.creational.abstractfactory.pc.product.button.PcSmallButton;
import designpattern.creational.abstractfactory.pc.product.textarea.PcSmallTextarea;
import designpattern.creational.abstractfactory.pc.product.textarea.PcTextareaProduct;

public class PcSmallFactory implements PcDisplayFactory {
    @Override
    public PcButtonProduct createButton() {
        return new PcSmallButton();
    }

    @Override
    public PcTextareaProduct createTextarea() {
        return new PcSmallTextarea();
    }
}
