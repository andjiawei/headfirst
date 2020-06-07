package top.jiaway.headfirst.Factory.store;

import top.jiaway.headfirst.Factory.pizza.Pizza;

public abstract class PizzaStore {

    public Pizza orderPizza(String type){

        Pizza pizza = cratePizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return  pizza;

    }

    protected abstract Pizza cratePizza(String type);
}
