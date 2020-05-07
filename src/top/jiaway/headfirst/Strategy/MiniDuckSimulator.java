package top.jiaway.headfirst.Strategy;

import top.jiaway.headfirst.Strategy.behavior.FlyRocketPowered;

public class MiniDuckSimulator {

    public static void main(String[] args) {
//        MallardDuck mallardDuck = new MallardDuck();
//        mallardDuck.performFly();
//        mallardDuck.performQuack();

        ModelDuck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }

}
