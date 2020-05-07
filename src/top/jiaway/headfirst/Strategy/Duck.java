package top.jiaway.headfirst.Strategy;

import top.jiaway.headfirst.Strategy.behavior.FlyBehavior;
import top.jiaway.headfirst.Strategy.behavior.QuackBehavior;

public abstract class Duck {

    /**
     * 设计原则：多用组合，少用继承
     * 飞行行为是动态的，可能会变的，因此抽成多个接口的组合，而不是让Duck类继承
     */
    FlyBehavior flyBehavior;

    /**
     * 每个鸭子的叫声不同，抽象成接口
     */
    QuackBehavior quackBehavior;

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }


    public void performFly(){
        //委托给行为类
        flyBehavior.fly();
    }

    public void performQuack(){
        //委托给行为类
        quackBehavior.quack();
    }

    /**
     * 游泳行为都相同
     */
    public void swim(){
        System.out.println("All ducks float");
    }

    /**
     * 每个鸭子的外观不同 留给子类实现
     */
    public abstract void display();

}
