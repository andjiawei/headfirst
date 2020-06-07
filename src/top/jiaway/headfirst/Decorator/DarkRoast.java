package top.jiaway.headfirst.Decorator;

/**
 * 深烘焙的咖啡
 */
public class DarkRoast extends  Beverage{

    public DarkRoast() {
        description = "DarkRoast Coffee";
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
