package top.jiaway.headfirst.Decorator;

/**
 * 北美流行的黑咖啡
 */
public class HouseBlend  extends  Beverage{

    public HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
