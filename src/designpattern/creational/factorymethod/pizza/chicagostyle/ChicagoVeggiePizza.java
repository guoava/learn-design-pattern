package designpattern.creational.factorymethod.pizza.chicagostyle;

import designpattern.creational.factorymethod.pizza.Pizza;

import java.math.BigDecimal;

public class ChicagoVeggiePizza extends Pizza {
    public ChicagoVeggiePizza() {
        this.name = "ChicagoVeggiePizza";
        this.price = new BigDecimal("10");
    }
}
