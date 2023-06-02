package designpattern.creational.factorymethod.pizza;

import java.math.BigDecimal;

public abstract class Pizza {

    protected String name;
    protected BigDecimal price;

    public void prepare() {
        System.out.println("name = " + name);
        System.out.println("price = " + price.toPlainString());
    }

    public void bake() {
        System.out.println("Bake for 25 minutes");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box( ) {
        if (name == null || "".equals(name)) {
            name = "official PizzaStore";
        }
        System.out.println("Place pizza in " + name + " Box");
    }
}
