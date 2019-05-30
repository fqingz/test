package behavior.observer;

/**
 * @author Fang Qing
 * @date 2019/5/30 15:41
 */
public class Observer1 implements Observer{
    @Override
    public void update() {
        System.out.println ("update Observer1!" );
    }
}
