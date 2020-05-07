package top.jiaway.headfirst.Strategy.behavior;

/**
 * 橡皮鸭子叫
 */
public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("zi zi zi");
    }
}
