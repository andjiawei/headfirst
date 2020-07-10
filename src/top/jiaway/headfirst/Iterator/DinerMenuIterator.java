package top.jiaway.headfirst.Iterator;

public class DinerMenuIterator implements Iterator<MenuItem> {

    private MenuItem[] menuItems ;
    private int position = 0;

    public DinerMenuIterator(MenuItem[] menuItem) {
        this.menuItems = menuItem;
    }

    @Override
    public boolean hasNext() {
        if (position >= menuItems.length || menuItems[position] == null){
            return false;
        }else{
            return true;
        }
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = menuItems[position];
        position = position + 1;
        return menuItem;
    }
}
