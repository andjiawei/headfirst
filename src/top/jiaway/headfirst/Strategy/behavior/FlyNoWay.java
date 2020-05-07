package top.jiaway.headfirst.Strategy.behavior;

/**
 * 给不会飞的橡皮鸭使用
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
