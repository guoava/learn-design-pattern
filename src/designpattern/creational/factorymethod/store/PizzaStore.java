package designpattern.creational.factorymethod.store;

import designpattern.creational.factorymethod.pizza.Pizza;

public abstract class PizzaStore {

    public abstract Pizza orderPizza(String pizzaType);

}
