package top.jiaway.headfirst.Iterator;

public class MemuTestDriver {

    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinnerMenu dinnerMenu = new DinnerMenu();
        Waiteress waiteress = new Waiteress(dinnerMenu,pancakeHouseMenu);
        waiteress.printMenu();
    }

}
