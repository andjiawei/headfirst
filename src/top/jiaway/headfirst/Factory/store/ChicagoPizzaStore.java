package top.jiaway.headfirst.Factory.store;

import top.jiaway.headfirst.Factory.pizza.ChicagoStyleCheesePizza;
import top.jiaway.headfirst.Factory.pizza.ChicagoStyleVeggiePizza;
import top.jiaway.headfirst.Factory.pizza.Pizza;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    protected Pizza cratePizza(String type) {

        if(type.equals("cheese")){
            return new ChicagoStyleCheesePizza();
        }else if(type.equals("veggie")){
            return new ChicagoStyleVeggiePizza();
        }else{
            return null;
        }
    }
}
