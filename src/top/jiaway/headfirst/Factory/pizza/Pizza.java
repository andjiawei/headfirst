package top.jiaway.headfirst.Factory.pizza;

import top.jiaway.headfirst.Factory.ingredient.*;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class Pizza {

    /*String name;
    String dough;//生面团
    String sauce;//调味酱 沙司
    Veggies veggies[];//蔬菜
    Cheese cheese;
    Pepperoni pepperoni;//意大利腊肉肠
    Clams clam;//蛤蜊
    ArrayList topping = new ArrayList();//一套佐料*/

    /*public void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough");
        System.out.println("Adding sauce:");
        System.out.println("Adding topping");
        for (int i = 0;i < topping.size();i++){
            System.out.println("   " + topping.get(i));
        }
    }*/

    String name;
    Dough dough;//生面团
    Sauce sauce;//调味酱 沙司
    Veggies veggies[];//蔬菜
    Cheese cheese;
    Pepperoni pepperoni;//意大利腊肉肠
    Clams clam;//蛤蜊
    ArrayList topping = new ArrayList();//一套佐料

    public abstract void prepare();

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Please pizza in official PizzaStore box");
    }

    public String getName(){
        return name;
    }

    public void setName(String name){ this.name = name; }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", dough='" + dough + '\'' +
                ", sauce='" + sauce + '\'' +
                ", veggies=" + Arrays.toString(veggies) +
                ", cheese=" + cheese +
                ", pepperoni=" + pepperoni +
                ", clam=" + clam +
                ", topping=" + topping +
                '}';
    }
}
