package top.jiaway.headfirst.Strategy.behavior;

/**
 * 真鸭子叫
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("ga ga ga");
    }

}
