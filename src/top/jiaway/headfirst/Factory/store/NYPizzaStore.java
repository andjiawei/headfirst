package top.jiaway.headfirst.Factory.store;

import top.jiaway.headfirst.Factory.factory.NYPizzaIngredientFactory;
import top.jiaway.headfirst.Factory.factory.PizzaIngredientFactory;
import top.jiaway.headfirst.Factory.ingredient.Veggies;
import top.jiaway.headfirst.Factory.pizza.*;

public class NYPizzaStore  extends  PizzaStore{
    @Override
    protected Pizza cratePizza(String type) {
        Pizza pizza = null;

        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        if(type.equals("cheese")){
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        }else if(type.equals("veggie")){
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("New York Style Veggie Pizza");
        }

        return pizza;
    }
}
