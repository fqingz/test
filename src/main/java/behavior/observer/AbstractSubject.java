package behavior.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Fang Qing
 * @date 2019/5/30 16:26
 */
public abstract class AbstractSubject implements Subject {

    private List<Observer> list = new ArrayList<> ();
    @Override
    public void add(Observer observer) {
        list.add (observer);
    }

    @Override
    public void del(Observer observer) {
        list.remove (observer);
    }

    @Override
    public void notifyObservers() {
        list.forEach (Observer::update);
    }
}
