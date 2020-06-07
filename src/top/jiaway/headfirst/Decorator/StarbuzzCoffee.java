package top.jiaway.headfirst.Decorator;

public class StarbuzzCoffee {

    public static void main(String[] args) {
        Beverage espresso = new Espresso();//蒸馏咖啡
        // 订一杯蒸馏咖啡的价格
        System.out.println(espresso.getDescription()+"的价格是:"+espresso.cost());

        // 烘焙咖啡 + 两倍摩卡 + 奶泡
        Beverage darkRoast = new DarkRoast();//深烘焙咖啡
        darkRoast= new Mocha(darkRoast);// 加上配料 摩卡
        darkRoast = new Mocha(darkRoast);// 再加摩卡
        darkRoast = new Whip(darkRoast);// 再加奶泡

        System.out.println("第二杯是:"+darkRoast.getDescription()+"的价格是"+darkRoast.cost());
    }
}
