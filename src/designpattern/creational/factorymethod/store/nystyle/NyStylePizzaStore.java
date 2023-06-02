package designpattern.creational.factorymethod.store.nystyle;

import designpattern.creational.factorymethod.pizza.Pizza;
import designpattern.creational.factorymethod.pizza.chicagostyle.ChicagoCheesePizza;
import designpattern.creational.factorymethod.pizza.chicagostyle.ChicagoVeggiePizza;
import designpattern.creational.factorymethod.pizza.nystyle.NyCheesePizza;
import designpattern.creational.factorymethod.pizza.nystyle.NyVeggiePizza;
import designpattern.creational.factorymethod.store.PizzaStore;

public class NyStylePizzaStore extends PizzaStore {
    @Override
    public Pizza orderPizza(String pizzaType) {
        Pizza pizza = null;
        switch (pizzaType) {
            case "cheese":
                pizza = new NyCheesePizza();
            case "veggie":
                pizza = new NyVeggiePizza();
            default:
                pizza = new NyCheesePizza();
        }
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        System.out.println("please enjoy your pizza\n");
        return pizza;
    }
}
