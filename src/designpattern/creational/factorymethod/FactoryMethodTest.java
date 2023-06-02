package designpattern.creational.factorymethod;

import designpattern.creational.factorymethod.store.chicagostyle.ChicagoStyleStore;
import designpattern.creational.factorymethod.store.nystyle.NyStylePizzaStore;

public class FactoryMethodTest {
    public static void main(String[] args) {

        ChicagoStyleStore chicagoStyleStore = new ChicagoStyleStore();
        chicagoStyleStore.orderPizza("cheese");

        NyStylePizzaStore nyStylePizzaStore = new NyStylePizzaStore();
        nyStylePizzaStore.orderPizza("veggie");


    }
}
