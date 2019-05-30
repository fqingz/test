package behavior.iterator;

/**
 * @author Fang Qing
 * @date 2019/5/30 16:40
 */
public interface Collection {

    Iterator iterator();

    Object get(int i);

    int size();
}
