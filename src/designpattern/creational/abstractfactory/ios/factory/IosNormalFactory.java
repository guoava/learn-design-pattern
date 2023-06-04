package designpattern.creational.abstractfactory.ios.factory;

import designpattern.creational.abstractfactory.ios.product.button.IosButtonProduct;
import designpattern.creational.abstractfactory.ios.product.button.IosNormalButton;
import designpattern.creational.abstractfactory.ios.product.textarea.IosNormalTextarea;
import designpattern.creational.abstractfactory.ios.product.textarea.IosTextareaProduct;

public class IosNormalFactory implements IosDisplayFactory {

    @Override
    public IosTextareaProduct crateTextarea() {
        return new IosNormalTextarea();
    }

    @Override
    public IosButtonProduct crateButton() {
        return new IosNormalButton();
    }
}
