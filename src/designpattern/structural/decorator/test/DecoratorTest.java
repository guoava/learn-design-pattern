package designpattern.structural.decorator.test;


import designpattern.structural.decorator.beverage.Coffee;
import designpattern.structural.decorator.beverage.IBeverage;
import designpattern.structural.decorator.beverage.Tea;
import designpattern.structural.decorator.condiments.MilkDecorator;
import designpattern.structural.decorator.condiments.SoyDecorator;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class DecoratorTest {

    public static void main(String[] args) {

        // coffee cost
        Coffee coffee = new Coffee();
        MilkDecorator milkDecorator = new MilkDecorator(coffee);
        MilkDecorator milkDecorator2 = new MilkDecorator(milkDecorator);
        SoyDecorator soyDecorator = new SoyDecorator(milkDecorator2);
        System.out.println("Coffee total cost is :" + soyDecorator.cost());

        // Tea cost
        Tea tea = new Tea();
        IBeverage beverage = new SoyDecorator(new MilkDecorator(tea));
        System.out.println("Tea total cost is :" + beverage.cost());

        // buffer input stream
        try (
                BufferedInputStream bufIn = new BufferedInputStream(new FileInputStream(""));
        ) {

        } catch (Exception e) {

        }


    }
}
