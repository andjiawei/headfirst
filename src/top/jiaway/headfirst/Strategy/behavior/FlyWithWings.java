package top.jiaway.headfirst.Strategy.behavior;

/**
 * 给会飞的真鸭子使用
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
