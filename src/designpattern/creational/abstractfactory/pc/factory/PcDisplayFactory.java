package designpattern.creational.abstractfactory.pc.factory;

import designpattern.creational.abstractfactory.pc.product.button.PcButtonProduct;
import designpattern.creational.abstractfactory.pc.product.textarea.PcTextareaProduct;

public interface PcDisplayFactory {

    public PcButtonProduct createButton();

    public PcTextareaProduct createTextarea();

}
