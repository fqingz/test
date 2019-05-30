package behavior.iterator;

/**
 * @author Fang Qing
 * @date 2019/5/30 16:44
 */
public class MyCollection implements Collection {

    private String[] str = {"A","B","C","D","E"};

    @Override
    public Iterator iterator() {
        return new MyIterator (this);
    }

    @Override
    public Object get(int i) {
        return str[i];
    }

    @Override
    public int size() {
        return str.length;
    }
}
