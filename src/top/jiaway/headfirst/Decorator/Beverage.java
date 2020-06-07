package top.jiaway.headfirst.Decorator;


/**
 * 饮料
 */
public abstract class Beverage {

    String description = "Unknown Beverage";

    public String getDescription(){
        return description;
    }

    /**
     * 饮料的具体价格
     * @return
     */
    public abstract double cost();


}
