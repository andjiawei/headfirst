package top.jiaway.headfirst.Iterator;

public class Waiteress {

    DinnerMenu dinnerMenu;
    PancakeHouseMenu pancakeHouseMenu;

    public Waiteress(DinnerMenu dinnerMenu, PancakeHouseMenu pancakeHouseMenu) {
        this.dinnerMenu = dinnerMenu;
        this.pancakeHouseMenu = pancakeHouseMenu;
    }

    /**
     * 统一打印的方法 且封装内部细节
     */
    public void printMenu(){
        Iterator pancakeHouseMenuIterator = pancakeHouseMenu.createIterator();
        Iterator dinnerMenuIterator = dinnerMenu.createIterator();

        printMenuIterator(dinnerMenuIterator);
        printMenuIterator(pancakeHouseMenuIterator);

    }

    private void printMenuIterator(Iterator iterator) {
        while (iterator.hasNext()){
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.println(menuItem.getDescription() + menuItem.getName() + menuItem.getPrice() );
        }

    }
}
