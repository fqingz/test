package behavior.observer;

/**
 * @author Fang Qing
 * @date 2019/5/30 15:37
 */
public class Test {

    public static void main(String[] args) {
        MySubject mySubject = new MySubject ();
        mySubject.add (new Observer1 ());
        mySubject.add (new Observer2 ());
        mySubject.operation ();
    }
}
