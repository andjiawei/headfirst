package top.jiaway.headfirst.Decorator;


/**
 * 调味料
 */
public abstract class CondimentDecorator extends Beverage {


    /**
     * 所有的调味料 装饰类必须重新实现
     * @return
     */
    public abstract String getDescription();


}
