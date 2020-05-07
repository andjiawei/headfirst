package top.jiaway.headfirst.Strategy;

import top.jiaway.headfirst.Strategy.behavior.FlyWithWings;
import top.jiaway.headfirst.Strategy.behavior.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
