package top.jiaway.headfirst.Factory;

import top.jiaway.headfirst.Factory.pizza.Pizza;
import top.jiaway.headfirst.Factory.store.ChicagoPizzaStore;
import top.jiaway.headfirst.Factory.store.NYPizzaStore;
import top.jiaway.headfirst.Factory.store.PizzaStore;

public class PizzaTestDrive {

    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " +pizza.getName() + "\n" );
        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " +pizza.getName() + "\n" );
    }

}
