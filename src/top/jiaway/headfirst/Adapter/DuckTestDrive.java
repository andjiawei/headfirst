package top.jiaway.headfirst.Adapter;

public class DuckTestDrive {

    public static void main(String[] args) {

        MallarDuck duck = new MallarDuck();

        WildTurkey turkey = new WildTurkey();
        // 使用adapter 转换类型
        Duck turKeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("The Turkey says...");

        turkey.gobble();
        turkey.fly();

        System.out.println("\n The TurkeyAdapter says ...");
        testDuck(turKeyAdapter);

    }

    private static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }

}
