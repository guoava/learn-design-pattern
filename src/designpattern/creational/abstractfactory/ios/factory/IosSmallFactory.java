package designpattern.creational.abstractfactory.ios.factory;

import designpattern.creational.abstractfactory.ios.product.button.IosButtonProduct;
import designpattern.creational.abstractfactory.ios.product.button.IosSmallButton;
import designpattern.creational.abstractfactory.ios.product.textarea.IosSmallTextarea;
import designpattern.creational.abstractfactory.ios.product.textarea.IosTextareaProduct;

public class IosSmallFactory implements IosDisplayFactory {

    @Override
    public IosTextareaProduct crateTextarea() {
        return new IosSmallTextarea();
    }

    @Override
    public IosButtonProduct crateButton() {
        return new IosSmallButton();
    }
}
