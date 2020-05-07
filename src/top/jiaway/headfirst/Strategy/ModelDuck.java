package top.jiaway.headfirst.Strategy;

import top.jiaway.headfirst.Strategy.behavior.FlyNoWay;
import top.jiaway.headfirst.Strategy.behavior.Quack;

/**
 * 模型鸭
 * 刚开始不会飞
 * 我们可以改造成为会飞的鸭子
 */
public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    public void display(){
        System.out.println("I'm  a model duck");
    }
}