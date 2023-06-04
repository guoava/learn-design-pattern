package designpattern.creational.abstractfactory;

import designpattern.creational.abstractfactory.ios.factory.IosNormalFactory;
import designpattern.creational.abstractfactory.ios.factory.IosSmallFactory;
import designpattern.creational.abstractfactory.ios.product.button.IosButtonProduct;
import designpattern.creational.abstractfactory.ios.product.textarea.IosTextareaProduct;
import designpattern.creational.abstractfactory.pc.factory.PcNormalFactory;
import designpattern.creational.abstractfactory.pc.factory.PcSmallFactory;
import designpattern.creational.abstractfactory.pc.product.button.PcButtonProduct;
import designpattern.creational.abstractfactory.pc.product.textarea.PcTextareaProduct;

public class AbstractFactoryTest {

    public static void main(String[] args) {

        // 1.1 create small components for IOS (abstract class )
        IosSmallFactory iosSmallFactory = new IosSmallFactory();
        IosButtonProduct iosButton = iosSmallFactory.crateButton();
        IosTextareaProduct iosTextarea = iosSmallFactory.crateTextarea();
        iosButton.display();
        iosTextarea.display();


        // 1.2 create normal components for IOS (abstract class )
        IosNormalFactory iosNormalFactory = new IosNormalFactory();
        IosButtonProduct iosButton1 = iosNormalFactory.crateButton();
        IosTextareaProduct iosTextarea1 = iosNormalFactory.crateTextarea();
        iosButton1.display();
        iosTextarea1.display();

        // 2.1 create normal components for Pc (interface )
        PcNormalFactory pcNormalFactory = new PcNormalFactory();
        PcButtonProduct pcButton = pcNormalFactory.createButton();
        PcTextareaProduct pcTextarea = pcNormalFactory.createTextarea();
        pcButton.display();
        pcTextarea.display();


        // 2.2 create small components for Pc (interface )
        PcSmallFactory pcSmallFactory = new PcSmallFactory();
        PcButtonProduct pcButton1 = pcSmallFactory.createButton();
        PcTextareaProduct pcTextarea1 = pcSmallFactory.createTextarea();
        pcButton1.display();
        pcTextarea1.display();
    }

}
