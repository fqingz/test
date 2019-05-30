package behavior.iterator;

/**
 * @author Fang Qing
 * @date 2019/5/30 16:57
 */
public class MyIterator implements Iterator {

    private Collection collection;
    private int pos = -1;

    public MyIterator(Collection collection) {
        this.collection = collection;
    }

    @Override
    public Object previous() {
        if(pos > 0){
            pos--;
        }
        return collection.get (pos);
    }

    @Override
    public Object next() {
        if(pos<collection.size ()-1){
            pos++;
        }
        return collection.get (pos);
    }

    @Override
    public Boolean hasNext() {
        return pos < collection.size () - 1;
    }

    @Override
    public Object first() {
        pos = 0;
        return collection.get (pos);
    }
}
