package top.jiaway.headfirst.Decorator;

/**
 * 蒸馏咖啡
 */
public class Espresso extends Beverage {

    public Espresso(){
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
