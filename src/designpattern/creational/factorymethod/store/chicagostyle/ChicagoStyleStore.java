package designpattern.creational.factorymethod.store.chicagostyle;

import designpattern.creational.factorymethod.pizza.Pizza;
import designpattern.creational.factorymethod.pizza.chicagostyle.ChicagoCheesePizza;
import designpattern.creational.factorymethod.pizza.chicagostyle.ChicagoVeggiePizza;
import designpattern.creational.factorymethod.pizza.nystyle.NyCheesePizza;
import designpattern.creational.factorymethod.store.PizzaStore;

public class ChicagoStyleStore extends PizzaStore {

    @Override
    public Pizza orderPizza(String pizzaType) {
        Pizza pizza = null;
        switch (pizzaType) {
            case "cheese":
                pizza = new ChicagoCheesePizza();
            case "veggie":
                pizza = new ChicagoVeggiePizza();
            default:
                pizza = new ChicagoCheesePizza();
        }

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        System.out.println("please enjoy your pizza\n");
        return pizza;
    }
}
