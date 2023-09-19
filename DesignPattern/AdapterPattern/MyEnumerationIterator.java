package DesignPattern.AdapterPattern;
public class MyEnumerationIterator implements MyIterator{
    private MyEnumeration enumer;
    public void MyEnumerationIterator(MyEnumeration e){
        this.enumer = e;
    }
    @Override
    public boolean hasNext() {
        return enumer.hasMoreElements();
    }

    @Override
    public String next() {
        return enumer.nextElement();
    }

    @Override
    public void remove() {
       throw new UnsupportedOperationException("Remove method not used");
    }

}