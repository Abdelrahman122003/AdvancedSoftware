package DesignPattern.IteratorPattern;
public class DinerMenuIterator implements MyIteratorPattern{
    MenuItem[] list;
    int position = 0;
    public DinerMenuIterator(MenuItem[] list) {
        this.list = list;
    }
    public Object next() {
        return list[position++];
    }
    public boolean hasNext() {
        // position >= MenuItem.length()
        if (position >= list.length || list[position] == null) {
            return false;
        } else {
            return true;
        }
    }
    
    public void remove() {
    if (position <= 0) {
        throw new IllegalStateException
        ("You can remove an item until you ve done at least one next()");
    }
    if (list[position-1] != null) {
        for (int i = position-1; i < (list.length-1); i++) {
            list[i] = list[i+1];
        }
        list[list.length-1] = null;
    }
    }
}