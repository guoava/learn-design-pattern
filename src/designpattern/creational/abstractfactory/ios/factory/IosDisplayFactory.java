package designpattern.creational.abstractfactory.ios.factory;

import designpattern.creational.abstractfactory.ios.product.button.IosButtonProduct;
import designpattern.creational.abstractfactory.ios.product.textarea.IosTextareaProduct;

public interface IosDisplayFactory {

    public IosTextareaProduct crateTextarea();

    public IosButtonProduct crateButton();
}
