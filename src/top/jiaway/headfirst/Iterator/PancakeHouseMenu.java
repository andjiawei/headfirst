package top.jiaway.headfirst.Iterator;

import java.util.ArrayList;

public class PancakeHouseMenu {

    ArrayList<MenuItem> menuItems;

    public PancakeHouseMenu (){
        menuItems = new ArrayList();
        addItem("1KB'S breakfast","1 egg and toast" ,true,2.99);
        addItem("2RP'S breakfast","2 egg and toast" ,true,2.99);
        addItem("3BP'S breakfast","3 egg and toast" ,true,2.99);
    }

    public void addItem(String name, String desc, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name,desc,vegetarian,price);
        menuItems.add(menuItem);
    }


    public ArrayList<MenuItem> getItems(){
        return menuItems;
    }

    public Iterator createIterator(){
        return new PancakeHouseMenuIterator(menuItems);
    }
}
