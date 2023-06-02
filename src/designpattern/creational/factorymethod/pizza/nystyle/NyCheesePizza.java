package designpattern.creational.factorymethod.pizza.nystyle;

import designpattern.creational.factorymethod.pizza.Pizza;

import java.math.BigDecimal;

public class NyCheesePizza extends Pizza {
    public NyCheesePizza() {
        this.name = "NyCheesePizza";
        this.price = new BigDecimal("23");
    }
}
