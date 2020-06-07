package top.jiaway.headfirst.Iterator;

import java.util.ArrayList;

public class DinnerMenu {

    static final int MAX_ITEMS = 6 ;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinnerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
        addItem("1KB'S breakfast","1 egg and toast" ,true,2.99);
        addItem("2RP'S breakfast","2 egg and toast" ,true,2.99);
        addItem("3BP'S breakfast","3 egg and toast" ,true,2.99);
    }

    public void addItem(String name, String desc, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name,desc,vegetarian,price);

        if( numberOfItems >= MAX_ITEMS ){
            System.err.println("sorry,menu is full");
        }else{
            menuItems[numberOfItems] = menuItem;
            numberOfItems = numberOfItems + 1;
        }

    }

    public MenuItem[] getMenuItems(){
        return menuItems;
    }

    /**
     * 遍历时，由于数组和集合不同 因此创建迭代器
     */

    public Iterator createIterator(){
        return new DinerMenuIterator(menuItems);
    }



}
