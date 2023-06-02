package designpattern.creational.factorymethod.pizza.nystyle;

import designpattern.creational.factorymethod.pizza.Pizza;

import java.math.BigDecimal;

public class NyVeggiePizza extends Pizza {
    public NyVeggiePizza() {
        this.name = "NyVeggiePizza";
        this.price = new BigDecimal("11");
    }
}
