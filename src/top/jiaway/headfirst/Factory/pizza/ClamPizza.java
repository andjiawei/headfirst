package top.jiaway.headfirst.Factory.pizza;

import top.jiaway.headfirst.Factory.factory.PizzaIngredientFactory;
import top.jiaway.headfirst.Factory.ingredient.Clams;

public class ClamPizza extends Pizza {

    PizzaIngredientFactory ingredientFactory;

    public ClamPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name );
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        clam = ingredientFactory.createClam();//新增 蛤蜊
    }
}
