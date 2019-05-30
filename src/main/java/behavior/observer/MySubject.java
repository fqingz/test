package behavior.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Fang Qing
 * @date 2019/5/30 15:39
 */
public class MySubject extends AbstractSubject {

    @Override
    public void operation() {
        System.out.println ("update MySubject!" );
        notifyObservers ();
    }
}
