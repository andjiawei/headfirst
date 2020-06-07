package top.jiaway.headfirst.Factory.factory;

import top.jiaway.headfirst.Factory.ingredient.*;

public interface PizzaIngredientFactory {

    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Veggies[] createVeggies();
    Pepperoni createPepperoni();
    Clams createClam();

}
