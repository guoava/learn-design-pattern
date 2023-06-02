package designpattern.creational.factorymethod.pizza.chicagostyle;

import designpattern.creational.factorymethod.pizza.Pizza;

import java.math.BigDecimal;

public class ChicagoCheesePizza extends Pizza {
    public ChicagoCheesePizza() {
        this.name = "ChicagoCheesePizza";
        this.price = new BigDecimal("20");
    }
}
