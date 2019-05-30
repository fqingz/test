package behavior.iterator;

/**
 * @author Fang Qing
 * @date 2019/5/30 16:41
 */
public interface Iterator {

    Object previous();
    Object next();
    Boolean hasNext();
    Object first();

}
