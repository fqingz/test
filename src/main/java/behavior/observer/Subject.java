package behavior.observer;

/**
 * @author Fang Qing
 * @date 2019/5/30 16:24
 */
public interface Subject {

    void add(Observer observer);
    void del(Observer observer);
    void notifyObservers();
    void operation();
}
