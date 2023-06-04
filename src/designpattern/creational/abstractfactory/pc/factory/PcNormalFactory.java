package designpattern.creational.abstractfactory.pc.factory;

import designpattern.creational.abstractfactory.pc.product.button.PcButtonProduct;
import designpattern.creational.abstractfactory.pc.product.button.PcNormalButton;
import designpattern.creational.abstractfactory.pc.product.textarea.PcNormalTextarea;
import designpattern.creational.abstractfactory.pc.product.textarea.PcTextareaProduct;

public class PcNormalFactory implements PcDisplayFactory {
    @Override
    public PcButtonProduct createButton() {
        return new PcNormalButton();
    }

    @Override
    public PcTextareaProduct createTextarea() {
        return new PcNormalTextarea();
    }
}
